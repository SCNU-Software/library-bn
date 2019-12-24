package com.scnu.library.model.requestModel;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: JabinGP
 */
@Data
public class addExcelReq {
    MultipartFile excelFile;
}
