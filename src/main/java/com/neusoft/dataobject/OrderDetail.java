package com.neusoft.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liuboting
 * @date 2020/6/28 7:57
 */
@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;

    private String orderId;

    private String productName;

    private BigDecimal productPrice;

    private int productQuantity;

    private String productIcon;

    private Date createTime;

    private Date updateTime;
}
