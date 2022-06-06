package com.a243.magicbazaar.controller;

import com.a243.magicbazaar.dao.pojo.Commodity;
import com.a243.magicbazaar.service.CommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author minatomisako24
 * @date 2022/6/6 15:34
 */
@Api(value = "商品")
@RestController
@RequestMapping(value = "commodity")
public class CommodityController {
    private final CommodityService commodityService;

    @Autowired
    public CommodityController(CommodityService commodityService) {
        this.commodityService = commodityService;
    }

    @ApiOperation(value = "查询")
    @GetMapping(value = "select")
    public List<Commodity> select() {
        return commodityService.list();
    }
}
