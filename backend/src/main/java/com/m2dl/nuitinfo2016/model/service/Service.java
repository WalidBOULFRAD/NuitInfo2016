package com.m2dl.nuitinfo2016.model.service;

import com.m2dl.nuitinfo2016.model.poi.POI;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public abstract class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull @NotBlank
    protected String description;

    @NotNull
    @ManyToOne(fetch= FetchType.LAZY)
    private POI poi;

    public POI getPoi() {
        return poi;
    }

    public void setPoi(POI poi) {
        this.poi = poi;
    }
}
