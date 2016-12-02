package com.m2dl.nuitinfo2016.rest.poi;

import com.m2dl.nuitinfo2016.dao.poi.POIDAO;
import com.m2dl.nuitinfo2016.model.poi.POI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walid on 02/12/2016.
 */
@RestController(value = "/poi")
public class POIController {

    @Autowired
    POIDAO poidao;

    @RequestMapping (value = "/findAll", method = RequestMethod.GET)
    public Iterable<POI> findAll () {
        return poidao.findAll();
    }

}
