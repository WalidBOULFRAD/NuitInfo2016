package com.m2dl.nuitinfo2016.dao.actor;

import com.m2dl.nuitinfo2016.model.actor.Association;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by walid on 02/12/2016.
 */
@Repository
public interface AssociationDAO extends PagingAndSortingRepository<Association, Long> {
}
