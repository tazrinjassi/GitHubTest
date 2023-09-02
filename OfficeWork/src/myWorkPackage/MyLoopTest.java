package myWorkPackage;

public class MyLoopTest {

	public static void main(String[] args) {
		MyLoopTest obj = new MyLoopTest();
        obj.firstLoop();
        obj.secondLoop();
        obj.thirdLoop();
        obj.fourthLoop();
        obj.fifthLoop();
        obj.whileLoop();
	}
	public void firstLoop() {
		
		int i;
		for(i=3; i<40; i=i+3)
		System.out.println(i);
			
	}
	public void secondLoop() {
		int i;
		for (i=1; i<30; i=i+1) {
			if(i%2==0) {
				System.out.println("this is an even number"+i);
			}else {
			System.out.println("this is an odd number"+i);
		}
		}
	
	}
	public void thirdLoop() {
		int i;
		for (i=1; i<20; i=i+2) {
			if(i%3==0) {
				System.out.println("this is an even number"+i);
			}else {
			System.out.println("this is an odd number"+i);
		}
		}
	}
	public void fourthLoop() {
		
		int i;
		for (i=1; i<30; i=i+1) {
			if(i%2==0) {
				System.out.println("this is an even number"+i);
				if(i==7) {
					System.out.println("got the lucky number="+i);
					break;
				}
			}
		}
		}	
		
		
	public void fifthLoop() {
		int i;
		for (i=1; i<30; i++) {
		if(i%5==0) {
			System.out.println("Red"+i);
		}else if (i%3==0) {
			System.out.println("blue"+i);
		}else if (i%4==0) {
			System.out.println("green"+i);
		}
	
	}
	
}
	public void whileLoop() {
		
	}
}
	
	
	
	
	









