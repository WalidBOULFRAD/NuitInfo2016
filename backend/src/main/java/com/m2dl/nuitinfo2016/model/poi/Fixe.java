package com.m2dl.nuitinfo2016.model.poi;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public class Fixe extends POI {

    @Id
    private Long id;

    private Date startDate;
}
