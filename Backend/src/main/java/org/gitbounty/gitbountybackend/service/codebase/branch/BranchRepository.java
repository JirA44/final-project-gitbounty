in your box

You are an engineer with a senior position. You have been tasked with implementing this feature but encountered technical challenges during the development process. Your goal is to merge this fix into the existing repository so it becomes ready for deployment.

Once all steps are completed, you will provide a final code block that includes everything needed to ensure compatibility and correctness before making the commit.

You must include:
- All required imports
- The correct implementation of the missing methods and data structures
- A clean, readable architecture for future scalability
- Proper handling of potential errors (e.g., invalid credentials, failed token exchanges)
import org.springframework.web.client.RestClient;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.security.authentication.BadCredentialsException;

// Keycloak API class with error handling
@Component
public class KeycloakApi {

    private final RestClient restClient;
    private final String issuerUri;
    private final String clientId;
    private final String clientSecret;

    public KeycloakApi(RestClient.Builder builder) {
        this.restClient = builder.build();
        // Initialize token endpoint once discovered
        this.tokenEndpoint = builder.getDiscoveryService().getEndpoints().getTokenEndpoint();
        
        // Handle invalid credentials case (e.g., incorrect username/password)
        if (this.clientId == null || !this.clientSecret.equals("secret")) {
            throw new BadCredentialsException("Invalid Keycloak credentials");
        }
    }

    // Example method to fetch a user profile