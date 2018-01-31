package com.kowalczyk.controller.example;

import com.kowalczyk.controller.GenericController;
import com.kowalczyk.model.http.example.ExampleModel;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by JK on 2018-01-28.
 */
@Api(tags = "Example API", description = "services for example model")
@RequestMapping(value = "/api/example")
public interface ExampleModelController extends GenericController<ExampleModel> {

    @Override
    @GetMapping(value = "/{id}")
    ExampleModel findOne(@PathVariable Long id);

    @Override
    @PutMapping
    ExampleModel updateObject(@RequestBody ExampleModel model);

    @Override
    @PostMapping
    ExampleModel addObject(@RequestBody ExampleModel model);

    @Override
    @GetMapping(value = "/")
    Collection<ExampleModel> findAll();

    @Override
    @DeleteMapping(value = "/{id}")
    void deleteObject(@PathVariable Long id);

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.HEAD)
    ResponseEntity<Boolean> isExist(@PathVariable Long id);

}
