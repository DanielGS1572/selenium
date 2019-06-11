package com.appium.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;

import java.net.MalformedURLException;

public class Basics extends Base {
    public static void main(String args[]) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities();
        //Para ver todos los componentes de la aplicación se debe usar ui automation viewer que esta dentro de /Android/Sdk/tools/bin
        for (int i = 0; i <= 2; i++) {
            driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Número de Empleado\")").sendKeys("1113");
            driver.findElementByAndroidUIAutomator("new UiSelector().text(\"INGRESAR\")").click();


            driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.ImageView[@index='1']")).click();
            driver.findElementByAndroidUIAutomator("new UiSelector().text(\"CONTINUAR\")").click();
            driver.findElementByAndroidUIAutomator("new UiSelector().text(\"CARGAR\")").click();
            driver.findElementByAndroidUIAutomator("new UiSelector().text(\"FULL\")").click();
            try {
                Thread.sleep(2000);
                driver.findElementByAndroidUIAutomator("new UiSelector().text(\"OK\")").click();
                Thread.sleep(2000);
                driver.findElementByAndroidUIAutomator("new UiSelector().text(\"SALIR\")").click();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}