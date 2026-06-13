in your box

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

ACTUAL REPO CODE (use these exact function names, imports, and patterns):
// FILE: Backend/src/main/java/org/gitbounty/gitbountybackend/controller/Codebase/CreateCodebaseRequest.java
package org.gitbounty.gitbountybackend.controller.Codebase;

import java.util.UUID;

public record CreateCodebaseRequest(String name, String description) {
} 


ACTUAL REPO CODE (use these exact function names, imports, and patterns):
// FILE: Backend/src/main/java/org/gitbounty.gitbountybackend.controller.Codebase.PullRequest.dto/CreatePullRequestDto.java
package org