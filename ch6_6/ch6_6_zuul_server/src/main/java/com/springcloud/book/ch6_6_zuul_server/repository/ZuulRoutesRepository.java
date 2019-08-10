package com.springcloud.book.ch6_6_zuul_server.repository;

import com.springcloud.book.ch6_6_zuul_server.model.ZuulRoutesModel;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/10
 * @Time: 23:52
 * @email: inwsy@hotmail.com
 * Description:
 */
public interface ZuulRoutesRepository extends PagingAndSortingRepository<ZuulRoutesModel, Long>, JpaSpecificationExecutor<ZuulRoutesModel> {

}
