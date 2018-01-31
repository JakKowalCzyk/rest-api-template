package com.kowalczyk.controller;

import com.kowalczyk.model.http.HTTPModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

/**
 * Created by JK on 2018-01-28.
 */
public interface GenericController<T extends HTTPModel> {

    @ApiOperation(value = "Get object by id")
    T findOne(@PathVariable Long id);

    @ApiOperation(value = "Update object")
    T updateObject(@RequestBody T model);

    @ApiOperation(value = "Add new object")
    T addObject(@RequestBody T model);

    @ApiOperation(value = "Find all")
    Collection<T> findAll();

    @ApiOperation(value = "Delete object by id")
    void deleteObject(@PathVariable Long id);

    @ApiOperation(value = "Check if exist")
    ResponseEntity<Boolean> isExist(@PathVariable Long id);
}
