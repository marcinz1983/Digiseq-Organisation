package com.digiseq.digiseqorganisation.DTO.Request;

import com.digiseq.digiseqorganisation.CustomAnnotation.Annotation.ValidPhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(setterPrefix = "with")
public class AddPersonnelRequest {

    @NotNull
    @NotBlank(message = "Please enter your name")
    @Size(min = 1, max = 150)
    private String firstName;

    @NotNull
    @NotBlank(message = "Please enter your last name")
    @Size(min = 1, max = 150)
    private String lastName;


    @NotNull
    @Size(min = 1, max = 150)
    @NotBlank(message = "Please enter your username")
    private String username;

    @NotNull
    @Size(min = 1, max = 50)
    @NotBlank(message = "Please enter your password")
    private String password;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    private String email;


    @NotNull(message = "Phone number cannot be null")
    @ValidPhoneNumber(message = "Please provide a valid phone number")
    private String phoneNumber;


}
