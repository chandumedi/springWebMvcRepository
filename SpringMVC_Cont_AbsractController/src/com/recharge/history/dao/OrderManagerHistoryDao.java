package com.recharge.history.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.recharge.history.bo.RechargeHistoryBO;

public class OrderManagerHistoryDao {

private JdbcTemplate jdbcTemplate;
private final String RECHARGE_HISTORY_RECORDS  = "select recharge_order_no ,recharge_date ,mobile_num ,amount ,provider ,status from sai.recharge_records order by recharge_date asc;";
   
public OrderManagerHistoryDao(JdbcTemplate jdbcTemplate) {
	   System.out.println("inside the Dao class constructor");
	  this.jdbcTemplate = jdbcTemplate; 
  }

public List<RechargeHistoryBO> rechargeHistoryDetailsBo(){
System.out.println("inside the dao class rechargeHistory Details method");
      List<RechargeHistoryBO> listRechargeHistoryBO = null; 
     
      listRechargeHistoryBO = jdbcTemplate.query(RECHARGE_HISTORY_RECORDS, new RowMapper<RechargeHistoryBO>() {
    	  @Override
    	public RechargeHistoryBO mapRow(ResultSet rs, int row) throws SQLException {
    		  System.out.println("inside maprow  method of inner class");
    		  RechargeHistoryBO rechargeHistoryBo = null;
    		  rechargeHistoryBo  = new  RechargeHistoryBO();
    		  rechargeHistoryBo.setRechargeOrderNo(rs.getString(1));
    		  rechargeHistoryBo.setRechargeDate(rs.getDate(2));
    		  rechargeHistoryBo.setMobileNo(rs.getString(3));
    		  rechargeHistoryBo.setAmount(rs.getInt(4));
    		  rechargeHistoryBo.setProvider(rs.getString(5));
    		  rechargeHistoryBo.setStatus(rs.getString(6));
    		return rechargeHistoryBo;
    	}
	});

	return listRechargeHistoryBO;
}
}
