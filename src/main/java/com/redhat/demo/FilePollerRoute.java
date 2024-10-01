package com.redhat.demo;
import org.apache.camel.builder.RouteBuilder;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FilePollerRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        // Explicitly configure Camel to load the properties file
        getContext().getPropertiesComponent().setLocation("classpath:application.properties");

        // Use the inputFolder property
        from("file://{{input.folder}}?noop=true")
                .log("Processing file: ${header.CamelFileName}")
                .process(exchange -> {
                    String fileContent = exchange.getIn().getBody(String.class);
                    System.out.println("File Content: " + fileContent);
                });
    }
}