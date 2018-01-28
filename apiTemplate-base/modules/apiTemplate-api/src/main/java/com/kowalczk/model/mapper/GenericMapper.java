package com.kowalczk.model.mapper;

import com.kowalczk.model.http.HTTPModel;
import com.kowalczyk.model.ModelObject;
import org.modelmapper.ModelMapper;

/**
 * Created by JK on 2018-01-28.
 */
public abstract class GenericMapper<T extends HTTPModel, E extends ModelObject> {

    private ModelMapper modelMapper;

    public GenericMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public E mapToModelObject(T httpObject) {
        E modelObject = buildModelObject(httpObject);


        return modelObject;
    }

    public T mapToHttpObject(E modelObject) {
        T httpObject = buildHttpObject(modelObject);


        return httpObject;
    }

    protected abstract T buildHttpObject(E modelObject);

    protected abstract E buildModelObject(T httpObject);


    public ModelMapper getModelMapper() {
        return modelMapper;
    }

}
