package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by zhichao on 2018/7/23.
 */
@Entity
@Data
@Table(name = "product_info")
public class ProductInfo {

    @Id
    private String productId;

    /** 名字 */
    private String productName;

    /** 单价 */
    private BigDecimal productPrice;

    /** 库存 */
    private Integer productStock;

    /** 描述 */
    private String productDescription;

    /** 商品图标 */
    private String productIcon;

    /** 状态  0正常 1下架*/
    private Integer productStatus;

    /** 类目编号 */
    private Integer categoryType;
}
