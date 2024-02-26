package hkw.onlineLibrary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        
        // Allow requests from the frontend origin
        config.addAllowedOrigin("http://localhost:8080");
        
        // Allow credentials and headers
        config.setAllowCredentials(true);
        config.addAllowedHeader("*");
        
        // Allow HTTP methods for requests
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");

        // Register the configuration for all paths
        source.registerCorsConfiguration("/**", config);
        
        return new CorsFilter(source);
    }
}
