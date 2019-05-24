package Section17_TestNG;

import org.testng.annotations.*;

public class A8_DataProvider {
    /*
	HAY DOS FORMAS DE PASAR DATOS:
	- a traves de la parametrización como en el caso de A7_
	- a traves de un @DataProvider como en esta clase
	
	Para correr este caso de prueba no es necesario tener un xml, simplemente
	se da click derecho y run as... TestNG
	
    * */
    @Test(dataProvider="getData")
    public void timeOutExample(String urlname,String password) {		//Aqui recibirá los parametros del arreglo
        System.out.println("urlname -->" + urlname);
        System.out.println("password -->" + password);
    }
    @DataProvider
    public Object[][] getData(){
    	Object[][] datos= new Object[3][2];

    	datos[0][0] = "firstusername";
    	datos[0][1] = "password1";
    	
    	datos[1][0] = "secondusername";
    	datos[1][1] = "password2";

    	datos[2][0] = "thirdusername";
    	datos[2][1] = "password3";
    	
    	return datos;
    }
   
}
