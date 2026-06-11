import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @GetMapping("/health")
    public String health() {
        return "Server is running!";
    }
}