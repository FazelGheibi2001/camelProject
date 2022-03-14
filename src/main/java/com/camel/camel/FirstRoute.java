package com.camel.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

public class FirstRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("servlet:http://localhost:8585/hello")
                .to("log:foo");
    }
}
