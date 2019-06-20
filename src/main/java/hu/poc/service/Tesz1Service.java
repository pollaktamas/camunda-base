package hu.poc.service;

import hu.poc.util.ProcessDefinition;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
public class Tesz1Service {

    private final RuntimeService runtimeService;
    private final TaskService taskService;

    @Transactional
    public void startTesz1() {
        log.trace("startTesz1");
        runtimeService.startProcessInstanceByKey(ProcessDefinition.TESZ1.getKey());
    }

    @Transactional
    public void rogzites(String taskId) {
        log.trace("rogzites > taskId: {}", taskId);
        taskService.complete(taskId);
    }
}
