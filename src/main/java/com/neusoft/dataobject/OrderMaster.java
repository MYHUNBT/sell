package com.neusoft.dataobject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liuboting
 * @date 2020/6/27 17:39
 * dataobject中的类既是实体类，他是与数据库中的表字段一一对应的类
 * 写成JavaBean
 */
@Entity //实体类
@Data //生成所有成员变量的Getter和Setter方法
public class OrderMaster {
    /*
    * 订单id
    */
    @Id  //PrimaryKey 指定主键
    private String orderId;
    /*
     * 买家名字
     */
    private String buyerName;
    /*
     * 订单的总金额
     */
    private BigDecimal orderAmount;
    /*
     * 买家电话
     */
    private Integer buyerPhone;
    /*
     * 买家地址
     */
    private String buyerAddress;
    /*
     * 订单的状态
     */
    private int orderStatus;
    /*
     * 订单是否支付
     */
    private int payStatus;
    /*
     * 订单开始配送时间
     */
    private Date createTime;
    /*
     * 订单的更新时间
     */
    private Date updateTime;
}
