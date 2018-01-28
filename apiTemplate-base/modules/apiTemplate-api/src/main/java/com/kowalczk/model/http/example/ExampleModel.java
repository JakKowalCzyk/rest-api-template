package com.kowalczk.model.http.example;

import com.kowalczk.model.http.HTTPModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by JK on 2018-01-28.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExampleModel extends HTTPModel {

    private String exampleField;

}
