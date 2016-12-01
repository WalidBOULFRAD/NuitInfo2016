package com.m2dl.nuitinfo2016.model.service;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public class Alimentaire extends Service {

    @Id
    private Long id;

    private int quantity;

    private boolean availability;
}
