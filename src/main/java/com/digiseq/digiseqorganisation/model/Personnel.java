package com.digiseq.digiseqorganisation.model;

import com.digiseq.digiseqorganisation.encoderColumn.AttributeEncryptor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "whit")
@Table(name = "PERSONNEL")
@Entity
public class Personnel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true)
    private Long id;

    @Column(name = "FIRST_NAME")
    private  String firstName;

    @Column(name = "LAST_NAME")
    private  String lastName;

    @Column(name = "USER_NAME",unique = true)
    private  String username;

    @Column(name = "PASSWORD")
    @Convert(converter = AttributeEncryptor.class)
    private String password;

    @Column(name = "EMAIL",unique = true)
    private  String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ORGANISATION_ID")
    private ClientOrganisation client_Organisation;


    public Personnel(String firstName, String lastName, String username, String password,
                     String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
