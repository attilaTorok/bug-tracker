package com.backend.config

import org.neo4j.ogm.session.SessionFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager
import org.springframework.transaction.annotation.EnableTransactionManagement


@Configuration
@EnableNeo4jRepositories(basePackages = ["com.backend.repository"])
@EnableTransactionManagement
class Neo4JConfig {

    @Bean
    fun sessionFactory(): SessionFactory { // with domain entity base package(s)
        return SessionFactory(configuration(), "com.backend.repository.domain")
    }

    @Bean
    fun configuration(): org.neo4j.ogm.config.Configuration? {
        return org.neo4j.ogm.config.Configuration.Builder()
                .uri("bolt://localhost")
                .credentials("neo4j", "secret")
                .build()
    }

//    @Bean
//    fun configuration(): org.neo4j.ogm.config.Configuration {
//        val properties: ConfigurationSource = ClasspathConfigurationSource("application.properties")
//        return org.neo4j.ogm.config.Configuration.Builder(properties).build()
//    }

    @Bean
    fun transactionManager(): Neo4jTransactionManager {
        return Neo4jTransactionManager(sessionFactory())
    }

}