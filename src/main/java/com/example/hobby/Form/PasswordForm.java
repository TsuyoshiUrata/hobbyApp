package com.example.hobby.Form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordForm {
    private String memberCode;
    
    @NotBlank(message = "※パスワードは入力必須項目です")
    private String memberPass1;
    
    @NotBlank(message = "※パスワードを確認してください")
    private String memberPass2;

}
