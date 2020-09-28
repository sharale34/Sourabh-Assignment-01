package WageComp;

public class EmpWage {
	
	//constants
		public static final int IS_FULL_TIME=1;
		public static final int IS_PART_TIME=2;
		
		private int numOfCompany=0;
		private CompanyeEmpWage[] companyEmpWageArray;
		public EmpWage() 
		{
		 companyEmpWageArray = new CompanyeEmpWage[5];
		}
        private void addCompanyEmpWage(String company , int hourWage , int monthDays , int monthWorkHours)
        {
        	companyEmpWageArray[numOfCompany] = new CompanyeEmpWage( company , hourWage , monthDays , monthWorkHours);
        	numOfCompany++;
        }
        private void computeWage()
        {
        	for(int i = 0; i < numOfCompany; i++)
        	{
        		companyEmpWageArray[i].setTotalWage(this.computeWage(companyEmpWageArray[i]));
        		System.out.println(companyEmpWageArray[i]);
        	}
        }
        	private int computeWage(CompanyeEmpWage companyeEmpWage) {
			// TODO Auto-generated method stub
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
		empWage = empHours * companyeEmpWage.hourWage;
		//Tabular display of employee details
		System.out.println("company\t\tDay\tHours Worked\tTotal Wage");
		while((hoursWorked + empHours) <= companyeEmpWage.monthWorkHours && dayCount < companyeEmpWage.monthDays)
		{
			dayCount++;
			hoursWorked += empHours;
			companyeEmpWage.totalWage += empWage;
			System.out.println(" " +companyeEmpWage.company+ " \t" + dayCount + " \t" + hoursWorked + " \t\t" + companyeEmpWage.totalWage);
		}
		if(hoursWorked < companyeEmpWage.monthWorkHours && dayCount < companyeEmpWage.monthDays)
		{
			dayCount++;
			hoursWorked += (companyeEmpWage.monthWorkHours - hoursWorked);
			companyeEmpWage.totalWage += (companyeEmpWage.monthWorkHours - hoursWorked) * companyeEmpWage.hourWage ;
			System.out.println(" " +companyeEmpWage.company+ " \t" + dayCount + " \t" + hoursWorked + " \t\t" + companyeEmpWage.totalWage);
		}
		return companyeEmpWage.totalWage;
	}
        
    public static void main(String[] args)
     // TODO Auto-generated method stub
    {
    	System.out.println("Welcome to the Employee Wage Computation Program");
    	
    	EmpWage empWageBuilder = new EmpWage();
    	empWageBuilder.addCompanyEmpWage("Capgemini", 20, 20 , 100);
    	empWageBuilder.addCompanyEmpWage("Microsoft", 40 , 40 , 100);
    	empWageBuilder.computeWage();
    }
}

