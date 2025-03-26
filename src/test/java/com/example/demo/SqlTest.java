package com.example.demo;

import com.example.demo.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Sql(scripts = "/test-data.sql")
@DirtiesContext
public class SqlTest {

    @Autowired
    private MyService myService;

    @Test
    void testWithSqlData() {
        assertEquals("real-behavior", myService.performAction());
    }
}