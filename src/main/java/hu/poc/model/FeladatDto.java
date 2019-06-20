package hu.poc.model;

import lombok.Data;
import org.camunda.bpm.engine.task.Task;

import java.util.Date;

@Data
public class FeladatDto {

    String processDefinitionId;

    String processInstanceId;

    String executionId;

    String id;

    Date createTime;

    String assignee;

    String name;

    String formKey;

    public static FeladatDto from(Task task) {
        FeladatDto f = new FeladatDto();
        f.setId(task.getId());
        f.setName(task.getName());
        f.setFormKey(task.getFormKey());
        f.setAssignee(task.getAssignee());
        f.setProcessDefinitionId(task.getProcessDefinitionId());
        f.setProcessInstanceId(task.getProcessInstanceId());
        f.setExecutionId(task.getExecutionId());
        f.setCreateTime(task.getCreateTime());

        return f;
    }
}
