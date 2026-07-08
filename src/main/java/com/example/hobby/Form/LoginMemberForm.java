package com.example.hobby.Form;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginMemberForm {
    

    @NotBlank(message = "※メンバーコードは入力必須項目です")
    private String memberCode;
    
    @NotBlank(message = "※パスワードは入力必須項目です")
    private String memberPass;
    
}
