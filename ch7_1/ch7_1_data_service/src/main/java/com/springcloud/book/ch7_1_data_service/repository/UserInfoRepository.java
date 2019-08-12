package com.springcloud.book.ch7_1_data_service.repository;

import com.springcloud.book.ch7_1_data_service.model.UserInfoModel;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @Date: 2019/8/12 9:38
 * @Version: 1.0
 * @Desc:
 */
public interface UserInfoRepository extends PagingAndSortingRepository<UserInfoModel, Long>, JpaSpecificationExecutor<UserInfoModel> {
    UserInfoModel getByUserLoginId(String userLoginId);

    List<UserInfoModel> findAll();
}
