package com.appium.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;

import java.net.MalformedURLException;

public class Basics extends Base {
    public static void main(String args[]) throws MalformedURLException {

       AndroidDriver<AndroidElement> driver =  capabilities();
       //Para ver todos los componentes de la aplicación se debe usar ui automation viewer que esta dentro de /Android/Sdk/tools/bin
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Número de Empleado\")").sendKeys("1113");
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"INGRESAR\")").click();

    }
}
