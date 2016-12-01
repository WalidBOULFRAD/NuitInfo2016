package com.m2dl.nuitinfo2016.model.poi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public class Event extends POI {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Date startDate;

    @NotNull
    private Date endDate;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


}
