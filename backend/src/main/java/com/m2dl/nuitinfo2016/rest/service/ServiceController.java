package com.m2dl.nuitinfo2016.rest.service;

import com.m2dl.nuitinfo2016.dao.service.ServiceDAO;
import com.m2dl.nuitinfo2016.model.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walid on 02/12/2016.
 */
@RestController
@RequestMapping (value = "/api/service")
public class ServiceController {

    @Autowired
    ServiceDAO serviceDAO;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Iterable<Service> findAll () {
        return serviceDAO.findAll();
    }

}
