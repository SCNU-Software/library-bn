package com.scnu.library.model.dbModel;

import com.alibaba.excel.annotation.ExcelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author JabinGP
 * @Date 2019-11-24 9:45
 * @Descript Mybatis generator 自动生成的类，加入Excel注解以适配Excel读写
 */

public class bookDesMain implements Serializable {
    @ExcelProperty("编号")
    private Integer id;
    @ExcelProperty("书名")
    private String title;
    @ExcelProperty("作者")
    private String author;
    @ExcelProperty("定价")
    private Integer price;
    @ExcelProperty("出版社")
    private String press;
    @ExcelProperty("出版时间")
    private Date pubTime;
    @ExcelProperty("简介")
    private String brief;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }
}