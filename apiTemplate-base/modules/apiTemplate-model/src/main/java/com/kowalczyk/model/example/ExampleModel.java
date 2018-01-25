package com.kowalczyk.model.example;

import com.kowalczyk.model.ModelObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * Created by JK on 2018-01-25.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ExampleModel extends ModelObject {

    private String exampleField;

}
