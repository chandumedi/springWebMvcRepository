package com.recharge.history.bo;

import java.util.Date;

public class RechargeHistoryBO {
 private String rechargeOrderNo;
 private Date rechargeDate;
 private String mobileNo;
 private int amount;
 private String provider;
 private String status;
public String getRechargeOrderNo() {
	return rechargeOrderNo;
}
public void setRechargeOrderNo(String rechargeOrderNo) {
	this.rechargeOrderNo = rechargeOrderNo;
}
public Date getRechargeDate() {
	return rechargeDate;
}
public void setRechargeDate(Date rechargeDate) {
	this.rechargeDate = rechargeDate;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getProvider() {
	return provider;
}
public void setProvider(String provider) {
	this.provider = provider;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
