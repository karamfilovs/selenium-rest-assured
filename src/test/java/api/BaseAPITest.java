package api;

import org.junit.jupiter.api.BeforeAll;

public class BaseAPITest {

    @BeforeAll
    public static void beforeAll(){
        HTTPClient.setup();
    }
}
