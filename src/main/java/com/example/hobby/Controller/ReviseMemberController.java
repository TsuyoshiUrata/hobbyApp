package com.example.hobby.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.hobby.BusinessException;
import com.example.hobby.CustomUserDetail;
import com.example.hobby.Dto.MemberDto;
import com.example.hobby.Form.ReviseMemberForm;
import com.example.hobby.Service.MemberListService;
import com.example.hobby.Service.ReviseMemberService;

import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

@Controller
public class ReviseMemberController {

    // コンストラクタインジェクション
    private final ReviseMemberService reviseMemberService;
    private final MemberListService memberListService;

    @Autowired
    public ReviseMemberController(ReviseMemberService reviseMemberService, MemberListService memberListService) {
        this.reviseMemberService = reviseMemberService;
        this.memberListService = memberListService;
    }

    // メンバー修正ページに遷移
    @GetMapping("/reviseMember")
    public String reviseMember(Model model, @AuthenticationPrincipal CustomUserDetail user, HttpSession session) {

        // formを新規作成
        ReviseMemberForm reviseMemberForm = new ReviseMemberForm();

        // メンバー情報を取得
        MemberDto member = memberListService.memberListDetail(user.getMemberDto().getMemberCode());

        // メンバー情報をformに格納
        reviseMemberForm.setMemberAddress(member.getMemberAddress());
        reviseMemberForm.setMemberBirth(member.getMemberBirth());
        reviseMemberForm.setMemberCode(member.getMemberCode());
        reviseMemberForm.setMemberMail(member.getMemberMail());
        reviseMemberForm.setMemberName(member.getMemberName());
        reviseMemberForm.setMemberPhone(member.getMemberPhone());
        reviseMemberForm.setMemberPost(member.getMemberPost());

        // formをmodelに格納
        model.addAttribute("reviseMemberForm", reviseMemberForm);

        // sessionに格納
        model.addAttribute("member", member);
        session.setAttribute("member", member);

        return "V003_1_reviseMember.html";
    }

    // メンバー修正確認ページに遷移
    @GetMapping("/reviseMemberConfirm")
    public String reviseMemberConfirm(@Validated ReviseMemberForm reviseMemberForm, BindingResult result, Model model,
            HttpSession session) {

        // 入力エラーチェック
        if (result.hasErrors()) {
            return "V003_1_reviseMember";
        }

        // セッションから変更前の情報を入手
        MemberDto member = (MemberDto) session.getAttribute("member");
        // 変更チェック
        if (member.getMemberAddress().equals(reviseMemberForm.getMemberAddress()) &&
                member.getMemberName().equals(reviseMemberForm.getMemberName()) &&
                member.getMemberMail().equals(reviseMemberForm.getMemberMail()) &&
                member.getMemberPhone().equals(reviseMemberForm.getMemberPhone()) &&
                member.getMemberPost().equals(reviseMemberForm.getMemberPost()) &&
                member.getMemberBirth().equals(reviseMemberForm.getMemberBirth())) {
            model.addAttribute("message", "変更がありません");
            return "V003_1_reviseMember";
        }

        // formの入力を格納
        MemberDto memberDto = member;
        memberDto.setMemberAddress(reviseMemberForm.getMemberAddress());
        memberDto.setMemberName(reviseMemberForm.getMemberName());
        memberDto.setMemberMail(reviseMemberForm.getMemberMail());
        memberDto.setMemberPhone(reviseMemberForm.getMemberPhone());
        memberDto.setMemberPost(reviseMemberForm.getMemberPost());
        memberDto.setMemberBirth(reviseMemberForm.getMemberBirth());

        // model, sessionに格納
        model.addAttribute("memberDto", memberDto);
        session.setAttribute("memberDto", memberDto);

        return "V003_2_reviseMemberConfirm.html";
    }

    @PostMapping("/reviseMemberComplete")
    public String reviseMemberComplete(Model model, HttpSession session,
            @AuthenticationPrincipal CustomUserDetail user) {

        // セッションから変更情報を格納
        MemberDto memberDto = (MemberDto) session.getAttribute("memberDto");

        try {
            // メンバー情報更新
            int result = reviseMemberService.ReviseMemberComplete(memberDto);

            // セッション破棄
            session.removeAttribute("memberDto");
            session.removeAttribute("member");
            // modelに格納
            model.addAttribute("memberDto", memberDto);

            if (result == 1) { // うまく登録できた場合
                // Securityに保持されているmemberDtoを更新
                user.setMemberDto(memberDto);
                return "V003_3_reviseMemberComplete.html";
            }
            // 1以外の値が返ってきた時
            return "V000_0_top.html";

            // 例外発生時
        } catch (BusinessException e) {
            // modelに格納
            model.addAttribute("memberDto", memberDto);
            model.addAttribute("message", e.getMessage());

            return "V003_2_reviseMemberConfirm.html";
        }
    }


    @GetMapping("/reviseMemberRevise")
    public String reviseMemberRevise(Model model, HttpSession session){

        // formを新規作成
        ReviseMemberForm reviseMemberForm = new ReviseMemberForm();

        // セッションから変更前の情報を入手
        MemberDto memberDto = (MemberDto) session.getAttribute("memberDto");

        // メンバー情報をformに格納
        reviseMemberForm.setMemberAddress(memberDto.getMemberAddress());
        reviseMemberForm.setMemberBirth(memberDto.getMemberBirth());
        reviseMemberForm.setMemberCode(memberDto.getMemberCode());
        reviseMemberForm.setMemberMail(memberDto.getMemberMail());
        reviseMemberForm.setMemberName(memberDto.getMemberName());
        reviseMemberForm.setMemberPhone(memberDto.getMemberPhone());
        reviseMemberForm.setMemberPost(memberDto.getMemberPost());

        // formをmodelに格納
        model.addAttribute("reviseMemberForm", reviseMemberForm);

        return "V003_1_reviseMember.html";
    }

}
