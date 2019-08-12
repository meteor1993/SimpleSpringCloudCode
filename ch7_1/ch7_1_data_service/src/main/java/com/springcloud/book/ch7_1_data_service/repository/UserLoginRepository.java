package com.springcloud.book.ch7_1_data_service.repository;

import com.springcloud.book.ch7_1_data_service.model.UserLoginModel;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @Date: 2019/8/12 9:39
 * @Version: 1.0
 * @Desc:
 */
public interface UserLoginRepository extends PagingAndSortingRepository<UserLoginModel, Long>, JpaSpecificationExecutor<UserLoginModel> {
    UserLoginModel findAllByLoginNameAndPassword(String userName, String password);
}
