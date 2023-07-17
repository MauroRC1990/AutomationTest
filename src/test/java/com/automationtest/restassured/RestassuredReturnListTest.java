package com.automationtest.restassured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class RestassuredReturnListTest {
	@Test
	public void getList() {

		given().get("https://reqres.in/api/users?page=2").then().
		statusCode(200).
		body("data.id[1]", equalTo(8)).
		body("data.first_name", hasItems("Michael","Lindsay")).
		log().all();

	}

}
