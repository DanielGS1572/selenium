package Section17_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class A9_TestListeners {
/*
 * En el XML se le debe de indicar con tags una clase que implemente
 * la interfaz ITestListener 
 * */
    @Test
    public void testListenerExample() {	
    	Assert.assertFalse(true);
    }
   
}
