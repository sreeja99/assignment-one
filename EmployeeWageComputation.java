package first;

import java.util.ArrayList;

public class EmpWageBuilder  implements IComputeEmpWage {
	// static variables
	public static final int IS_PART_TIME = 2;
	public static final int IS_FULL_TIME = 1;

	private int numOfCompanies = 0;
    private ArrayList<CompanyEmpWage> companyEmpWageList;

	public EmpWageBuilder() {
		companyEmpWageList = new ArrayList<>();
	}

	public void addCompanyEmpWage(int empWagePerHour, int workDaysPerMonth, int workHoursPerMonth, String companyName) {
		
		CompanyEmpWage companyEmpWage =new CompanyEmpWage(empWagePerHour,workDaysPerMonth, workHoursPerMonth, companyName); 
		companyEmpWageList.add(companyEmpWage);
	}

	public void ComputeEmpWage() {
		for (int i = 0; i < numOfCompanies; i++) {
			CompanyEmpWage companyEmpWage =companyEmpWageList.get(i);
			companyEmpWage.setTotalWage(this.ComputeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
			
		}
	}

	public int ComputeEmpWage(CompanyEmpWage companyEmpWage) {
		// variables
		int dayCount = 0;
		int totalEmpHours = 0;
		int empHour = 0;
		// Computation
		while (empHour <= companyEmpWage.workHoursPerMonth && dayCount < companyEmpWage.workDaysPerMonth) {
			dayCount++;

			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

			switch (empCheck) {
			case 1:
				empCheck = IS_FULL_TIME;
				System.out.println("Employee Present - FULL TIME");
				empHour = 8;
				break;
			case 2:
				empCheck = IS_PART_TIME;
				System.out.println("Employee Present - PART TIME");
				empHour = 4;
				break;
			default:
				System.out.println("Employee is Absent");
				empHour = 0;
				break;
			}
			totalEmpHours += empHour;

			// Tabular Display of Employee Details for Maximum Monthly Hours or Days
			System.out.println("Day\t" + dayCount + " Hours Worked\t" + empHour);
		}
		return totalEmpHours * companyEmpWage.empWagePerHour;
	}
public class CompanyEmpWage {

	public final int empWagePerHour;
	public final int workDaysPerMonth;
	public final int workHoursPerMonth;
	public final String companyName;
	public int totalEmpWage;

	public CompanyEmpWage(int empWagePerHour, int workDaysPerMonth, int workHoursPerMonth, String companyName) {
		this.companyName = companyName;
		this.empWagePerHour = empWagePerHour;
		this.workDaysPerMonth = workDaysPerMonth;
		this.workHoursPerMonth = workHoursPerMonth;
	}

	public void setTotalWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
}
public interface IComputeEmpWage {
	public void ComputeEmpWage();

	public void addCompanyEmpWage(int empWagePerHour, int workDaysPerMonth, int workHoursPerMonth, String companyName);
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Welcome Message
		System.out.println("Welcome to Employee Wage Computation");
//		IComputeEmpWage empWageBuilder = new EmpWageBuilder();
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage(20, 15, 100, "Company A");
		empWageBuilder.addCompanyEmpWage(10, 20, 90, "Company B");
		empWageBuilder.ComputeEmpWage();
	}
}

	
