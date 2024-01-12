package com.phonebook.tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public static final String TOKEN =
            "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoibWFudWVsQGdtLmNvbSIsImlzcyI6IlJlZ3VsYWl0IiwiZXhwIjoxNzA1Njc5MzMwLCJpYXQiOjE3MDUwNzkzMzB9.FGd3wiMd46X_Y4MY6RaVTTOfcbZIr4T5ZWTj1SbW790";

    @BeforeMethod
    public void init() {
        RestAssured.baseURI = "https://contactapp-telran-backend.herokuapp.com";
        RestAssured.basePath = "v1";
    }
}
