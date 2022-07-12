package com.digiseq.digiseqorganisation.service.impl;

import com.digiseq.digiseqorganisation.DTO.Request.AddPersonnelRequest;
import com.digiseq.digiseqorganisation.mapper.PersonnelMapper;
import com.digiseq.digiseqorganisation.model.Personnel;
import com.digiseq.digiseqorganisation.repository.PersonnelRepository;
import com.digiseq.digiseqorganisation.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonnelServiceImpl implements PersonnelService {

    private final PersonnelRepository personnelRepository;
    private final PersonnelMapper personnelMapper;

    @Autowired
    public PersonnelServiceImpl(PersonnelRepository personnelRepository, PersonnelMapper personnelMapper) {
        this.personnelRepository = personnelRepository;
        this.personnelMapper = personnelMapper;
    }

    @Override
    public void savePersonnel(AddPersonnelRequest addPersonnelRequest) {
        Personnel personelToSave = personnelMapper.mapRequestToEntity(addPersonnelRequest);
        personnelRepository.save(personelToSave);
    }
}
