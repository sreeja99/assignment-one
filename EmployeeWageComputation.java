package first;

public class assignOne {
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_DAY_HOUR = 8;
	public static final int PART_DAY_HOUR = 4;
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
	public static final int NO_OF_WORK_DAYS = 20;
	public static final int HOURS_WORKING = 100;
	
	public static int computeEmpWage(String companyName,int empWagePerHr,int 
			n0OfWorkingDays,int maxHrsPerMonth) {
		int empHrs = 0;
		int workDays = 0;
		int totalEmpHrs = 0;
		while(totalEmpHrs <= HOURS_WORKING && workDays <NO_OF_WORK_DAYS) {
			workDays++;
			int empCheck = (int)(Math.floor(Math.random()*10)%2);
			switch(empCheck) {
			case IS_FULL_TIME :
				empHrs = 8;
				break;
			case IS_PART_TIME :
				empHrs = 4;
				break;
			default:
				empHrs =0;
			}
			totalEmpHrs += empHrs;
		}
			System.out.println("Day:"+ workDays +"\tTotal Working Hours:"+totalEmpHrs);
			
//		}
		int totalEmpWage = totalEmpHrs * WAGE_PER_HOUR;
		System.out.println("Total Emp Wage:"+totalEmpWage);
		return totalEmpWage;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computeEmpWage("Levis",15,25,120);
		computeEmpWage("Lavie",12,30,95);
	}
}






