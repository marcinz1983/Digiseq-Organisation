package com.digiseq.digiseqorganisation.service.impl;

import com.digiseq.digiseqorganisation.DTO.Request.AddClientOrganisation;
import com.digiseq.digiseqorganisation.DTO.Response.ClientOrganisationResponse;
import com.digiseq.digiseqorganisation.mapper.ClientOrganisationMapper;
import com.digiseq.digiseqorganisation.model.ClientOrganisation;
import com.digiseq.digiseqorganisation.repository.ClientOrganisationRepository;
import com.digiseq.digiseqorganisation.service.ClientOrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientOrganisationServiceImpl implements ClientOrganisationService {

    private final ClientOrganisationRepository clientOrganisationRepository;
    private  final ClientOrganisationMapper clientOrganisationMapper;

    @Autowired
    public ClientOrganisationServiceImpl(ClientOrganisationRepository clientOrganisationRepository, ClientOrganisationMapper clientOrganisationMapper) {
        this.clientOrganisationRepository = clientOrganisationRepository;
        this.clientOrganisationMapper = clientOrganisationMapper;
    }

    @Override
    public void saveClientOrganisation(AddClientOrganisation addClientOrganisation) {
       ClientOrganisation toSave= clientOrganisationMapper.mapRequestToEntity(addClientOrganisation);
       clientOrganisationRepository.save(toSave);
    }

    @Override
    public List<ClientOrganisationResponse> findAll() {
      return   clientOrganisationRepository.findAll()
              .stream()
              .map(clientOrganisationMapper::mapEntityToResponse)
              .collect(Collectors.toList());

    }

    @Override
    public ClientOrganisationResponse findClientOrganisationById(Long id) {
        ClientOrganisationResponse result = clientOrganisationRepository
                .findByIdEquals(id)
                .map(clientOrganisationMapper::mapEntityToResponse)
                .orElseThrow(() -> new RuntimeException("Client organisation not find"));
        return result;
    }

}
