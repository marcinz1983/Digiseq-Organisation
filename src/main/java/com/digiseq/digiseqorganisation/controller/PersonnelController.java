package com.digiseq.digiseqorganisation.controller;

import com.digiseq.digiseqorganisation.DTO.Request.AddPersonnelRequest;
import com.digiseq.digiseqorganisation.DTO.Response.PersonnelResponse;
import com.digiseq.digiseqorganisation.model.Personnel;
import com.digiseq.digiseqorganisation.repository.PersonnelRepository;
import com.digiseq.digiseqorganisation.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/personnel")
public class PersonnelController {

    private final PersonnelService personnelService;


    @Autowired
    public PersonnelController(PersonnelService personnelService) {
        this.personnelService = personnelService;
    }


    @PostMapping("/save")
    ResponseEntity<Void> savePersonnel(@Valid @RequestBody AddPersonnelRequest addPersonnelRequest) {
        personnelService.savePersonnel(addPersonnelRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PersonnelResponse>> findAllPersonnel() {
        List<PersonnelResponse> result = personnelService.findAllPersonnel();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<PersonnelResponse>> findPersonnelByClientOrganisationId(@PathVariable("id") Long id) {
        List<PersonnelResponse> result = personnelService.findPersonnelByClientOrganisationId(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
