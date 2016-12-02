package com.m2dl.nuitinfo2016.rest.service;

import com.m2dl.nuitinfo2016.dao.service.MedicalDAO;
import com.m2dl.nuitinfo2016.model.service.Medical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walid on 02/12/2016.
 */
@RestController
@RequestMapping (value = "/api/medical")
public class MedicalController {

    @Autowired
    MedicalDAO medicalDAO;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Iterable<Medical> findAll () {
        return medicalDAO.findAll();
    }

}
