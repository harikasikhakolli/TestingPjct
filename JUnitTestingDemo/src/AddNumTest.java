import static org.junit.Assert.*;

import org.junit.Test;

public class AddNumTest {

	@Test
	public void test() {
		AddNum an=new AddNum();
		assertEquals(5,an.add(2, 2));
	}

}
