package webservices;

import org.junit.Test;

public class RegularDemo {
@Test
public void test(){
	String str = "123123";
	
	
	System.out.println(str.matches("[\\d\\w]+"));
}
}
