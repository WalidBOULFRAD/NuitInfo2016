package com.m2dl.nuitinfo2016.model.service;

import com.m2dl.nuitinfo2016.model.poi.POI;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
public abstract class Service {
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
