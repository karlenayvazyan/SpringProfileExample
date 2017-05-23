import annotation.Development;
import org.springframework.context.annotation.Bean;

/**
 * Created by karlen on 5/19/17.
 */
@Development
public class StandaloneDataConfig {

    @Bean
    public Message message() {
        return new Message("Development");
    }
}
