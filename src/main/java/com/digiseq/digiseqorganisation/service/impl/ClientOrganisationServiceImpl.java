package com.digiseq.digiseqorganisation.service.impl;

import com.digiseq.digiseqorganisation.repository.ClientOrganisationRepository;
import com.digiseq.digiseqorganisation.service.ClientOrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientOrganisationServiceImpl implements ClientOrganisationService {

    private final ClientOrganisationRepository clientOrganisationRepository;

    @Autowired
    public ClientOrganisationServiceImpl(ClientOrganisationRepository clientOrganisationRepository) {
        this.clientOrganisationRepository = clientOrganisationRepository;
    }

    @Override
    public void saveClientOrganisation() {


    }
}
