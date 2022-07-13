package com.digiseq.digiseqorganisation.service;

import com.digiseq.digiseqorganisation.DTO.Request.AddClientOrganisation;
import com.digiseq.digiseqorganisation.DTO.Response.ClientOrganisationResponse;


import java.util.List;


public interface ClientOrganisationService {

     void saveClientOrganisation(AddClientOrganisation addClientOrganisation);

    List<ClientOrganisationResponse> findAll();

    // ClientOrganisation findLastRecordInDb();

    ClientOrganisationResponse findClientOrganisationById(Long id);
}
