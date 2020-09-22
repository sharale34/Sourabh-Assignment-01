package WageComp;

public class EmpWage {

	public static void main(String[] args) {
		//Auto-generated method stud
		
		//constants
		final int IS_FULL_TIME=1;
		final int IS_PART_TIME=2;
		final int EMP_WAGE_PER_HOUR=20;
		
		//variables
		int empWage=0;
		int empHours=0;
		
	   //computation
		double empCheck = Math.floor(Math.random()*10) % 3;
		if(empCheck == IS_FULL_TIME)
		{
			empHours=8;
			System.out.println("Employee is Present");
		}
		else if(empCheck == IS_PART_TIME)
		{
			empHours=8;
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}
		empWage= empHours * EMP_WAGE_PER_HOUR;
		System.out.println("Employee Wage :"+empWage);

	}

}
