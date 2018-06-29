import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			/*// load the Driver Class
			 Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		      //getTime() returns the current date in default time zone
		      Date date = calendar.getTime();
		      int day = calendar.get(Calendar.DATE);
		      //Note: +1 the month for current month
		      int month = calendar.get(Calendar.MONTH) + 1;
		      int year = calendar.get(Calendar.YEAR);
		      int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		      int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		      int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

		      System.out.println("Current Date is: " + date);
		      System.out.println("Current Day is:: " + day);
		      System.out.println("Current Month is:: " + month);
		      System.out.println("Current Year is: " + year);
		      System.out.println("Current Day of Week is: " + dayOfWeek);
		      System.out.println("Current Day of Month is: " + dayOfMonth);
		      System.out.println("Current Day of Year is: " + dayOfYear);

		//	logger.info("Config Database Connected Successfully");	
		      
		      
			fcdate = fcnotIssueDate.substring(0,4)+  "/" +fcnotIssueDate.substring(4,6)+"/"+fcnotIssueDate.substring((fcnotLength-2),fcnotLength);
	        fcextdate = fcvruextIssueDate.substring(0,4)+ "/"+fcvruextIssueDate.substring(4,6)+"/"+fcvruextIssueDate.substring((fcnotLength-2),fcnotLength);
			 String dateIssuedOrig="27/06/2018";
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	         	Date d=dateFormat.parse(dateIssuedOrig);
	        	  Calendar cal = Calendar.getInstance();
	        	  Date dateIssueToday=new Date();
	        	  String as=dateFormat.format(new Date());
	        	  
	              cal.add(Calendar.DATE, 0);
	          
	              System.out.println(as);
	              System.out.println(dateIssueToday.compareTo(d));
			String sDate1="1296/22/19";  
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");  
Date as=dateFormat.parse(sDate1);
System.out.println(dateFormat.format(as));*/
		    //System.out.println(sDate1+"\t"+date1); 
			
			 String dateIssuedOrig="2018-27-06";
			   DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			   //System.out.println("Today's date is "+dateFormat.format(cal.getTime()));
			   Calendar cal1 = Calendar.getInstance();
			   cal1.add(Calendar.DATE, 0);
			   System.out.println("Yesterday's date was "+dateFormat.format(cal1.getTime())); 
			   System.out.println("Yesterday's date was "+dateFormat.format(cal1.getTime())); 
			   System.out.println(dateIssuedOrig.equals(dateFormat.format(cal1.getTime())));
		} catch (Exception  e) {				
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		

	}

}
