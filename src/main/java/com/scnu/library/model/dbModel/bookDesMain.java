package com.scnu.library.model.dbModel;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author JabinGP
 * @Date 2019-11-24 9:45
 * @Descript Mybatis generator 自动生成的类
 *
 * @Edit JabinGP@2019-11-25：添加@Data，去掉get，set、将excel注解独立为另一个model。
 */

@Data
public class bookDesMain implements Serializable {
    private Integer id;
    private String title;
    private String author;
    private Integer price;
    private String press;
    private Date pubTime;
    private String brief;

    private static final long serialVersionUID = 1L;
}