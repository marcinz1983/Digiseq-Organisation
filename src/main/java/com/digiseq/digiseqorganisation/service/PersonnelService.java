package com.digiseq.digiseqorganisation.service;

import com.digiseq.digiseqorganisation.DTO.Request.AddPersonnelRequest;
import com.digiseq.digiseqorganisation.model.Personnel;

public interface PersonnelService {

    public void savePersonnel (AddPersonnelRequest addPersonnelRequest);
}
