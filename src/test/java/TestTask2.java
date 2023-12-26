import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.task2.Authorization;

public class TestTask2 {

    @org.junit.jupiter.api.Test
    public void testNoReturn() {
        Authorization auth = new Authorization();
        assertTrue(auth.login());
    }

}