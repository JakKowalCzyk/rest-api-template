package com.kowalczyk.service;

import com.kowalczyk.model.ModelObject;

import java.util.Collection;

/**
 * Created by JK on 2018-01-25.
 */
public interface ModelService<T extends ModelObject> {

    T findOne(Long id);

    T addObject(T baseModel);

    T updateObject(T baseModel);

    void deleteObject(Long id);

    void deleteObject(T baseModel);

    Collection<T> findAll();

    boolean isExist(Long id);

}
