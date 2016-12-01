package com.m2dl.nuitinfo2016.model.service;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public class Hebergement extends Service {

    @Id
    private Long id;

    private int placesAvailable;

    public Hebergement() {
    }

    public int getPlacesAvailable() {
        return placesAvailable;
    }

    public void setPlacesAvailable(int placesAvailable) {
        this.placesAvailable = placesAvailable;
    }
}
