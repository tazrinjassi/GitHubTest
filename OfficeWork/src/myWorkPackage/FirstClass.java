package myWorkPackage;

public class FirstClass {
    int d = 25;
    int e = 36;
    static int h = 50;
    static int i = 70;
    
    
    
	public static void main(String[] args) {
		FirstClass obj = new FirstClass();
        obj.myFirstMethod();
        obj.mySecondMethod();
        obj.parametarMethod(100, 25);
        FirstClass.systemMethod();
        obj.flower();
        obj.sky();
	}

  public void myFirstMethod () {
	int a = 10;
	int b = 50;
	int c = a+b;
	System.out.println("the total is:" +c);
}	
	public void mySecondMethod() {
		int f = d-e;
		System.out.println("the total is:"+f);
	}
	
	public void parametarMethod(int d,int e) {
		int g = d+e;
		System.out.println("my peramiter method result;"+g);
	}
	public static void systemMethod () {
		int j = h+i;
		System.out.println("the static value is;"+j);
		
	}
	public int flower() {
		int a = 5;
		int b = 10;
		int c = a+b;
		System.out.println("the total flower is;"+ c);
		return c;
	}
	public String sky() {
		String name = "my name is luva";
		System.out.println("print;"+ name);
		return name;
	}
	
		
	}
	
	
	

