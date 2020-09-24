package first;

public class assignOne {
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_DAY_HOUR = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation program");
		double empCheck = Math.floor(Math.random() * 10) %3;
		if( empCheck == 1){
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}


	}

}

