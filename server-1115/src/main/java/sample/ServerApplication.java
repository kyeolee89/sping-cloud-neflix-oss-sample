package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Code By https://projects.spring.io/spring-boot/ Quick Start
 */
@RestController
@EnableAutoConfiguration
public class ServerApplication {

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello 1115 Server!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServerApplication.class, args);
    }
}