package com.kowalczyk.model.mapper.example;

import com.kowalczyk.model.http.example.ExampleModel;
import com.kowalczyk.model.mapper.GenericMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by JK on 2018-01-28.
 */
@Component
public class ExampleModelMapper extends GenericMapper<ExampleModel, com.kowalczyk.model.example.ExampleModel> {
    @Autowired
    public ExampleModelMapper(ModelMapper modelMapper) {
        super(modelMapper);
    }

    @Override
    protected ExampleModel buildHttpObject(com.kowalczyk.model.example.ExampleModel modelObject) {
        return getModelMapper().map(modelObject, ExampleModel.class);
    }

    @Override
    protected com.kowalczyk.model.example.ExampleModel buildModelObject(ExampleModel httpObject) {
        return getModelMapper().map(httpObject, com.kowalczyk.model.example.ExampleModel.class);
    }
}
