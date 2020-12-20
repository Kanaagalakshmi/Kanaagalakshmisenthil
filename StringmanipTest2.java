package junit.first;
import junit.first.Stringmanip.*;
import java.util.*;
import org.junit.Test;
import org.junit.runners.*;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class StringmanipTest2{
	//fields
	private String datum;
	private String expected;
	public StringmanipTest2(String datum,String expected) {
	this.datum=datum;
	this.expected=expected;
	}
	@Parameters
	public static Collection<Object[]>generateData(){
	Object[][]data = new Object[][] {{"Smita","SMITA"},{"smita","smItA"},{"smita","SMITA"}};
	return Arrays.asList(data);
	}
	@Test
	public void testUpperCase() {
		Stringmanip s=new Stringmanip(this.datum);
		String actualResult = s.upperCase();
		assertEquals(actualResult,this.expected);
	}}
	


