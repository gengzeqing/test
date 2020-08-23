package com.pojo;

import java.io.Serializable;

public class SkuDTO implements Serializable {

    private String skuId;
    private String skuCode;
    private Integer skuPrice;
    private Long itemId;
    private String itemName;
    private String color;
    private String fomatDate;


    @Override
    public String toString() {
        return "SkuDTO{" +
                "skuId=" + skuId +
                ", skuCode='" + skuCode + '\'' +
                ", skuPrice=" + skuPrice +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", color='" + color + '\'' +
                ", fomatDate='" + fomatDate + '\'' +
                '}';
    }

    public String getFomatDate() {
        return fomatDate;
    }

    public void setFomatDate(String fomatDate) {
        this.fomatDate = fomatDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public Integer getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Integer skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
