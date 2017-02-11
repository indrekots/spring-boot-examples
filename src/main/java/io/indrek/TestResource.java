package io.indrek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {

    private final ApplicationProperties applicationProperties;

    @Autowired
    public TestResource(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @GetMapping
    public String get() {
        return applicationProperties.getRemoteHost().getHostName();
    }
}
