package com.translate.vo;
/**
 * @author hzy
 * @date 2016年11月23日
 *
 */
public class RespVo{
	/**
	 * 响应状态  0：失败；1：成功 -1
	 */
	private int retStatus;
	/**
	 * 异常信息
	 */
	private String errMsg;
	/**
	 * 响应数据
	 */
	private Object retValue;
	public int getRetStatus() {
		return retStatus;
	}
	public void setRetStatus(int retStatus) {
		this.retStatus = retStatus;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public Object getRetValue() {
		return retValue;
	}
	public void setRetValue(Object retValue) {
		this.retValue = retValue;
	}

}
