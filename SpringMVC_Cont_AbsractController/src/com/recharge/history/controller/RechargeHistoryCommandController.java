package com.recharge.history.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.recharge.history.dto.RechargeHistoryDTO;
import com.recharge.history.service.ManageOrderService;

public class RechargeHistoryCommandController  extends AbstractController {
   private ManageOrderService manageOrderService;
	public ManageOrderService getManageOrderService() {
	return manageOrderService;
}

public void setManageOrderService(ManageOrderService manageOrderService) {
	this.manageOrderService = manageOrderService;
}

	public RechargeHistoryCommandController() {
	System.out.println("inside the RechargeHistoryCommanController class constructor");
  }

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("inside the controller method");
		ModelAndView mav = null;
		mav = new ModelAndView();
		List<RechargeHistoryDTO>  listRechargeHistoryDTO = manageOrderService.rechargeHistoryDetailsDTO();
		mav.addObject("historydetails", listRechargeHistoryDTO);
		return mav;
	}
}
