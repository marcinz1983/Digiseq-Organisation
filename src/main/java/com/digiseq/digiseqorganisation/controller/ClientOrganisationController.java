package com.digiseq.digiseqorganisation.controller;

import com.digiseq.digiseqorganisation.DTO.Request.AddClientOrganisation;
import com.digiseq.digiseqorganisation.DTO.Response.ClientOrganisationResponse;
import com.digiseq.digiseqorganisation.service.ClientOrganisationService;
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

@RestController
@RequestMapping("/ClientOrganisation")
public class ClientOrganisationController {

    private final ClientOrganisationService clientOrganisationService;

    public ClientOrganisationController(ClientOrganisationService clientOrganisationService) {
        this.clientOrganisationService = clientOrganisationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientOrganisationResponse> getOfferByID(@PathVariable("id") Long id) {
        ClientOrganisationResponse clientOrganisationResponse = clientOrganisationService.findClientOrganisationById(id);
        return new ResponseEntity<>(clientOrganisationResponse, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ClientOrganisationResponse>> findAllClientOrganisation() {
        List<ClientOrganisationResponse> result = clientOrganisationService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/save")
    ResponseEntity<Void> saveClientOrganisation(@Valid @RequestBody AddClientOrganisation clientOrganisation) {
        clientOrganisationService.saveClientOrganisation(clientOrganisation);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
