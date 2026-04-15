package GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

//import io.opentelemetry.sdk.metrics.data.Data;

/**
 * This is an Utility class which stores the functionality from java library
 */

public class JavaUtility {
	
	/**
	 * This is a Generic Method to fetch the Calendar Details
	 * @param pattern
	 * @return
	 */
	public String getCalendarDetails(String pattern) {
		Calendar cal = Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String value = sdf.format(d);
		return value;
	}
	
	/**
	 * This is the generic method to generate random number
	 * @param EndNumber
	 * @return
	 */
	
	public int getRandomNumber(int EndNumber) {
		Random r = new Random();
		int num = r.nextInt(EndNumber);
		return num;
		
		
		
	}
	
	
}
