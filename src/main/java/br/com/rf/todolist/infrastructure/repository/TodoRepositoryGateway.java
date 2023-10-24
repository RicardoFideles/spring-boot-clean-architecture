package br.com.rf.todolist.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.rf.todolist.application.gateways.TodoGateway;
import br.com.rf.todolist.domain.model.Todo;
import br.com.rf.todolist.infrastructure.entity.TodoEntity;
import br.com.rf.todolist.infrastructure.mapper.TodoEntityMapper;
import br.com.rf.todolist.infrastructure.persistence.TodoRepository;

@Repository
public class TodoRepositoryGateway implements TodoGateway {

    TodoRepository todoRepository;
    TodoEntityMapper todoEntityMapper;
    TodoRepositoryGateway(TodoRepository todoRepository, TodoEntityMapper todoEntityMapper) {
        this.todoRepository = todoRepository;
        this.todoEntityMapper = todoEntityMapper;
    }

    @Override
    public Todo create(Todo todo) {
        TodoEntity savedEntity = this.todoRepository.save(todoEntityMapper.toTodoEntity(todo));
        return todoEntityMapper.toTodoModel(savedEntity);
    }

    @Override
    public List<Todo> list() {
        List<TodoEntity> list = this.todoRepository.findAll();
        return todoEntityMapper.toListTodoModel(list);
    }
    
}
