package pl.sda.OrangeJavaPL2.restapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyFirstController {
    @GetMapping("/hello-world")
    public String hello() {
        return "Hello world";
    }
}