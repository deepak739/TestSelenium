package practicejavamethodsclaasesandconsrructors;

class Box1
{
	double width;
	double height;
	double depth;
	
	/*
	 * Box1() { width = 22; height = 28; depth = 58; }
	 */
	
	Box1(double w, double h, double d)
	{
		
		  width = w; height = h; depth = d;
		 
		
	}
	
	double volume()
	{
		return width*height*depth;
		
	}
}

public class constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box1 mybox1 = new Box1(23,24,25);
		Box1 mybox2 = new Box1(25,26,28);
		
		double volmuebox1 = mybox1.volume();
		System.out.println(volmuebox1);
		
		double volmuebox2 = mybox2.volume();
		System.out.println(volmuebox2);
		
		
		AccessChecking a = new AccessChecking();
		a.justPrint();

	}

}
