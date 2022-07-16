import org.example.config.SpringConfig;
import org.example.domain.Account;
import org.example.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        Account ac = accountService.findById(1);
        System.out.println(ac);
    }
}
