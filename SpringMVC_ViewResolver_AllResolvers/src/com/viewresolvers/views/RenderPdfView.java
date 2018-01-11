package com.viewresolvers.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.viewresolvers.dto.Course;

public class RenderPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter pdfWriter, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("inside PdfMethod");
        List<Course> courses = (List<Course>) map.get("courselist");
        PdfPTable table = new PdfPTable(3);
        table.addCell("ID");
        table.addCell("Name");
        table.addCell("Date");
        for (Course course : courses){
            table.addCell(String.valueOf(course.getId()));
            table.addCell(course.getName());
            table.addCell(course.getDate().toString());
        }
        document.add(table);	
	}
}
