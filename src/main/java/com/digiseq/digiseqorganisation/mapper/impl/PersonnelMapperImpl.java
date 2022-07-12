package com.digiseq.digiseqorganisation.mapper.impl;

import com.digiseq.digiseqorganisation.DTO.Request.AddPersonnelRequest;
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
}
