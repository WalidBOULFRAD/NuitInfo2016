package com.m2dl.nuitinfo2016.rest.poi;

import com.m2dl.nuitinfo2016.dao.poi.EventDAO;
import com.m2dl.nuitinfo2016.model.poi.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walid on 02/12/2016.
 */
@RestController
@RequestMapping (value = "event")
public class EventController {

    @Autowired
    EventDAO eventDAO;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Iterable<Event> findAll () {
        return eventDAO.findAll();
    }

}
