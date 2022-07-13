package com.digiseq.digiseqorganisation.repository;

import com.digiseq.digiseqorganisation.model.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonnelRepository extends JpaRepository <Personnel, Long> {

    @Query("SELECT p FROM Personnel p WHERE p.client_Organisation.id = ?1")
    public List<Personnel> findPersonnelByClientOrganisationId(Long client_organisation_id);
}
