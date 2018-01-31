package com.kowalczyk.controller.impl;

import com.kowalczyk.controller.GenericController;
import com.kowalczyk.model.ModelObject;
import com.kowalczyk.model.http.HTTPModel;
import com.kowalczyk.model.mapper.GenericMapper;
import com.kowalczyk.service.ModelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by JK on 2018-01-28.
 */
public abstract class GenericControllerImpl<T extends HTTPModel, E extends ModelObject> implements GenericController<T> {

    private ModelService<E> modelService;
    private GenericMapper<T, E> genericMapper;

    public GenericControllerImpl(ModelService<E> modelService, GenericMapper<T, E> genericMapper) {
        this.modelService = modelService;
        this.genericMapper = genericMapper;
    }

    @Override
    public T findOne(@PathVariable Long id) {
        return genericMapper.mapToHttpObject(modelService.findOne(id));
    }

    @Override
    public T updateObject(@RequestBody T model) {
        return genericMapper.mapToHttpObject(modelService.updateObject(genericMapper.mapToModelObject(model)));
    }

    @Override
    public T addObject(@RequestBody T model) {
        return genericMapper.mapToHttpObject(modelService.addObject(genericMapper.mapToModelObject(model)));
    }

    @Override
    public Collection<T> findAll() {
        return modelService.findAll().stream().map(e -> genericMapper.mapToHttpObject(e)).collect(Collectors.toList());
    }

    @Override
    public void deleteObject(@PathVariable Long id) {
        modelService.deleteObject(id);
    }

    @Override
    public ResponseEntity<Boolean> isExist(@PathVariable Long id) {
        return new ResponseEntity<Boolean>(modelService.isExist(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    public ModelService<E> getModelService() {
        return modelService;
    }

    public GenericMapper<T, E> getGenericMapper() {
        return genericMapper;
    }
}
