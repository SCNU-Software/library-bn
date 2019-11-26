package com.scnu.library.model.requestModel;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: JabinGP
 * @Date: 2019/11/25 23:06
 */

@Data
public class importExcelReq {
    MultipartFile excelFile;
}
