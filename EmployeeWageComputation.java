package first;

public class assignOne {
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_DAY_HOUR = 8;
	public static final int PART_DAY_HOUR = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation program");
		int empCheck = (int) (Math.floor(Math.random() * 10) %3);
		int dailyempwage = 0;
		int partempwage = 0;
		if( empCheck == 1){
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
		dailyempwage = WAGE_PER_HOUR * FULL_DAY_HOUR;
		partempwage = WAGE_PER_HOUR * PART_DAY_HOUR;
		System.out.println("full time employee wage-"+ dailyempwage);
		System.out.println("parttime employee wage-"+ partempwage);
		



	}

}
