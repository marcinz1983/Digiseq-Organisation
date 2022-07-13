package com.digiseq.digiseqorganisation.service;

import com.digiseq.digiseqorganisation.DTO.Request.AddPersonnelRequest;
import com.digiseq.digiseqorganisation.DTO.Response.PersonnelResponse;
import com.digiseq.digiseqorganisation.model.Personnel;

import java.util.List;

public interface PersonnelService {

    public void savePersonnel (AddPersonnelRequest addPersonnelRequest);

    public List<PersonnelResponse> findAllPersonnel();

    public List<PersonnelResponse> findPersonnelByClientOrganisationId(Long id);
}
