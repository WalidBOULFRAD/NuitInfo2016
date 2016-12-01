package com.m2dl.nuitinfo2016.util;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public class Point {

    @Id
    private Long id;

    private Float lat;

    private Float lon;
}
