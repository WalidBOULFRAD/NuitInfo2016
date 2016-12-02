package com.m2dl.nuitinfo2016.rest.poi;

import com.m2dl.nuitinfo2016.dao.poi.FixeDAO;
import com.m2dl.nuitinfo2016.model.poi.Fixe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walid on 02/12/2016.
 */
@RestController
@RequestMapping (value = "/api/fixe")
public class FixeController {

    @Autowired
    FixeDAO fixeDAO;

    @RequestMapping (value = "/findAll", method = RequestMethod.GET)
    public Iterable<Fixe> findAll () {
        return fixeDAO.findAll();
    }

}
