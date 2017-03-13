package com.github.testutils;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = { "classpath:/sql/temperature.sql"})
@Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = { "classpath:/sql/drop.sql"})
@ContextConfiguration
@SpringBootTest
@ActiveProfiles({"test"})
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DbIntegration {
}