package hu.poc.api;

import hu.poc.service.Tesz1Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/lap/tesz1")
public class Tesz1Api {

    private final Tesz1Service tesz1Service;

    @PostMapping("/start")
    public void startTesz1() {
        tesz1Service.startTesz1();
    }

    @PostMapping("/rogzites/{taskId}")
    public void rogzites(@PathVariable String taskId) {
        tesz1Service.rogzites(taskId);
    }
}
