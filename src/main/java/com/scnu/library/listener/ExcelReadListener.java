package com.scnu.library.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.scnu.library.mapper.bookDesMainMapper;
import com.scnu.library.model.dbModel.bookDesMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.parameters.P;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JabinGP
 * @Date: 2019-11-24 9:18
 * @Description Excel读取的回调类，在这里构建一个定长动态列表，列表满一次则存一次数据库，直至所有数据读取完成
 */

public class ExcelReadListener extends AnalysisEventListener<bookDesMain> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelReadListener.class);
    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 3000;
    List<bookDesMain> list = new ArrayList<bookDesMain>();

    /**
     * bookDao，数据持久化
     */
    private bookDesMainMapper bookDao;

    public ExcelReadListener() {

    }

    /**
     * 带dao构造，需要传入SpringBoot管理的dao
     * @param bookDao
     */
    public ExcelReadListener(bookDesMainMapper bookDao) {
        this.bookDao = bookDao;
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data
     *            one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(bookDesMain data, AnalysisContext context) {
        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(data));
        list.add(data);

        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if(list.size()>=BATCH_COUNT){
            saveData();
            // 存储完成清理 list
            list.clear();
        }
    }

    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        LOGGER.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", list.size());
        for(int i=0;i<list.size();i++){
            // 避免与自增主键冲突
            list.get(i).setId(null);
            bookDao.insertSelective(list.get(i));
        }
        LOGGER.info("存储数据库成功！");
    }

}
