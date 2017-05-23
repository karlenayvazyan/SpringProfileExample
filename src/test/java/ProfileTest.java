import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 5/19/17.
 */
public class ProfileTest {

    @Test
    public void testProductionProfile() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("production");
        applicationContext.register(StandaloneDataConfig.class, JndiDataConfig.class, DefaultDataConfig.class);
        applicationContext.refresh();
        Message bean = applicationContext.getBean(Message.class);
        String message = bean.getMessage();
        assertNotNull(message);
        String expected = "Production";
        assertEquals(expected, message);
    }

    @Test
    public void testDevelopmentProfile() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("development");
        applicationContext.register(StandaloneDataConfig.class, JndiDataConfig.class, DefaultDataConfig.class);
        applicationContext.refresh();
        Message bean = applicationContext.getBean(Message.class);
        String message = bean.getMessage();
        assertNotNull(message);
        String expected = "Development";
        assertEquals(expected, message);
    }

    @Test
    public void testDefaultProfile() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        applicationContext.register(StandaloneDataConfig.class, JndiDataConfig.class, DefaultDataConfig.class);
        applicationContext.refresh();
        Message bean = applicationContext.getBean(Message.class);
        String message = bean.getMessage();
        assertNotNull(message);
        String expected = "Default";
        assertEquals(expected, message);
    }
}
