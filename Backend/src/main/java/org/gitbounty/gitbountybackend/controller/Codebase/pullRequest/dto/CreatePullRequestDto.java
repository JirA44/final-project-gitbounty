import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BackendController {

    @GetMapping("/health")
    public String health() {
        return "Server is running!";
    }
}