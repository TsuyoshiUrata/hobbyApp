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
public class RevisePasswordForm {

    private String memberCode;
    
    private String memberMail;

    private String memberPhone;

    @NotNull(message = "※誕生日は入力必須項目です")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate memberBirth;
    
}
