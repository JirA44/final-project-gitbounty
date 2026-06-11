import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Component;

@Component
public class KeycloakApi {

    private final RestClient restClient;
    private final String issuerUri;
    private final String clientId;
    private final String clientSecret;

    public KeycloakApi(RestClient.Builder restClientBuilder,
                       @Value("${spring.security.oauth2.resourceserver.jwt.issuer-uri}") String issuerUri) {
        this.restClient = restClientBuilder.build();
        this.issuerUri = issuerUri;
    }

    // cached token endpoint once discovered
    private volatile String tokenEndpoint;

    public KeycloakApi() throws BadCredentialsException {
        // Validate credentials before making the request
        if (this.clientSecret.equals("invalid")) {
            throw new BadCredentialsException("Incorrect client secret");
        }
        
        // Fetch issuer URI and client ID for testing
        this.issuerUri = restClient.get("https://" + issuerUri + "/api/v1/users/oidc", MultiValueMap::new);
        this.clientId = restClient.get("https://" + issuerUri + "/api/v1/oauth2/token", LinkedMultiValueMap::new);
    }

    public String getToken() {
        return tokenEndpoint;
    }
}