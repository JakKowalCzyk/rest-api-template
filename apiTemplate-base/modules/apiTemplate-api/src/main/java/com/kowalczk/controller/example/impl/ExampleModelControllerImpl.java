package com.kowalczk.controller.example.impl;

import com.kowalczk.controller.example.ExampleModelController;
import com.kowalczk.controller.impl.GenericControllerImpl;
import com.kowalczk.model.http.example.ExampleModel;
import com.kowalczk.model.mapper.example.ExampleModelMapper;
import com.kowalczyk.service.example.ExampleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by JK on 2018-01-28.
 */
@RestController
public class ExampleModelControllerImpl extends GenericControllerImpl<ExampleModel, com.kowalczyk.model.example.ExampleModel> implements ExampleModelController {

    @Autowired
    public ExampleModelControllerImpl(ExampleModelService modelService, ExampleModelMapper genericMapper) {
        super(modelService, genericMapper);
    }

    @Override
    public ExampleModel findOne(@PathVariable Long id) {
        return super.findOne(id);
    }

    @Override
    public ExampleModel updateObject(@RequestBody ExampleModel model) {
        return super.updateObject(model);
    }

    @Override
    public ExampleModel addObject(@RequestBody ExampleModel model) {
        return super.addObject(model);
    }

    @Override
    public Collection<ExampleModel> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteObject(@PathVariable Long id) {
        super.deleteObject(id);
    }

    @Override
    public ResponseEntity<Boolean> isExist(@PathVariable Long id) {
        return super.isExist(id);
    }
}
