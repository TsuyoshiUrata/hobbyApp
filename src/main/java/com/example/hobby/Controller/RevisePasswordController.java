package com.example.hobby.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.hobby.BusinessException;
import com.example.hobby.CustomUserDetail;
import com.example.hobby.Dto.MemberDto;
import com.example.hobby.Dto.PasswordDto;
import com.example.hobby.Form.PasswordForm;
import com.example.hobby.Form.RevisePasswordForm;
import com.example.hobby.Service.RevisePasswordService;

@Controller
public class RevisePasswordController {

    // コンストラクタインジェクション
    private final RevisePasswordService revisePasswordService;

    public RevisePasswordController(RevisePasswordService revisePasswordService) {
        this.revisePasswordService = revisePasswordService;
    }

@GetMapping("/revisePassword")
public String revisePassword(@AuthenticationPrincipal CustomUserDetail user, Model model) {

    model.addAttribute("revisePasswordForm", new RevisePasswordForm());
    PasswordForm passwordForm = new PasswordForm();

    if (user != null) {
        passwordForm.setMemberCode(user.getUsername()); // または user.getMemberDto().getMemberCode()
    }
    model.addAttribute("passwordForm", passwordForm);

    return "V005_1_revisePassword";
}

    @GetMapping("/searchMemberByBirth")
    public String searchMemberByBirth(@Validated RevisePasswordForm revisePasswordForm, BindingResult result,
            Model model) {

        // 入力エラーチェック
        if (result.hasErrors()) {
            return "V005_1_revisePassword";
        }

        try { // メンバー情報が見つかる場合
              // Dtoに格納しサービスを呼び出す
            MemberDto memberDto = new MemberDto();
            memberDto.setMemberBirth(revisePasswordForm.getMemberBirth());
            memberDto.setMemberMail(revisePasswordForm.getMemberMail());
            memberDto.setMemberPhone(revisePasswordForm.getMemberPhone());
            memberDto = revisePasswordService.searchMemberByBirth(memberDto);

            model.addAttribute("memberDto", memberDto);
            PasswordForm passwordForm = new PasswordForm();
            passwordForm.setMemberCode(memberDto.getMemberCode()); 
            model.addAttribute("passwordForm", passwordForm);
            return "V005_1_revisePassword";

        } catch (BusinessException e) { // serviceでエラーが出る場合
            model.addAttribute("message", e.getMessage());
            return "V005_1_revisePassword";
        }
    }

    @PostMapping("/revisePasswordComplete")
    public String revisePasswordConfirm(Model model, @Validated PasswordForm passwordForm, BindingResult result) {

        // 入力エラーチェック
        if (result.hasErrors()) {
            return "V005_1_revisePassword";
        }

        // パスワードチェック
        if (!passwordForm.getMemberPass1().equals(passwordForm.getMemberPass2())) {
            model.addAttribute("message", "パスワードが不一致です");
            MemberDto memberDto = new MemberDto();
            memberDto.setMemberCode(passwordForm.getMemberCode());
            model.addAttribute("memberDto", memberDto);
            return "V005_1_revisePassword";
        }

        PasswordDto passwordDto = new PasswordDto();
        passwordDto.setMemberCode(passwordForm.getMemberCode());
        passwordDto.setPassword(passwordForm.getMemberPass1());

        revisePasswordService.revisePasswordComplete(passwordDto);

        return "V005_2_revisePasswordComplete";

    }

}
