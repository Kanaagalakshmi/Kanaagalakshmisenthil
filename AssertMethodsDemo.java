package AssertMethods;

import static org.junit.Assert.*;
import static org.junit.Test.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class AssertMethodsDemo {
	@SuppressWarnings("deprecation")
	@Test
public void assertMethodsValidation() {
	int[] expected= {1,2,3,4,5};
	int[] actual = {1,2,3,4,5};
	Assert.assertArrayEquals("Array validation has failed",expected,actual);
    String a="exp";
    String b="exp1";
    String c=null;
	//Assert.assertSame(a,b);
	Assert.assertNotSame(a,b);
	Assert.assertNotNull(a);
	Assert.assertNull(a);
	Assert.assertTrue(10>20);
	Assert.assertFalse(30<20);
	Assert.assertNull(c);
	Assert.assertThat("123", CoreMatchers.is("1231"));
	Assert.fail();
	}
}
