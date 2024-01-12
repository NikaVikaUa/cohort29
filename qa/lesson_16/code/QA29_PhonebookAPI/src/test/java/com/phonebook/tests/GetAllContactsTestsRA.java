package com.phonebook.tests;

import com.phonebook.dto.AllContactsDto;
import com.phonebook.dto.ContactDto;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GertAllContactsTestsRA extends TestBase{

    @Test
    public void getAllContactsPositiveTest() {

        AllContactsDto allContactsDto = given()
                .header("Authorization", TOKEN)
                .get("contacts")
                .then()
                .assertThat().statusCode(200)
                .extract().response().as(AllContactsDto.class);

        for (ContactDto contact: allContactsDto.getContacts()) {
            System.out.println(contact.getId() + "***" + contact.getName());
            System.out.println("========================================");
        }
    }

    @Test
    public void getAllContactsNegativeTest() {
        given()
                .header("Authorization", "oie098kj")
                .get("contacts")
                .then()
                .assertThat().statusCode(401)
                .assertThat().body("error",equalTo("Unauthorized"));
    }
}
