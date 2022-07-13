package com.digiseq.digiseqorganisation.mapper;

import com.digiseq.digiseqorganisation.DTO.Request.AddPersonnelRequest;
import com.digiseq.digiseqorganisation.DTO.Response.PersonnelResponse;
import com.digiseq.digiseqorganisation.model.Personnel;

public interface PersonnelMapper {

    Personnel mapRequestToEntity(AddPersonnelRequest addPersonnelRequest);

    PersonnelResponse mapEntityToResponse(Personnel personnel);

}
