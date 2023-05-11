package pl.sda.OrangeJavaPL2.apiconsuming;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@Slf4j
public class MySecondConsumerService {

    @PostConstruct
    void callApi() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.genderize.io?name=anna"))
                .build();

        HttpResponse httpResponse = httpClient.send(request,HttpResponse.BodyHandlers.ofString());

        log.info(httpResponse.body().toString());

    }


}
