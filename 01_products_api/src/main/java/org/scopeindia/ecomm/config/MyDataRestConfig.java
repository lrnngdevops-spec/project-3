package org.scopeindia.ecomm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        // Expose IDs for all entities
        config.exposeIdsFor(
            org.scopeindia.ecomm.model.Product.class,
            org.scopeindia.ecomm.model.Order.class
            // Add all your entity classes here
        );
    }
}
