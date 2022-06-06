package com.a243.magicbazaar.dao.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author minatomisako24
 * @date 2022/6/6 15:32
 */
@Data
public class Commodity {
    private Long id;
    private String title;
    private String subTitle;
    private BigDecimal price;
    private Long commodityNumber;
    private String description;
}
