package Section17_TestNG;

import org.testng.annotations.*;

public class A5_Annotations {


    /*EJECUCIONES A NIVEL
        - CLASE:
            method
            class
        - XML:
            suite
            test

     Es muy importante ver que las ejecuciones las hace de forma alfabetica si se ejecuta toda la clase completa
	Para solucionar esto se tiene dependsOnMethods
	
	Si se quiere que no se ejecute un metodo en particular (ya sea que por ejemplo este tronando algo en esa parte)
	Se pone la anotaci�n (enabled=false)
	
	(timeout=n milisegundos)
    * */

    @Test(timeOut=3000)
    public void timeOutExample() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("    Timeout example");
    }
    
    @Test
    public void wmethod1() {
        System.out.println("    test3... se ejecuta al final por la w en el nombre del metodo");
    }

    @Test(dependsOnMethods="wmethod1")
    public void method1() {
        System.out.println("    test1");
    }

    @Test
    public void method2() {
        System.out.println("    test2");
    }

    //Si por ejemplo se requiere que se borre informacion de la base de datos se puede poner la anotación @BeforeTest
    @BeforeTest
    public void prerequisite() {
        System.out.println("Borrando datos ... BEFORETEST");           //aqui también se puede hacer borrado de cookies
    }
    @AfterTest
    public void finishing() {
        System.out.println("Prueba terminada ... AFTERTEST");		//no importa si fue con exito o sin exito
    }
    @BeforeSuite
    public void BSuite() {
        System.out.println("Before Suite ...");           //aqui también se puede hacer borrado de cookies
    }
    @AfterSuite
    public void ASuite() {
        System.out.println("After Suite ...");           //aqui también se puede cerrado de conexiones a base de datos
    }
    @BeforeMethod
    public void BMethod() {
        System.out.println("ANTES de que se ejecute cada metodo ...");
    }
    @AfterMethod
    public void AMethod() {
        System.out.println("DESPUES de que se ejecute cada metodo ...");
    }


    @BeforeClass
    public void BClass() {
        System.out.println("ANTES de que se ejecute LA CLASE ...");
    }
    @AfterClass
    public void AClass() {
        System.out.println("DESPUES de que se ejecute LA CLASE ...");
    }



}
