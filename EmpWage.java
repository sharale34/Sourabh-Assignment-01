package WageComp;

public class EmpWage {

	public static void main(String[] args) {
		//Auto-generated method stud
		
		//constants
		int IS_FULL_TIME=1;
		
	   //computation
		double empCheck = Math.floor(Math.random()*10) % 2;
		System.out.println("random generation :"+Math.random());
		System.out.println("random generation :"+Math.random()*10);
		System.out.println("random generation :"+Math.floor(Math.random()*10));
		System.out.println("random generation :"+Math.floor(Math.random()*10) % 2);
		if(empCheck == IS_FULL_TIME)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}

	}

}
