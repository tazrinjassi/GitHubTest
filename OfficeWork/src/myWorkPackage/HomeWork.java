package myWorkPackage;

public class HomeWork {
 int bangla=35;
 int english=60;
 int math=80;
 int homeeconomics=72;
 int statictis=92;
 
	public static void main(String[] args) {
		HomeWork obj = new HomeWork();
		obj.total();

	}
	public int total() {
		int a = bangla + english + math+homeeconomics+statictis;
		System.out.println("total mark="+a);
		return a;
		
		
		
		
		
		
	}
	
	
	
	
	
		
}
