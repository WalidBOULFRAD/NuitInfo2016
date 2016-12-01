package com.m2dl.nuitinfo2016.dao;

import com.m2dl.nuitinfo2016.model.service.Administratif;
import com.m2dl.nuitinfo2016.model.service.Service;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Repository
public interface AdministratifDAO extends PagingAndSortingRepository<Administratif, Long> {
}
