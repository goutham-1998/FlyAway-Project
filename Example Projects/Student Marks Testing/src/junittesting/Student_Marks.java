package junittesting;

import java.util.Scanner;

public class Student_Marks {

	public static void main(String[] args) {
		float physics_marks,maths_marks,chem_marks;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Physics Marks = ");
		physics_marks = sc.nextFloat();
		
		System.out.println("Maths Marks = ");
		maths_marks = sc.nextFloat();
		
		System.out.println("Chemistry marks = ");
		chem_marks = sc.nextFloat();
		
		float total_marks = getTotalMarks(physics_marks,maths_marks,chem_marks);
		System.out.println("Total marks = "+total_marks);
				
		float percent = getPercent(physics_marks,maths_marks,chem_marks);
		System.out.println("percentage = "+String.format("%.2f", percent));
		
		String grade = getGrade(percent);
		System.out.println("Grade of the Student is : "+grade);
		
		if(physics_marks<50||maths_marks<60||chem_marks<70)
		{
			System.out.println("FAIL");
		}
		
		
		
		}

	

	public static String getGrade(float percent) {
		if (percent>=90)
		{
			return "A";
		}
		else if (percent >=60 && percent<=89)
		{
			return "B";
		}
		else {
			return "Fail";
		}
		
	}
	
	


	public static float getPercent(float physics_marks, float maths_marks, float chem_marks) {
		float marks_total = physics_marks+maths_marks+chem_marks;
		float percent_marks = (marks_total/300)*100;
		if (percent_marks >100)
		{
			throw new ArithmeticException("Error!!!");
		}
		return percent_marks;
	}



	public static float getTotalMarks(float physics_marks, float maths_marks, float chem_marks) {
		
		float marks_total = physics_marks+maths_marks+chem_marks;
		if (physics_marks>100 || maths_marks>100 || chem_marks>100)
		{
			throw new ArithmeticException("Error!!!Enter Valid Marks");
		}
		return marks_total;
		}

	
	

}
