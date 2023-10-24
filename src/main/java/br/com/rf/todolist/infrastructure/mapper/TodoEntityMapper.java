package br.com.rf.todolist.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.rf.todolist.domain.model.Todo;
import br.com.rf.todolist.infrastructure.entity.TodoEntity;

@Service
public class TodoEntityMapper {

    public TodoEntity toTodoEntity(Todo todo) {
        TodoEntity entity = new TodoEntity(todo.name(), todo.description(), todo.status(), todo.priority());
        return entity;
    }

    public Todo toTodoModel(TodoEntity savedEntity) {
         Todo model = new Todo(savedEntity.getName(), savedEntity.getDescription(), savedEntity.getStatus(), savedEntity.getPriority());
        return model;
    }

    public List<Todo> toListTodoModel(List<TodoEntity> list) {
        List<Todo> todos = new ArrayList<Todo>();
        for (TodoEntity todoEntity : list) {
            Todo t = new Todo(todoEntity.getName(), todoEntity.getDescription(), todoEntity.getStatus(), todoEntity.getPriority());
            todos.add(t);
        }
        return todos;
    }
    
}
