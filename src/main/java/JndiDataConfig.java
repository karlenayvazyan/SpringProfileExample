import annotation.Production;
import org.springframework.context.annotation.Bean;

/**
 * Created by karlen on 5/19/17.
 */
@Production
public class JndiDataConfig {

    @Bean
    public Message message() {
        return new Message("Production");
    }
}
