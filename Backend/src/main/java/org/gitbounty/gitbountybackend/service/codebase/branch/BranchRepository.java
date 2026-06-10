// FILE: Backend/src/main/java/org/gitbounty.gitbountybackend/controller/Codebase/CreateCodebaseRequest.java
package org.gitbounty.gitbountybackend.controller.Codebase;

import java.util.Objects;
import java.util.function.Consumer;

public record CreateCodebaseRequest(String name, String description) {
    // Add any necessary fields or logic here as needed for the repository

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }
}