package net.sathwik;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    String name() {
        return "Hello World";
    }

    void post(@RequestBody String name) {
        System.out.println(name);
    }
}
