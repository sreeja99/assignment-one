package first;

public class assignOne {
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_DAY_HOUR = 8;
	public static final int PART_DAY_HOUR = 4;
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
	public static final int NO_OF_WORK_DAYS = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dailyempwage = 0;
		int monthlywage =0;
		int noHour =0;
		System.out.println("Welcome to Employee Wage Computation program");
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
	        switch((int)empCheck) {
	             case IS_FULL_TIME :
	    	          System.out.println("Employer is present");
	    	          noHour = FULL_DAY_HOUR;
	    	          break;
	             case IS_PART_TIME:
	    	          System.out.println("Employer is absent");
	    	          noHour = PART_DAY_HOUR;
	    	          break;
	             default:
	    	          System.out.println("Employer is absent");
	    	
	    }
	        dailyempwage = noHour * WAGE_PER_HOUR ;
	        System.out.println("Daily wage-"+ dailyempwage);
	        monthlywage = dailyempwage * NO_OF_WORK_DAYS;
	        System.out.println("Monthlywage-" + monthlywage);
	}
}





