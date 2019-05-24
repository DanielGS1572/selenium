 package Section17_TestNG;

import org.testng.annotations.Test;

public class A3_Basics3 {

	
	@Test(groups={"smoke"})
	public void webLogin(){
		System.out.println("webLogin");
	}
	@Test
	public void mobileLogin(){
		System.out.println("mobileLogin");
	}
	@Test
	public void mobileLogin2(){
		System.out.println("mobileLogin2");
	}
	@Test
	public void apiLogin(){
		System.out.println("apiLogin");
	}
	
	
	

}
