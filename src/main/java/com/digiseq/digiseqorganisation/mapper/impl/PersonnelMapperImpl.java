package com.digiseq.digiseqorganisation.mapper.impl;

import com.digiseq.digiseqorganisation.DTO.Request.AddPersonnelRequest;
import com.digiseq.digiseqorganisation.DTO.Response.PersonnelResponse;
import com.digiseq.digiseqorganisation.mapper.PersonnelMapper;
import com.digiseq.digiseqorganisation.model.Personnel;
import org.springframework.stereotype.Component;

@Component
public class PersonnelMapperImpl implements PersonnelMapper {

    @Override

    public Personnel mapRequestToEntity(AddPersonnelRequest addPersonnelRequest) {

        return Personnel.builder()
                .whitFirstName(addPersonnelRequest.getFirstName())
                .whitLastName(addPersonnelRequest.getLastName())
                .whitEmail(addPersonnelRequest.getEmail())
                .whitPassword(addPersonnelRequest.getPassword())
                .whitPhoneNumber(addPersonnelRequest.getPhoneNumber())
                .whitUsername(addPersonnelRequest.getUsername())
                .build();
    }

    @Override
    public PersonnelResponse mapEntityToResponse(Personnel personnel) {
        return PersonnelResponse.builder()
                .withEmail(personnel.getEmail())
                .withFirstName(personnel.getFirstName())
                .withLastName(personnel.getLastName())
                .withUsername(personnel.getUsername())
                .withPhoneNumber(personnel.getPhoneNumber())
                .withClientOrganisationId(personnel.getClient_Organisation().getId())
                .build();
    }
}
