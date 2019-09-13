package com.springcloud.book.ch14_1_storage_server.controller;

import com.springcloud.book.ch14_1_common.OperationResponse;
import com.springcloud.book.ch14_1_common.storage.ReduceStockRequestVO;
import com.springcloud.book.ch14_1_storage_server.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/9/7
 * @Time: 22:15
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
@RequestMapping("/storage")
@Slf4j
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping("/reduceStock")
    @ResponseBody
    public OperationResponse reduceStock(@RequestBody ReduceStockRequestVO reduceStockRequestVO) throws Exception {
        return storageService.reduceStock(reduceStockRequestVO);
    }
}
