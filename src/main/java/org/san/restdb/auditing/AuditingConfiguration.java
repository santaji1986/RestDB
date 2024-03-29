package org.san.restdb.auditing;

import org.san.restdb.models.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class AuditingConfiguration {

	@Bean
	public AuditorAwareImpl auditorAware() {
		return new AuditorAwareImpl();
	}

}