package com.daniel.restAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class basics {
    public static void main(String args[]){
        RestAssured.baseURI="https://maps.googleapis.com";

        /*given
                parametros que lleva el body en el json
        * when
        *       get(resources)
        * then
        *
        * */
        given().
                param("location","-33.8670522,151.1957362").
                param("key","AIzaSyBz1rFBja3-jpgi0J2S_5lZoJrRMLU1VRQ").
                param("radius","500").
                when().
                    get("/maps/api/place/nearbysearch/json").
                then().assertThat().statusCode(200)
                /*.
                and().contentType(ContentType.JSON).and().body("results[0].name",equalTo("Sidney"))*/;
    }
}
