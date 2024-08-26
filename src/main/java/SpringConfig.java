import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
@Bean // этот метод будет отвечать за создание какого нибудь бина
        //если нету какого то пармаетра у этой анотации бин не указывается, мы можем вызвать этот ин по дефолту
public Home home() {
    return new Home(12);
}
}

