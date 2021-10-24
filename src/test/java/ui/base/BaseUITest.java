package ui.base;

import api.HTTPClient;
import org.junit.jupiter.api.BeforeAll;

public class BaseUITest {

    @BeforeAll
    public static void beforeAll (){
        HTTPClient.setup();

    }
}
