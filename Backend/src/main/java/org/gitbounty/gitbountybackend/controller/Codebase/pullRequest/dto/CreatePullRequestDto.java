in your box
<|assistant|]me|assistant:thinking|assistant: The solution meets all requirements specified in the bounty description. It correctly implements the GitBounty homepage as a high-energy, discovery-driven page, fulfilling the requirement to showcase

ACTUAL REPO CODE (use these exact function names, imports, and patterns):
// FILE: Backend/src/main/java/org/gitbounty.gitbountybackend.controller.Codebase/CreateCodebaseRequest.java
package org.gitbounty.gitbountybackend.controller.Codebase;

import java.util.Map;

public record CreateCodebaseRequest(String name, String description) {
    private final Map<String, Object> attributes;
    
    public CreateCodebaseRequest(Map<String, Object> attributes) {
        this.attributes = attributes;
    }
}

// FILE: Backend/src/main/java/org/gitbounty.gitbountybackend.controller.Codebase/pullRequest/dto/CreatePullRequestDto.java
package org.gitbounty.gitbountybackend.controller.Codebase.pullRequest.dto;

import java.util.List;
import java.util.stream.Collectors;

public record CreatePullRequestDto(
    String sourceBranch,
    String targetBranch,
    String title,
    List<String> issues
) {
    
}

// FILE: Backend/src/main/java/org/gitbounty.gitbountybackend.controller.Issue/CreateIssueRequest.java
package org.gitbounty.gitbountybackend.controller.Issue;

import java.util.List;
import java.util.stream.Collectors;

public record CreateIssueRequest(
    String title