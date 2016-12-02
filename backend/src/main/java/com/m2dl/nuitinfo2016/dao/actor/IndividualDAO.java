package com.m2dl.nuitinfo2016.dao.actor;

import com.m2dl.nuitinfo2016.model.actor.Individual;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by walid on 02/12/2016.
 */
@Repository
public interface IndividualDAO extends PagingAndSortingRepository<Individual, Long> {
}
