package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Tests {

    private БазаДаних базаДаних;
    private DB db;
    private Auth auth;

    @BeforeEach
    void setUp() {
        базаДаних = new БазаДаних();
        db = new DB(базаДаних);
        auth = new Auth(new Авторизація());
    }

    @Test
    void testDBMethods() {
        assertEquals("hello", db.getUserData(), "User data retrieval failed");
        assertEquals("hello2", db.getStatistics(), "Statistics retrieval failed");
    }

    @Test
    void testAuthWithValidDB() {
        assertTrue(auth.authorise(db), "Authorization with valid DB should return true");
    }

    @Test
    void testReportBuilderInitialization() {
        ReportBuilder reportBuilder = new ReportBuilder(db);
        assertNotNull(reportBuilder, "ReportBuilder should be initialized successfully");
    }
}
