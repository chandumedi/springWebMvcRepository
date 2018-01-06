package com.recharge.history.service;

import java.util.ArrayList;
import java.util.List;

import com.recharge.history.bo.RechargeHistoryBO;
import com.recharge.history.dao.OrderManagerHistoryDao;
import com.recharge.history.dto.RechargeHistoryDTO;

public class ManageOrderService {
private OrderManagerHistoryDao orderManagerHistoryDao;
	public OrderManagerHistoryDao getOrderManagerHistoryDao() {
	return orderManagerHistoryDao;
}
public void setOrderManagerHistoryDao(OrderManagerHistoryDao orderManagerHistoryDao) {
	this.orderManagerHistoryDao = orderManagerHistoryDao;
}
	public ManageOrderService() {
		System.out.println("iside ManageOrderService class constructor");
	}
  public List<RechargeHistoryDTO> rechargeHistoryDetailsDTO(){
	  List<RechargeHistoryDTO> listRechargeHistoryDTO = null;
	  RechargeHistoryDTO rechargeHistoryDTO = null;
	  listRechargeHistoryDTO = new ArrayList<RechargeHistoryDTO>();
	  List<RechargeHistoryBO> listRechargeHistoryBO =  orderManagerHistoryDao.rechargeHistoryDetailsBo();
     for(RechargeHistoryBO  rechargeHistoryBO  : listRechargeHistoryBO){
    	 rechargeHistoryDTO = new RechargeHistoryDTO();
    	 rechargeHistoryDTO.setRechargeOrderNo( rechargeHistoryBO.getRechargeOrderNo());
    	 rechargeHistoryDTO.setRechargeDate(rechargeHistoryBO.getRechargeDate());
    	 rechargeHistoryDTO.setMobileNo(rechargeHistoryBO.getMobileNo());
    	 rechargeHistoryDTO.setAmount(rechargeHistoryBO.getAmount());
    	 rechargeHistoryDTO.setStatus(rechargeHistoryBO.getStatus());
    	 listRechargeHistoryDTO.add(rechargeHistoryDTO);
     }
	  return listRechargeHistoryDTO;
  }
}
