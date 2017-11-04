package science.mengxin.banking.userfront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration(exclude = {
        //JndiConnectionFactoryAutoConfiguration.class,
        //DataSourceAutoConfiguration.class,
        //HibernateJpaAutoConfiguration.class,
        //JpaRepositoriesAutoConfiguration.class,
        //DataSourceTransactionManagerAutoConfiguration.class
})

@SpringBootApplication
public class BankingUserFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingUserFrontApplication.class, args);
    }
}
