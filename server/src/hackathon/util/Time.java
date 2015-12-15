package hackathon.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Time {
	
	private static DateTimeFormatter FORMAT = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm");
	
	public static DateTime parse(String s) {
		return FORMAT.parseDateTime(s);
	}
}
