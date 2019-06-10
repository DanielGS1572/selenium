package com.appium.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

        /*Prerequisites:
        * Make sure appium server si started (running appium command in console)
        * Make sure emulator is opened
        * */

        /*From DesiredCapabilities:
        * I want the emulator "xxx"
        * I want the app "xxx"
        * Connection step
        * */
        File file = new File(new File("src"),"app-debug.apk");


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"NatGas");
        capabilities.setCapability(MobileCapabilityType.APP,file.getAbsolutePath());
        //Para conectarse con el driver:
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);     //( connectiontoserverlink , capabilities)
        driver.rotate(ScreenOrientation.LANDSCAPE);
        //En lugar de "WebElement" se esta usando "AndroidElement"
        //el connection server link es el localhost con el puerto con el que se levanta appium          wd significa web driver

        //Es importante saber que connection no es lo mismo que session
        //Cuando se corre una prueba hay que esperar 60 segundos para que se cierre la sesión... lo que se puede hacer es matar la conexion de appium para volver a ejecutar una prueba
        //tambien se puede hacer con codigo (levantar y cerrar appium)

        return driver;

    }
}
