package com.m2dl.nuitinfo2016.rest.actor;

import com.m2dl.nuitinfo2016.dao.actor.AssociationDAO;
import com.m2dl.nuitinfo2016.model.actor.Association;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walid on 02/12/2016.
 */
@RestController(value = "/association")
public class AssociationController {

    @Autowired
    AssociationDAO associationDAO;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Iterable<Association> findAll() {
        return associationDAO.findAll();
    }

}
