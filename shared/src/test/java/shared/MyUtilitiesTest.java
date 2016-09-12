package shared;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;


public class MyUtilitiesTest {

	@Test
	public void sayHelloContainsHello() throws Exception{
		assertThat(MyUtilities.sayHello(), is( containsString("Hello")));
	}
	
}
