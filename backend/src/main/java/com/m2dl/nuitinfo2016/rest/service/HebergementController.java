package com.m2dl.nuitinfo2016.rest.service;

import com.m2dl.nuitinfo2016.dao.service.HebergementDAO;
import com.m2dl.nuitinfo2016.model.service.Hebergement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walid on 02/12/2016.
 */
@RestController
@RequestMapping (value = "hebergement")
public class HebergementController {

    @Autowired
    HebergementDAO hebergementDAO;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Iterable<Hebergement> findAll () {
        return hebergementDAO.findAll();
    }

}
