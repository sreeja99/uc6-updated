package first;

public class assignOne {
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_DAY_HOUR = 8;
	public static final int PART_DAY_HOUR = 4;
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
//	public static final int NO_OF_WORK_DAYS = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dailyempwage = 0;
		int noHour =0;
		int dayCount =0 ;
		System.out.println("Days\twage\tHr\tType of Emp");
		int choice =1;
	    switch(choice) {
	        case IS_FULL_TIME :
	        	System.out.println("Full time employee present");
				System.out.println("Days \t perDayHour \tTotal Wage");
				int i=1;
				while(noHour<100) {
					if (noHour<96)
						noHour+=8;
					else
						noHour+=4;
					dailyempwage=noHour*20;
					System.out.println(i+" \t "+noHour+" \t \t"+dailyempwage);
					i+=1;
				}
	        case IS_PART_TIME:
	        	System.out.println("Part time employee present");
				System.out.println("Days \t perDayHour \tTotal Wage");
				while(dayCount<20) {
					dayCount+=1;
					noHour+=4;
					dailyempwage=noHour*20;
					System.out.println(dayCount+" \t "+noHour+" \t \t"+dailyempwage);
				}
				break;
	        default:
	    	   System.out.println("Employer is absent");
	    	
	    }
        }
	}





