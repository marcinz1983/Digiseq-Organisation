package com.digiseq.digiseqorganisation.DTO.Response;

import com.digiseq.digiseqorganisation.encoderColumn.AttributeEncryptor;
import com.digiseq.digiseqorganisation.model.ClientOrganisation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(setterPrefix = "with")
public class PersonnelResponse {

    private String firstName;

    private String lastName;

    private String username;

    private String email;

    private String phoneNumber;

    private Long clientOrganisationId;

}
