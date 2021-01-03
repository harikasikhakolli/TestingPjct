import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MulTest {
	
	MultiplyNum  mn;
	@Before
	public void init()
	{
		mn=new MultiplyNum();
	}

	@Test
	public void test() {
		
		assertEquals(20,mn.mul(5, 4));
	}
	
	
	@Test
	public void test1()
	{
		assertEquals(30,mn.mul(5, 6));
	}

}
