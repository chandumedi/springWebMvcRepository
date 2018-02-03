package com.web.boot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.boot.bo.TodoBO;

@Service
@Transactional
public class TODOService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private MessageSource messageSource;

	private MessageSourceAccessor accessor;

	@PostConstruct
	private void init() {
		accessor = new MessageSourceAccessor(messageSource, Locale.ENGLISH);
		System.out.println("File readed!!!");
	}

	public List<TodoBO> fetchTodoList(String listCode) {
		System.out.println("Jdbc Object" + jdbcTemplate);
		System.out.println("This is read from property file::::"
				+ accessor.getMessage("title.test"));
		List<TodoBO> listData = new ArrayList<>();
		listData.add(new TodoBO("Expense Types", "Chandu", 2));
		listData.add(new TodoBO("refresh Screen", "rajani", 2));
		listData.add(new TodoBO("Lock Employee", "Sai ram", 3));
		return listData;
	}

}
