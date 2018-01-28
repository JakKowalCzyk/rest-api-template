package com.kowalczyk.service.impl;

/**
 * Created by JK on 2018-01-25.
 */

import com.kowalczyk.DAO.ModelDAO;
import com.kowalczyk.model.ModelObject;
import com.kowalczyk.model.exception.ObjectNotFoundException;
import com.kowalczyk.service.ModelService;

import java.util.Collection;

public abstract class ModelServiceImpl<T extends ModelObject> implements ModelService<T> {

    private ModelDAO<T> modelDAO;

    public ModelServiceImpl(ModelDAO<T> modelDAO) {
        super();
        this.modelDAO = modelDAO;
    }

    @Override
    public T findOne(Long id) {
        if (!isExist(id)) {
            throw new ObjectNotFoundException(id);
        }
        return modelDAO.findOne(id);
    }

    @Override
    public T addObject(T baseModel) {
        return modelDAO.save(baseModel);
    }

    @Override
    public T updateObject(T baseModel) {
        return modelDAO.save(baseModel);
    }

    @Override
    public void deleteObject(Long id) {
        modelDAO.delete(id);
    }

    @Override
    public void deleteObject(T baseModel) {
        modelDAO.delete(baseModel);
    }

    @Override
    public Collection<T> findAll() {
        return (Collection<T>) modelDAO.findAll();
    }

    @Override
    public boolean isExist(Long id) {
        return modelDAO.exists(id);
    }
}
