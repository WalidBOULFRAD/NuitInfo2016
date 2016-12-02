package com.m2dl.nuitinfo2016.model.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public class Sanitaire extends Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Sanitaire() {
    }
}
