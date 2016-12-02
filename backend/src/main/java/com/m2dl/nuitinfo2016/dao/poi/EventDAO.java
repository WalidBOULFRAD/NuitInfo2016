package com.m2dl.nuitinfo2016.dao.poi;

import com.m2dl.nuitinfo2016.model.poi.Event;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by walid on 02/12/2016.
 */
@Repository
public interface EventDAO extends PagingAndSortingRepository<Event, Long> {
}
