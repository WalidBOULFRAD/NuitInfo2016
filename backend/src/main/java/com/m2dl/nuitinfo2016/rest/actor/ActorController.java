package com.m2dl.nuitinfo2016.rest.actor;

import com.m2dl.nuitinfo2016.dao.actor.ActorDAO;
import com.m2dl.nuitinfo2016.model.actor.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walid on 01/12/2016.
 */
@RestController
@RequestMapping(value = "/api/actor")
public class ActorController {

    @Autowired
    ActorDAO actorDAO;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Iterable<Actor> findAll() {
        return actorDAO.findAll();
    }

}
