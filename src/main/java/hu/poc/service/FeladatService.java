package hu.poc.service;

import hu.poc.model.FeladatDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.task.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class FeladatService {

    private static final String test_user = "test_user";

    private final TaskService taskService;

    public List<FeladatDto> getFeladataim() {
        log.trace("getFeladataim");

        List<Task> taskList = taskService.createTaskQuery().taskAssignee(test_user).initializeFormKeys().list();
        return taskList.stream().map(FeladatDto::from).collect(Collectors.toList());
    }

    public String findElhelyezesiUgyintezo() {
        log.trace("findElhelyezesiUgyintezo");
        return test_user;
    }
}
