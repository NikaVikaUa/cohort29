package com.phonebook.tests;

import com.phonebook.dto.AuthRequestDto;
import com.phonebook.dto.AuthResponseDto;
import com.phonebook.dto.ErrorDto;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class LoginTestsRA extends TestBase {

    AuthRequestDto dto = AuthRequestDto.builder()
            .username("manuel@gm.com")
            .password("Manuel1234$")
            .build();

    @Test
    public void loginPositiveTest() {

        AuthResponseDto responseDto = given()
                .contentType("application/json")
                .body(dto)
                .post("user/login/usernamepassword")
                .then()
                .assertThat().statusCode(200)
                .extract().response().as(AuthResponseDto.class);

        System.out.println(responseDto.getToken());
    }

    @Test
    public void loginSuccessTest() {
        String responseToken = given()
                .contentType(ContentType.JSON)
                .body(dto)
                .post("user/login/usernamepassword")
                .then()
                .assertThat().statusCode(200)
                .body(containsString("token"))
                .extract().path("token");
        System.out.println(responseToken);
    }

    @Test
    public void loginNegativeWithWrongEmailTest() {
        ErrorDto errorDto = given()
                .body(AuthRequestDto.builder()
                        .username("manuelgm.com")
                        .password("Manuel1234$").build())
                .contentType(ContentType.JSON)
                .when()
                .post("user/login/usernamepassword")
                .then()
                .assertThat().statusCode(401)
                .extract().response().as(ErrorDto.class);

        Assert.assertEquals(errorDto.getError(),"Unauthorized");
        Assert.assertEquals(errorDto.getMessage(),"Login or Password incorrect");
    }
}
