import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.task2.Authorization;
import com.example.task3.Brandfetch;
import com.example.task3.Company;

public class TestTask3 {

    @org.junit.jupiter.api.Test
    public void testNoReturn() {
        Company company = Brandfetch.fetch("amazon");
        assertTrue(company.logo != "");
        System.out.println(company.website  != "");
        System.out.println(company.name != "");
    }

}