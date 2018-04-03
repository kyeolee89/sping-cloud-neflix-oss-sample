package sample.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SampleService {

    static final Logger logger = LoggerFactory.getLogger(SampleService.class);

    @HystrixCommand(fallbackMethod = "defaultHello")
    public String call() {

        // circuit이 open 되면 log가 남지 않음
        logger.info("call method");

        return new RestTemplate().getForObject("http://localhost:1115/hello", String.class);
    }

    private String defaultHello() {
        return "Hello World! (default)";
    }
}
