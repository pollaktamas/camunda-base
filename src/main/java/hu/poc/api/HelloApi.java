package hu.poc.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/hello")
public class HelloApi {

    @GetMapping
    public MessageDto hello() {
        return new MessageDto("Hello world!");
    }

    @AllArgsConstructor
    @Getter
    public static final class MessageDto {
        private String message;
    }
}
