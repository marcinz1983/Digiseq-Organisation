package com.digiseq.digiseqorganisation.repository;

import com.digiseq.digiseqorganisation.model.ClientOrganisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ClientOrganisationRepository extends JpaRepository<ClientOrganisation, Long> {

   Optional<ClientOrganisation> findByIdEquals(Long id);

   ClientOrganisation findTopByOrderByIdDesc();

}
