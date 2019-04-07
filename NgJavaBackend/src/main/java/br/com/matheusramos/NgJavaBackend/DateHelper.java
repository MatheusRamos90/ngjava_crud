package br.com.matheusramos.NgJavaBackend;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by: Matheus Ramos - https://matheusramos.com/
 * */

public class DateHelper {

	private String dateTimeZone;
	
	public DateHelper() {
		
	}

	public String getDateTimeZone() {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		df.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
		this.dateTimeZone = df.format(date);
		
		return dateTimeZone;
	}
	
}
