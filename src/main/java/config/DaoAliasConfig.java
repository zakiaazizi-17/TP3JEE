// config/DaoAliasConfig.java
package config;

import dao.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DaoAliasConfig {



    @Bean(name = "dao")
    @Profile("prod")
    public IDao daoProd() {
        return new DaoImpl();
    }

    @Bean(name = "dao")
    @Profile("dev")
    public IDao daoDev() {
        return new DaoImpl2();
    }

    @Bean(name = "dao")
    @Profile("default")
    public IDao daoDefault() {
        return new DaoApi();
    }

    @Bean(name = "dao")
    @Profile("file")
    public IDao daoFile() {
        return new DaoFile();
    }

}