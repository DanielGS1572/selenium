package Section17_TestNG;

import org.testng.annotations.*;

public class A7_Parametrizacion {


    /*

    * */
	@Parameters({"URL","URL2","URL3"})
    @Test
    public void timeOutExample(String urlname,String urlname2,String urlname3) {
        System.out.println("urlname -->" + urlname);
        System.out.println("urlname2 -->" + urlname2);
        System.out.println("urlname3 -->" + urlname3);
    }
   
}
