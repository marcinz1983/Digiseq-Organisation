package com.digiseq.digiseqorganisation.mapper;

import com.digiseq.digiseqorganisation.DTO.Request.AddClientOrganisation;
import com.digiseq.digiseqorganisation.DTO.Request.AddPersonnelRequest;
import com.digiseq.digiseqorganisation.DTO.Response.ClientOrganisationResponse;
import com.digiseq.digiseqorganisation.DTO.Response.PersonnelResponse;
import com.digiseq.digiseqorganisation.model.ClientOrganisation;
import com.digiseq.digiseqorganisation.model.Personnel;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component
public interface ClientOrganisationMapper {

    ClientOrganisation mapRequestToEntity(AddClientOrganisation addClientOrganisation);

    ClientOrganisationResponse mapEntityToResponse(ClientOrganisation clientOrganisation);

}
