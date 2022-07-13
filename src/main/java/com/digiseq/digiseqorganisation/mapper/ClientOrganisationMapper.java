package com.digiseq.digiseqorganisation.mapper;

import com.digiseq.digiseqorganisation.DTO.Request.AddClientOrganisationRequest;
import com.digiseq.digiseqorganisation.DTO.Response.ClientOrganisationResponse;
import com.digiseq.digiseqorganisation.model.ClientOrganisation;
import org.springframework.stereotype.Component;

@Component
public interface ClientOrganisationMapper {

    ClientOrganisation mapRequestToEntity(AddClientOrganisationRequest addClientOrganisation);

    ClientOrganisationResponse mapEntityToResponse(ClientOrganisation clientOrganisation);

}
