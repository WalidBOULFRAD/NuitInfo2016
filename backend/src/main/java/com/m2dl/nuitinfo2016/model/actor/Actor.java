package com.m2dl.nuitinfo2016.model.actor;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.m2dl.nuitinfo2016.model.poi.POI;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @JsonSubTypes.Type(value = Administration.class, name = "Administration"),
        @JsonSubTypes.Type(value = Association.class, name = "Association"),
        @JsonSubTypes.Type(value = Individual.class, name = "Individual")})
@Entity
public abstract class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private String address;

    private String phoneNumber;

    @Email
    private String mail;

    @OneToMany(mappedBy = "owner")
    private List<POI> pois;

    public Actor() {
    }

    public Actor(String name, String address, String phoneNumber, String mail) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.pois = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<POI> getPois() {
        return pois;
    }

    public void setPois(List<POI> pois) {
        this.pois = pois;
    }
}
