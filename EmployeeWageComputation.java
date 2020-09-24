package first;

public class assignOne {
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_DAY_HOUR = 8;
	public static final int PART_DAY_HOUR = 4;
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
	public static final int NO_OF_WORK_DAYS = 20;
	public static final int HOURS_WORKING = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Employee Wage Computation program");

		
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if( empCheck == 1){
			System.out.println("Employee is present");
			System.out.println("Wage- "+HOURS_WORKING *WAGE_PER_HOUR);
		}
		else {
			System.out.println("Employee is absent");
			System.out.println("Wage -"+ NO_OF_WORK_DAYS *PART_DAY_HOUR*WAGE_PER_HOUR);
		}
		


	}

}

