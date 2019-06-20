package hu.poc.api;

import hu.poc.model.FeladatDto;
import hu.poc.service.FeladatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/feladat")
public class TaskApi {

    private final FeladatService feladatService;

    @GetMapping
    public List<FeladatDto> getFeladataim() {
        return feladatService.getFeladataim();
    }
}
