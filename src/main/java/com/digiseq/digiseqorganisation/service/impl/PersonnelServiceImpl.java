package com.digiseq.digiseqorganisation.service.impl;

import com.digiseq.digiseqorganisation.model.Personnel;
import com.digiseq.digiseqorganisation.repository.PersonnelRepository;
import com.digiseq.digiseqorganisation.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonnelServiceImpl implements PersonnelService {

    private final PersonnelRepository personnelRepository;

    @Autowired
    public PersonnelServiceImpl(PersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository;
    }

    @Override
    public void savePersonnel(Personnel personnel) {
        personnelRepository.save(personnel);
    }
}
