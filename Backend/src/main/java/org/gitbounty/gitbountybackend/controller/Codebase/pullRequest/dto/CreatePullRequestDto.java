// FILE: Backend/src/main/java/org/gitbounty/gitbountybackend/controller/Codebase/CreateCodebaseRequest.java
package org.gitbounty.gitbountybackend.controller.Codebase;

import java.util.Map;

public record CreateCodebaseRequest(String name, String description) {
}