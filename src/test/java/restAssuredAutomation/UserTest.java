package restAssuredAutomation;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.Assert;
import restAssuredAutomation.UserRequest;
import restAssuredAutomation.UserResponse;

public class UserTest {
	private static final String BASE_URL = "https://reqres.in/api/";
	
	@Test
	public void createdUser() {
		UserRequest userRequest = new UserRequest();
		userRequest.setName("morpheus");
		userRequest.setJob("leader");
		
		UserResponse userResponse = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(userRequest)
				.when()
				.post(BASE_URL + "users")
				.then()
				.statusCode(201)
				.extract().as(UserResponse.class);
		
		Assert.assertNotNull(userResponse.getId());
		Assert.assertEquals(userRequest.getName(), userResponse.getName());
		Assert.assertEquals(userRequest.getJob(), userResponse.getJob());
		Assert.assertNotNull(userResponse.getCreatedAt());
		
	}

}
