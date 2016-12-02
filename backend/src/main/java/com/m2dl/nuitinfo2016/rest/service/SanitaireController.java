package com.m2dl.nuitinfo2016.rest.service;

import com.m2dl.nuitinfo2016.dao.service.SanitaireDAO;
import com.m2dl.nuitinfo2016.model.service.Sanitaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walid on 02/12/2016.
 */
@RestController
@RequestMapping (value = "sanitaire")
public class SanitaireController {

    @Autowired
    SanitaireDAO sanitaireDAO;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Iterable<Sanitaire> findAll () {
        return sanitaireDAO.findAll();
    }

}
