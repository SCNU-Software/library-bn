package com.scnu.library.model.excelMode;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author JabinGP
 * @Date 2019-11-25 18:59
 * @Descript book对应的excel模型，用于excel读写
 */

@Data
public class bookExcelModel{
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
}
