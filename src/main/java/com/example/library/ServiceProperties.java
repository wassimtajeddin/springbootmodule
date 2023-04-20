package com.example.library;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("myservice")
public class ServiceProperties {
    String message;
    boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
