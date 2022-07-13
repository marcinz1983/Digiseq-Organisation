package com.digiseq.digiseqorganisation.mapper.impl;

import com.digiseq.digiseqorganisation.DTO.Request.AddClientOrganisationRequest;
import com.digiseq.digiseqorganisation.DTO.Response.ClientOrganisationResponse;
import com.digiseq.digiseqorganisation.DTO.Response.PersonnelResponse;
import com.digiseq.digiseqorganisation.mapper.ClientOrganisationMapper;
import com.digiseq.digiseqorganisation.model.ClientOrganisation;
import com.digiseq.digiseqorganisation.model.Personnel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClientOrganisationMapperImpl implements ClientOrganisationMapper {

    @Override
    public ClientOrganisation mapRequestToEntity(AddClientOrganisationRequest addClientOrganisation) {

        List<Personnel> personnelToSave = addClientOrganisation.getAddPersonnelRequests().stream().map(value -> {
            return  new Personnel( value.getFirstName(), value.getLastName(), value.getUsername(),
                    value.getPassword(), value.getEmail(), value.getPhoneNumber());
        }).collect(Collectors.toList());

        return ClientOrganisation.builder()
                .withName(addClientOrganisation.getName())
                .withExpiryDate(addClientOrganisation.getExpiryDate())
                .withRegistrationDate(addClientOrganisation.getRegistrationDate())
                .withPersonnel(personnelToSave)
                .withEnabled(addClientOrganisation.getEnabled())
                .build();
    }

    @Override
    public ClientOrganisationResponse mapEntityToResponse(ClientOrganisation clientOrganisation) {

        List<PersonnelResponse> clientOrganisationPersonnel = clientOrganisation.getPersonnel().stream().map(value -> {
                    return new PersonnelResponse(value.getFirstName(), value.getLastName(),
                            value.getUsername(), value.getEmail(), value.getPhoneNumber(), value.getClient_Organisation().getId());
                }).collect(Collectors.toList());

        return ClientOrganisationResponse.builder()
                .withName(clientOrganisation.getName())
                .withExpiryDate(clientOrganisation.getExpiryDate())
                .withRegistrationDate(clientOrganisation.getRegistrationDate())
                .withEnabled(clientOrganisation.getEnabled())
                .withPersonnel(clientOrganisationPersonnel)
                .build();
    }
}
