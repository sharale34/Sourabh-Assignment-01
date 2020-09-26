package WageComp;

public class EmpWage {
	
	//constants
		public static final int IS_FULL_TIME=1;
		public static final int IS_PART_TIME=2;
		public static final int EMP_WAGE_PER_HOUR=20;
		public static final int DAYS_IN_MONTH=20;
		public static final int WORKHOURS_PER_MONTH=100;
        int empWage = 0;
        int dayCount = 0;
        int empHours = 0;
        int totalWage = 0;
        int hoursWorked = 0;
        
        public int calculateWage()
        {
		//variables
		int empWage = 0;
		int empHours = 0;
		int dayCount = 0;
		int totalWage = 0;
        int hoursWorked = 0;
		
	   //computation
		int empCheck = (int) (Math.floor(Math.random()*10) % 3);
		System.out.println("empCheck :"+empCheck);
	    
		switch(empCheck)
		{
		   case 1:
		       empCheck = IS_FULL_TIME;
			   System.out.println("Employee is Present & Full Time");
			   empHours=8;
			   break;
			   
		   case 2:
			   empCheck = IS_PART_TIME;
			   System.out.println("Employee is Present & Part Time");
			   empHours=4;
			   break;
			   
		   default:
			   System.out.println("Employee is Absent");
			   break;
		}
		//daily wage calculation
		empWage = empHours * EMP_WAGE_PER_HOUR;
		System.out.println("Day\tHours Worked\tTotal Wage");
		while((hoursWorked + empHours) <= WORKHOURS_PER_MONTH && dayCount < DAYS_IN_MONTH)
		{
			dayCount++;
			hoursWorked += empHours;
			totalWage += empWage;
			System.out.println(" " + dayCount + " \t" + hoursWorked + " \t\t" + totalWage);
		}
		if(hoursWorked < WORKHOURS_PER_MONTH && dayCount < DAYS_IN_MONTH)
		{
			dayCount++;
			hoursWorked += (WORKHOURS_PER_MONTH - hoursWorked);
			totalWage += (WORKHOURS_PER_MONTH - hoursWorked) * EMP_WAGE_PER_HOUR ;
			System.out.println(" " + dayCount + " \t" + hoursWorked + " \t\t" + totalWage);
		}
       return totalWage;
	}
    public static void main(String[] args)
     // TODO Auto-generated method stub
    {
    	System.out.println("Welcome to the Employee Wage Computation Program");
    	
    	EmpWage obj = new EmpWage();
    	int Total =obj.calculateWage();
    	
    	System.out.println("The Employee Total Wage :"+Total);
    }
}

