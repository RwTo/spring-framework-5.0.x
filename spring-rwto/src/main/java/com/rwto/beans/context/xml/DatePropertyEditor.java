package com.rwto.beans.context.xml;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author renmw
 * @create 2023/9/12 12:58
 **/
public class DatePropertyEditor extends PropertyEditorSupport {
	private final String format = "yyyy-MM-dd";
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			Date parse = sdf.parse(text);
			this.setValue(parse);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
