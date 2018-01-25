package com.kowalczyk.service.example.impl;

import com.kowalczyk.DAO.example.ExampleModelDAO;
import com.kowalczyk.model.example.ExampleModel;
import com.kowalczyk.service.example.ExampleModelService;
import com.kowalczyk.service.impl.ModelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JK on 2018-01-25.
 */
@Service
public class ExampleModelServiceImpl extends ModelServiceImpl<ExampleModel> implements ExampleModelService {

    @Autowired
    public ExampleModelServiceImpl(ExampleModelDAO modelDAO) {
        super(modelDAO);
    }
}
