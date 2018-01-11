package com.viewresolvers.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.viewresolvers.dto.Course;

public class RenderExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook hssfWorkBook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment; filename=\"test.xls\"");
		System.out.println("inside buildExcelDocument");
		HSSFSheet sheet = hssfWorkBook.createSheet("test");
		HSSFRow header = sheet.createRow(0);
		header.createCell(0).setCellValue("Id");
		header.createCell(1).setCellValue("name");
		header.createCell(2).setCellValue("date");
		List<Course> listCourse = (List<Course>)model.get("courselist");
	
			for(int i=0;i<listCourse.size();i++) {
				Course course=(Course)listCourse.get(i);
				HSSFRow headerRecur = sheet.createRow(i+1);
				headerRecur.createCell(0).setCellValue(course.getId());
				headerRecur.createCell(1).setCellValue(course.getName());
				headerRecur.createCell(2).setCellValue(course.getDate());
			  }
		
	}

}
