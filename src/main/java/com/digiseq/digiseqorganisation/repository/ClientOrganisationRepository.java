package com.digiseq.digiseqorganisation.repository;

import com.digiseq.digiseqorganisation.model.ClientOrganisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientOrganisationRepository extends JpaRepository<ClientOrganisation, Long> {
}
