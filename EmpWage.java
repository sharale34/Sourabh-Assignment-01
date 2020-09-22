package WageComp;

public class EmpWage {

	public static void main(String[] args) {
		//Auto-generated method stud
		
		//constants
		final int IS_FULL_TIME=1;
		final int IS_PART_TIME=2;
		final int EMP_WAGE_PER_HOUR=20;
		final int DAYS_IN_MONTH=20;
		
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
			   empHours=8;
			   break;
			   
		   case IS_FULL_TIME:
			   empHours=8;
			   break;
			   
		   default:
			   empHours=0;
		}
		empWage= empHours * EMP_WAGE_PER_HOUR;
		empMonthWage=empWage * DAYS_IN_MONTH;
		System.out.println("Employee Monthly Wage :"+empMonthWage);

	}

}

