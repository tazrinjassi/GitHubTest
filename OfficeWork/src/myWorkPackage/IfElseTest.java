package myWorkPackage;

public class IfElseTest {
    int mark =109 ;
	public static void main(String[] args) {
		IfElseTest obj = new IfElseTest();
		obj.elseIfResult();

	}
	public void elseIfResult() {
		if(mark < 40 ) {
			System.out.println("the result is fail");
			if (mark < 0) {
			System.out.println("error: The result can not be negative");	
			}
		}
		else if (mark >= 40 && mark <50) {
			System.out.println("this grade is C ");
			
		}
		else if (mark >=50 && mark < 60) {
			System.out.println("this grade is B");
			
		}
		else if (mark >=60 && mark < 70) {
			System.out.println("this grade is A-");
			
		}
		else if (mark >= 70 && mark < 80) {
			System.out.println("this grade is A");
		}
		else if (mark >=80 && mark <=100) {
			System.out.println("this grade is A+");
		}
		
		else {
			System.out.println("error:Something went wrong,out of boundary");
		}
	}

}
