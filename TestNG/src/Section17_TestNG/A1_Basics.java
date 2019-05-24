 package Section17_TestNG;

import org.testng.annotations.Test;

public class A1_Basics {

	//En testNG no se requiere del metodo main
	//Simplemente se debe de poner la anotaci�n @test y por cada @test se ejecutara una prueba por metodo

	//Para poder ejecutar todo de un jalon, se da clic derecho -> TestNG -> Convert To TestNG 
	@Test(groups={"smoke"})
	public void method1(){
		System.out.println("test1");
	}
	@Test
	public void method2(){
		System.out.println("test2");
	}
	
	

}
