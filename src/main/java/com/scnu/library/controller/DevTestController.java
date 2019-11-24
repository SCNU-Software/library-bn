package com.scnu.library.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.scnu.library.listener.ExcelReadListener;
import com.scnu.library.mapper.bookDesMainMapper;
import com.scnu.library.model.dbModel.bookDesMain;
import com.scnu.library.model.dbModel.bookDesMainExample;
import com.scnu.library.model.resultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author JabinGP
 * @Date 2019-11-24 9:19
 * @Description 开发中的接口，测试使用
 *
 * @Edit Fisher@2019-11-24: 修改拼写错误，donaloadExcel -> downloadExcel
 */

@RestController
@RequestMapping(value = "/api/test/")
public class DevTestController {

    // 注入dao
    @Autowired
    private  bookDesMainMapper bookDao;

    /**
     * 获取所有书籍数据
     * @return 无数据的200ok响应模板
     */
    @GetMapping(value = "book")
    public Object getAll(){

        bookDesMainExample example = new bookDesMainExample();
        bookDesMainExample.Criteria criteria = example.createCriteria();

        List<bookDesMain> all = bookDao.selectByExampleWithBLOBs(example);

        return new resultModel<>("200","ok",all);
    }

    /**
     * 从某个本地xls文件导入数据到数据库
     * @return 无数据的200ok响应模板
     */
    @GetMapping(value = "/excel/import")
    public Object downloadExcel(){
        // 指定文件路径
        String fileName = "/Users/jabin/code/tmp/readBook.xls";

        // 读取并写入数据库
        ExcelReader excelReader = EasyExcel.read(fileName, bookDesMain.class, new ExcelReadListener(bookDao)).build();
        ReadSheet readSheet = EasyExcel.readSheet(0).build();
        excelReader.read(readSheet);

        // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
        excelReader.finish();

        return new resultModel<String>("200","ok",null);
    }


    /**
     * 将数据库所有文件导出为本地的某个文件
     * @return 无数据的200ok响应模板
     */
    @GetMapping(value = "/excel/export")
    public Object writeExcel(){
        // 读取所有数据
        bookDesMainExample example = new bookDesMainExample();
        bookDesMainExample.Criteria criteria = example.createCriteria();
        List<bookDesMain> all = bookDao.selectByExampleWithBLOBs(example);

        // 指定文件路径
        String fileName = "/Users/jabin/code/tmp/book.xls";

        // 这里 需要指定写用哪个class去写
        ExcelWriter excelWriter = EasyExcel.write(fileName, bookDesMain.class).build();
        WriteSheet writeSheet = EasyExcel.writerSheet("Sheet1").build();
        excelWriter.write(all, writeSheet);

        /// 千万别忘记finish 会帮忙关闭流
        excelWriter.finish();

        return new resultModel<String>("200","ok",null);
    }

}
