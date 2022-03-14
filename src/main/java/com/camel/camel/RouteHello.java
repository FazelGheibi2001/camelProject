package com.camel.camel;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RouteHello extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("jetty:http://localhost:8585/hello")
                .to("direct:hello");

        from("direct:hello")
                .log(LoggingLevel.INFO, "Hello World")
                .transform().simple("Hello World");

    }

}

