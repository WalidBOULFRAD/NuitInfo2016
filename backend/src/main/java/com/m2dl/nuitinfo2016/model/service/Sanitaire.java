package com.m2dl.nuitinfo2016.model.service;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
@JsonTypeName("Sanitaire")
public class Sanitaire extends Service {

    public Sanitaire() {
    }
}
