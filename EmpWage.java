package WageComp;

public class EmpWage {

	public static void main(String[] args) {
		//Auto-generated method stud
		
		//constants
		final int IS_FULL_TIME=1;
		final int IS_PART_TIME=2;
		final int EMP_WAGE_PER_HOUR=20;
		final int DAYS_IN_MONTH=20;
		final int WORKHOURS_PER_MONTH=100;
		
		//variables
		int empWage=0;
		int empHours=0;
		int empMonthWage=0;
		
	   //computation
		int empCheck = (int) Math.floor(Math.random()*10) % 3;
		System.out.println("empCheck :"+empCheck);
	    
		switch(empCheck)
		{
		   case IS_PART_TIME:
			   System.out.println("Employee is Present & Full Time");
			   empHours=8;
			   break;
			   
		   case IS_FULL_TIME:
			   System.out.println("Employee is Present & Part Time");
			   empHours=8;
			   break;
			   
		   default:
			   System.out.println("Employee is Abesent");
			   empHours=0;
		}
		if(WORKHOURS_PER_MONTH/empHours<DAYS_IN_MONTH && empHours!=0)
		{
		empWage= WORKHOURS_PER_MONTH * EMP_WAGE_PER_HOUR;
		System.out.println("Employee Wage for 100 hrs :"+empWage);
		}
		else if(WORKHOURS_PER_MONTH/empHours >=DAYS_IN_MONTH && empHours!=0)
		{
			empWage= empHours * WORKHOURS_PER_MONTH * EMP_WAGE_PER_HOUR;
			System.out.println("Employee Wage for 20 days :"+empWage);
		}

	}

}

