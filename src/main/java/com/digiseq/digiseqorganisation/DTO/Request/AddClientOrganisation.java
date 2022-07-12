package com.digiseq.digiseqorganisation.DTO.Request;


import com.digiseq.digiseqorganisation.model.Personnel;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(setterPrefix = "with")
public class AddClientOrganisation {

    @NotNull
    @Size(min = 1, max = 150)
    private String name;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date registrationDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date expiryDate;

    @NotNull
    private Boolean enabled;

    private List<Personnel> personnel;
}
