package com.digiseq.digiseqorganisation.service;

import com.digiseq.digiseqorganisation.DTO.Request.AddClientOrganisationRequest;
import com.digiseq.digiseqorganisation.DTO.Request.EditClientOrganisationrequest;
import com.digiseq.digiseqorganisation.DTO.Response.ClientOrganisationResponse;


import java.util.List;


public interface ClientOrganisationService {

     void saveClientOrganisation(AddClientOrganisationRequest addClientOrganisation);

    List<ClientOrganisationResponse> findAll();

    ClientOrganisationResponse findClientOrganisationById(Long id);

    void editClientOrganisation (EditClientOrganisationrequest editRequest);
}
