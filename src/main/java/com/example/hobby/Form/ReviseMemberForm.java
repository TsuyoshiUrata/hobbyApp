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
public class ReviseMemberForm {

    private String memberCode;

    @NotBlank(message = "※氏名は入力必須項目です")
    private String memberName;

    @NotBlank(message = "※メールアドレスは入力必須項目です")
    private String memberMail;

    @NotBlank(message = "※電話番号は入力必須項目です")
    private String memberPhone;

    @NotBlank(message = "※郵便番号は入力必須項目です")
    private String memberPost;

    @NotBlank(message = "※住所は入力必須項目です")
    private String memberAddress;

    @NotNull(message = "※誕生日は入力必須項目です")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate memberBirth;
    
}
