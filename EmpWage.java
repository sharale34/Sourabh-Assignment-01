package WageComp;

public class EmpWage {
	
	//constants
		public static final int IS_FULL_TIME=1;
		public static final int IS_PART_TIME=2;
		
		private final String company;
		private final int hourWage;
		private final int monthDays;
		private final int monthWorkHours;
		private int totalWage;
		
		public EmpWage(String company , int hourWage , int monthDays , int monthWorkHours)
		{
			this.company=company;
			this.hourWage=hourWage;
			this.monthDays=monthDays;
			this.monthWorkHours=monthWorkHours;
		}
		
        public void calculateWage()
        {
        	int empWage=0;
        	int hoursWorked=0;
        	int empHours=0;
        	int dayCount=0;
		
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
		empWage = empHours * hourWage;
		//Tabular display of employee details
		System.out.println("company\t\tDay\tHours Worked\tTotal Wage");
		while((hoursWorked + empHours) <= monthWorkHours && dayCount < monthDays)
		{
			dayCount++;
			hoursWorked += empHours;
			totalWage += empWage;
			System.out.println(" " +company+ " \t" + dayCount + " \t" + hoursWorked + " \t\t" + totalWage);
		}
		if(hoursWorked < monthWorkHours && dayCount < monthDays)
		{
			dayCount++;
			hoursWorked += (monthWorkHours - hoursWorked);
			totalWage += (monthWorkHours - hoursWorked) * hourWage ;
			System.out.println(" " +company+ " \t" + dayCount + " \t" + hoursWorked + " \t\t" + totalWage);
		}
	}
        
        
        public String toString()
        {
        	return "Total Emp Wage Per Company "+company+" is : "+totalWage;
        }
    public static void main(String[] args)
     // TODO Auto-generated method stub
    {
    	System.out.println("Welcome to the Employee Wage Computation Program");
    	
    	EmpWage Capgemini = new EmpWage("Capgemini" , 20 , 20 , 100);
    	EmpWage Microsoft = new EmpWage("Microsoft" , 40 , 20 , 100);
    	Capgemini.calculateWage();
    	Microsoft.calculateWage();
    	System.out.println(Capgemini);
    	System.out.println(Microsoft);
    }
}

