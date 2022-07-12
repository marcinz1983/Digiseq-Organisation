package com.digiseq.digiseqorganisation.DTO.Response;

import com.digiseq.digiseqorganisation.model.Personnel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(setterPrefix = "with")
public class ClientOrganisationResponse {

    private String name;

    private Date registrationDate;

    private Date expiryDate;

    private Boolean enabled;

    private List<Personnel> personnel;


}
