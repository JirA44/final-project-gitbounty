in the box

---
// FILE: Backend/src/main/java/org/gitbounty/gitbountybackend/Codebase/CreateCodebaseRequest.java
import java.time.LocalDate;

public record CreateCodebaseRequest(String name, String description) {
}