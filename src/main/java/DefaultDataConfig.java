import annotation.Default;
import org.springframework.context.annotation.Bean;

/**
 * Created by karlen on 5/19/17.
 */
@Default
public class DefaultDataConfig {

    @Bean
    public Message message() {
        return new Message("Default");
    }
}
