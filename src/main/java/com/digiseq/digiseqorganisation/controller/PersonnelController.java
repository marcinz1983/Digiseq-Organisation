package com.digiseq.digiseqorganisation.controller;

import com.digiseq.digiseqorganisation.DTO.Request.AddPersonnelRequest;
import com.digiseq.digiseqorganisation.model.Personnel;
import com.digiseq.digiseqorganisation.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/personel")
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

}
