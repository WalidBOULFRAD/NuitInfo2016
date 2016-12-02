package com.m2dl.nuitinfo2016.model.actor;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
@JsonTypeName("Individual")
public class Individual extends Actor {

    public Individual(String name, String address, String phoneNumber, String mail) {
        super(name, address, phoneNumber, mail);
    }
}
