package com.example.hobby.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.example.hobby.BusinessException;
import com.example.hobby.Dto.MemberDto;
import com.example.hobby.Form.ResistMemberForm;
import com.example.hobby.Service.ResistMemberService;

import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResistMemberController {

    // コンストラクタインジェクション
    private ResistMemberService resistMemberService;

    @Autowired
    public ResistMemberController(ResistMemberService resistMemberService) {
        this.resistMemberService = resistMemberService;
    }

    // メンバー登録ページに遷移
    @GetMapping("/resistMember")
    public String resistMember(Model model) {
        ResistMemberForm resistMemberForm = new ResistMemberForm();
        model.addAttribute("resistMemberForm", resistMemberForm);
        return "V001_1_resistMember.html";
    }

    // メンバー登録確認画面に遷移
    @PostMapping("/resistMemberConfirm")
    public String resistMemberConfirm(@Validated ResistMemberForm resistMemberForm, BindingResult result, Model model,
            HttpSession session) {
        // System.out.println(resistMemberForm);

        // 入力エラーチェック
        if (result.hasErrors()) {
            // System.out.println(result.getAllErrors());
            return "V001_1_resistMember.html";
        }

        // パスワードチェック
        if (!resistMemberForm.getMemberPass1().equals(resistMemberForm.getMemberPass2())) {
            model.addAttribute("message", "パスワードが不一致です");
            return "V001_1_resistMember.html";
        }

        // formの入力を格納
        MemberDto memberDto = new MemberDto();
        memberDto.setMemberName(resistMemberForm.getMemberName());
        memberDto.setMemberMail(resistMemberForm.getMemberMail());
        memberDto.setMemberPhone(resistMemberForm.getMemberPhone());
        memberDto.setMemberPost(resistMemberForm.getMemberPost());
        memberDto.setMemberAddress(resistMemberForm.getMemberAddress());
        memberDto.setMemberBirth(resistMemberForm.getMemberBirth());
        memberDto.setMemberRole(resistMemberForm.getMemberRole());
        memberDto.setMemberPass(resistMemberForm.getMemberPass1());

        // model, sessionに格納
        model.addAttribute("memberDto", memberDto);
        session.setAttribute("memberDto", memberDto);

        return "V001_2_resistMemberConfirm.html";
    }

    // メンバー登録確定画面への遷移
    @PostMapping("/resistMemberComplete")
    public String resistMemberComplete(HttpSession session, Model model) {
        // セッションから取り出し
        MemberDto memberDto = (MemberDto) session.getAttribute("memberDto");

        try {
            // 登録
            int result = resistMemberService.resistMemberComplete(memberDto);
            // セッション破棄
            session.removeAttribute("memberDto");

            if (result == 1) { // うまく登録できた場合
                return "V001_3_resistMemberComplete.html";
            }
            // 1以外の値が返ってきた時
            return "V000_0_top.html";

            // 例外発生時
        } catch (BusinessException e) {
            // modelに格納
            model.addAttribute("memberDto", memberDto);
            model.addAttribute("message", e.getMessage());

            return "V001_2_resistMemberConfirm.html";
        }
    }

    // メンバー登録修正
    @GetMapping("/resistMemberRevise")
    public String getMethodName(Model model, HttpSession session) {
        // Formの新規作成
        ResistMemberForm resistMemberForm = new ResistMemberForm();

        // セッションから取り出す
        MemberDto memberDto = (MemberDto) session.getAttribute("memberDto");

        // パスワード以外をformに格納しなおす
        resistMemberForm.setMemberName(memberDto.getMemberName());
        resistMemberForm.setMemberMail(memberDto.getMemberMail());
        resistMemberForm.setMemberPhone(memberDto.getMemberPhone());
        resistMemberForm.setMemberPost(memberDto.getMemberPost());
        resistMemberForm.setMemberAddress(memberDto.getMemberAddress());
        resistMemberForm.setMemberBirth(memberDto.getMemberBirth());
        resistMemberForm.setMemberRole(memberDto.getMemberRole());

        // セッション破棄
        // memberDtoだけ削除
        session.removeAttribute("memberDto");
        // modelに追加
        model.addAttribute("resistMemberForm", resistMemberForm);

        return "V001_1_resistMember.html";
    }
}
