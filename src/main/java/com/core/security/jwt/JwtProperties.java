package com.core.security.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created on July, 2023
 *
 * @author uihyeon1229
 */

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

	private String issuer;

	private String secretKey;

	private long expirationMinute;

}
