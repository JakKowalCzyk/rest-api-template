package com.kowalczyk.DAO.example;

import com.kowalczyk.DAO.ModelDAO;
import com.kowalczyk.model.example.ExampleModel;
import org.springframework.stereotype.Repository;

/**
 * Created by JK on 2018-01-25.
 */
@Repository
public interface ExampleModelDAO extends ModelDAO<ExampleModel> {
}
