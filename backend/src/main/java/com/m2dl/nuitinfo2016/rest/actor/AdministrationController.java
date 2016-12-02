package com.m2dl.nuitinfo2016.rest.actor;

import com.m2dl.nuitinfo2016.dao.actor.AdministrationDAO;
import com.m2dl.nuitinfo2016.model.actor.Administration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walid on 02/12/2016.
 */
@RestController
@RequestMapping(value = "/api/administration")
public class AdministrationController {

    @Autowired
    AdministrationDAO administrationDAO;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Iterable<Administration> findAll() {
        return administrationDAO.findAll();
    }

}
