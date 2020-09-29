package WageComp;

public class CompanyeEmpWage {
	public final String company;
	public final int hourWage;
	public final int monthDays;
	public final int monthWorkHours;
	public int totalWage;
	
	public CompanyeEmpWage(String company , int hourWage , int monthDays , int monthWorkHours)
	{
		this.company=company;
		this.hourWage=hourWage;
		this.monthDays=monthDays;
		this.monthWorkHours=monthWorkHours;
	}
	public String getCompany() {
		return company;
	}
	public int getHourWage() {
		return hourWage;
	}
	public int getMonthDays() {
		return monthDays;
	}
	public int getMonthWorkHours() {
		return monthWorkHours;
	}
	public int getTotalWage() {
		return totalWage;
	}
	public void setTotalWage(int totalWage)
	{
		this.totalWage=totalWage;
	}
	 public String toString()
     {
     	return "Total Emp Wage Per Company "+company+" is : "+totalWage;
     }
}
