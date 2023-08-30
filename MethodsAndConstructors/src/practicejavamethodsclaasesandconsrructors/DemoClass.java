package practicejavamethodsclaasesandconsrructors;


class Box
{
	double width;
	double height;
	double depth;
	double volume;
	
	double vol(double width, double height, double depth)
	{
		volume =  width*height*depth;
		return volume;
	}
}

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		//mybox1.width = 100;
		//mybox1.height = 12;
		//mybox1.depth = 16;
		

		//mybox2.width = 45;
		//mybox2.height = 42;
		//mybox2.depth = 18;
		
		double box1vol=mybox1.vol(100,23,45);
		System.out.println(box1vol);
		
		
		double box2vol= mybox2.vol(45,42,18);
		System.out.println(box2vol);

		
		
		
		
		
		
		


	}

}
