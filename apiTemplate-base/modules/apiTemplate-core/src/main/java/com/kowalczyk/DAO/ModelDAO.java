package com.kowalczyk.DAO;

import com.kowalczyk.model.ModelObject;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by JK on 2018-01-25.
 */
public interface ModelDAO<T extends ModelObject> extends PagingAndSortingRepository<T, Long> {
}
