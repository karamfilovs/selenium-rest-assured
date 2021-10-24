import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LiftServiceTests {
    @Test
    @DisplayName("Can subscribe for lift changes")
    public void canSubscribeForLiftChanges() {
        GraphQLQuery query = new GraphQLQuery();
        query.setQuery("{ company { name ceo coo } }");
        given().
                contentType(ContentType.JSON).
                body(query).
                when().
                post("https://api.spacex.land/graphql/").
                then().
                assertThat().
                statusCode(200).
                and().
                body("data.company.ceo", equalTo("Elon Musk"));
    }
}
