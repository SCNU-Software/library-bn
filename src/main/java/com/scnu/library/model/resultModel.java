package com.scnu.library.model;

import com.scnu.library.tools.enums.responseEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Fisher
 * @Description 请求数据返回模版
 * @param <T>
 */
@Data
public class resultModel<T> implements Serializable{

	private static final long serialVersionUID = 1L;

	// 响应消息
	private String code = "0";
	private String msg = "无消息";

	// 分页参数
	private int currentPage = 0;
	private int totalPage = 0;

	// 响应数据
	private List<T> data = new LinkedList<>();

	public resultModel(){
	}

	public resultModel(String code, String message){
		this.code = code;
		this.msg = message;
	}

	public resultModel(String code, String message, List<T> result){
		this.code = code;
		this.msg = message;
		this.data = result;
	}

	// 设置返回结果为成功
	public void setOk() {
		this.code = responseEnum.OK;
		this.msg = responseEnum.OK_MSG;
	}

	// 设置返回结果为失败
	public void setFail() {
		this.code = responseEnum.ERR;
		this.msg = responseEnum.ERR_MSG;
	}

	// 设置分页信息
	public void setPageInfo(int currentPage, int totalPage) {
		this.currentPage = currentPage;
		this.totalPage = totalPage;
	}

}
