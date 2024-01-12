package com.phonebook.tests;

import com.phonebook.dto.ContactDto;
import com.phonebook.dto.MessageDto;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class DeleteContactByIDTestsRA extends TestBase{

    String id;

    @BeforeMethod
    public void precondition() {
        ContactDto dto = ContactDto.builder()
                .name("Oliver")
                .lastName("Kan")
                .email("kan@gm.com")
                .phone("1234567890")
                .address("Berlin")
                .description("goalkeeper")
                .build();

        String message = given()
                .header("Authorization", TOKEN)
                .body(dto)
                .contentType(ContentType.JSON)
                .post("contacts")
                .then()
                .assertThat().statusCode(200)
                .extract().path("message");

        String[] split = message.split(": ");
        id = split[1];
    }

    @Test
    public void deleteByIdPositiveTest() {
        given()
                .header("Authorization", TOKEN)
                .delete("contacts/" + id)
                .then()
                .assertThat().statusCode(200)
                .assertThat().body("message",equalTo("Contact was deleted!"));
        //  System.out.println(message);
    }

    @Test
    public void deleteWithWrongIDNegativeTest() {
        MessageDto dto = given()
                .header("Authorization", TOKEN)
                .delete("contacts/f56c4145-33c1-48b9-9591-e10ac6c5eff4")
                .then()
                .assertThat().statusCode(400)
                .assertThat().body("message",containsString("not found in your contacts"))
                .extract().response().as(MessageDto.class);
        System.out.println(dto);
    }
}
