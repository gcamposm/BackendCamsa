package ventas.backend.Security.security.jwt;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "jwt")
@Data
public class JwtProperties {

	private String secretKey = "tenth6385revelations";

	//validity in milliseconds
	private long validityInMs = 86400000; // 24h
	//private long validityInMs = 60000; // 24h
}
