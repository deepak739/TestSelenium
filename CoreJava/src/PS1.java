import org.testng.annotations.Test;
public class PS1 extends PS {
	
	@Test
	public void testRun()
	{
		PS2 ps2 = new PS2(3);
		int a = 3;
		doThis(); // parent class
		System.out.print(ps2.increment());
		System.out.print(ps2.decrement());
		
	}

}
