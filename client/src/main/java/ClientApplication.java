import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Code By https://projects.spring.io/spring-boot/ Quick Start
 */
@Controller
@EnableAutoConfiguration
public class ClientApplication {

    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return restTemplate.getForObject("http://localhost:1115/hello", String.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ClientApplication.class, args);
    }
}