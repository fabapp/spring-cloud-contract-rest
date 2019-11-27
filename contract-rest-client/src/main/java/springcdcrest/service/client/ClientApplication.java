package springcdcrest.service.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class);
    }
}

@Service
class ReverseStringService {

    public String reverseString(String stringToReverse) {
        RestTemplate restTemplate = new RestTemplate();
        final String stringReversed = restTemplate.getForObject(String.format("http://localhost:9090/reverse/%s", stringToReverse), String.class);
        return stringReversed;
    }

}
