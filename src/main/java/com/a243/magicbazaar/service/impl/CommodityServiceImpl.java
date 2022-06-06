package com.a243.magicbazaar.service.impl;

import com.a243.magicbazaar.dao.mapper.CommodityMapper;
import com.a243.magicbazaar.dao.pojo.Commodity;
import com.a243.magicbazaar.service.CommodityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author minatomisako24
 * @date 2022/6/6 15:35
 */
@Service
public class CommodityServiceImpl extends ServiceImpl<CommodityMapper, Commodity> implements CommodityService {

    private final CommodityMapper commodityMapper;

    @Autowired
    public CommodityServiceImpl(CommodityMapper commodityMapper) {
        this.commodityMapper = commodityMapper;
    }
}
