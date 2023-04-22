package pl.sda.OrangeJavaPL2.configuration;

import lombok.Data;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Data
// @Value //immutable wersja data - final
@ConfigurationProperties
public class WelcomeMessage {

    private String value;
}
