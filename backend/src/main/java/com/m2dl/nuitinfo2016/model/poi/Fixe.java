package com.m2dl.nuitinfo2016.model.poi;

import com.m2dl.nuitinfo2016.model.actor.Actor;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public class Fixe extends POI {

    @NotNull
    private Date startDate;

    public Fixe() {

    }

    public Fixe(String name, String description, String address, Actor owner, Float lat, Float lon, Date startDate) {
        super(name, description, address, owner, lat, lon);
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
