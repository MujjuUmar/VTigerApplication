package Pratice;

import GenericUtility.JavaUtility;
//import io.opentelemetry.sdk.metrics.data.Data;

public class JavaUtilityPratice {
	public static void main(String[] args) {
		JavaUtility jutil = new JavaUtility();
		String 	DateStamp=jutil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
		System.out.println(DateStamp);
		int Random = jutil.getRandomNumber(1232);
		System.out.println(Random);
	}
	
}
