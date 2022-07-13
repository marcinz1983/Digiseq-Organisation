package com.digiseq.digiseqorganisation.service.impl;

import com.digiseq.digiseqorganisation.DTO.Request.AddPersonnelRequest;
import com.digiseq.digiseqorganisation.DTO.Response.PersonnelResponse;
import com.digiseq.digiseqorganisation.mapper.PersonnelMapper;
import com.digiseq.digiseqorganisation.model.Personnel;
import com.digiseq.digiseqorganisation.repository.PersonnelRepository;
import com.digiseq.digiseqorganisation.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<PersonnelResponse> findAllPersonnel() {
        return personnelRepository
                .findAll()
                .stream()
                .map(personnelMapper::mapEntityToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<PersonnelResponse> findPersonnelByClientOrganisationId(Long id) {
        return personnelRepository
                .findPersonnelByClientOrganisationId(id)
                .stream()
                .map(personnelMapper::mapEntityToResponse)
                .collect(Collectors.toList());
    }
}
