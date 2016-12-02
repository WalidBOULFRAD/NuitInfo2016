package com.m2dl.nuitinfo2016.rest.actor;

import com.m2dl.nuitinfo2016.dao.actor.IndividualDAO;
import com.m2dl.nuitinfo2016.model.actor.Individual;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walid on 02/12/2016.
 */
@RestController
@RequestMapping(value = "/individual")
public class IndividualController {

    @Autowired
    IndividualDAO individualDAO;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Iterable<Individual> findAll() {
        return individualDAO.findAll();
    }

}
