package com.m2dl.nuitinfo2016.model.poi;

import com.m2dl.nuitinfo2016.model.actor.Actor;
import com.m2dl.nuitinfo2016.model.service.Service;
import com.m2dl.nuitinfo2016.util.Point;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public class Fixe extends POI {

    @NotNull
    private Date startDate;


    public Fixe(String name, String description, String address, Collection<Service> services, Actor owner, Point location, Date startDate) {
        super(name, description, address, services, owner, location);
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
