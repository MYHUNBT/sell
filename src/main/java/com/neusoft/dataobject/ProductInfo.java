package com.neusoft.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liuboting
 * @date 2020/6/28 8:24
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private int productStock;

    private String productDescription;

    private String productIcon;

    private int productStatus;

    private int CategoryType;

    private Date createTime;

    private Date updateTime;
}
