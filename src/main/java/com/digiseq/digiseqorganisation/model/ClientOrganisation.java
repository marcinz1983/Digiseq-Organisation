package com.digiseq.digiseqorganisation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CLIENT_ORGANISATION")
@Builder(setterPrefix = "with")
//@NamedEntityGraph(name = "clientOrganisation-personnel-graph",
//attributeNodes = @NamedAttributeNode(value = "personnel"))
@Entity
public class ClientOrganisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true)
    private Long id;

    @Column(name = "NAME", unique = true)
    private String name;

    @Column(name = "REGISTRATION_DATE")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date registrationDate;

    @Column(name = "EXPIRY_DATE")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date expiryDate;

    @Column(name = "ENABLED")
    private Boolean enabled;

    @OneToMany(
            mappedBy = "client_Organisation",
            cascade = CascadeType.ALL)
    private List<Personnel> personnel;



}

