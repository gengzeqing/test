package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class Sku implements Serializable {

    private Long id;
    private String code;
    private Integer price;
    private String color;
    private Date fomatDate;


    @Override
    public String toString() {
        return "Sku{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", fomatDate=" + fomatDate +
                '}';
    }

    public Date getFomatDate() {
        return fomatDate;
    }

    public void setFomatDate(Date fomatDate) {
        this.fomatDate = fomatDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
