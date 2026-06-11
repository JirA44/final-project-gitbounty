// FILE: Backend/src/main/java/org/gitbounty.gitbountybackend.controller.Codebase/CreateCodebaseRequest.java
package org.gitbounty.gitbountybackend.controller.Codebase;

import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class CodebaseController {

    @PostMapping("/create")
    public CreateCodebaseRequest create(@RequestBody Map<String, String> data) {
        return new CreateCodebaseRequest(data.get("name"), data.get("description"));
    }
}