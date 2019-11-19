package springcdcrest.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseStringController {

    @GetMapping("/reverse/{stringToReverse}")
    public String isNumberPrime(@PathVariable("stringToReverse") String stringToReverse) {
        return new StringBuilder(stringToReverse).reverse().toString();
    }
}