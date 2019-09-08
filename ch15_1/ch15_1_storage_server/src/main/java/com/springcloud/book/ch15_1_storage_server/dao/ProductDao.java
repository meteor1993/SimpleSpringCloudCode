package com.springcloud.book.ch15_1_storage_server.dao;

import com.springcloud.book.ch15_1_storage_server.model.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductDao extends CrudRepository<Product, Long> {
    /**
     * 获取库存
     *
     * @param productId 商品 ID
     * @return 库存
     */
    @Query("SELECT stock FROM Product WHERE id = :productId")
    Integer getStock(@Param("productId") Long productId);

    /**
     * 扣减库存
     *
     * @param productId 商品 ID
     * @param amount 扣减数量
     * @return 影响记录行数
     */
    @Modifying
    @Query("UPDATE Product SET stock = stock - :amount WHERE id = :productId")
    Integer reduceStock(@Param("productId") Long productId, @Param("amount") Integer amount);
}
