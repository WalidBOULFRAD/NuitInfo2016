package com.m2dl.nuitinfo2016.model.service;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
@JsonTypeName("Hebergement")
public class Hebergement extends Service {
    @Min(value = 0)
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
