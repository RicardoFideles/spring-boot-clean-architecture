package br.com.rf.todolist.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.rf.todolist.api.dtos.CreateTodoDTORequest;
import br.com.rf.todolist.api.dtos.CreateTodoDTOResponse;
import br.com.rf.todolist.api.dtos.TodoDTO;
import br.com.rf.todolist.api.mappper.TodoDTOMapper;
import br.com.rf.todolist.application.usecases.TodoUseCase;
import br.com.rf.todolist.domain.model.Todo;


@RestController
public class TodoController implements TodoResource {

    TodoUseCase todoUseCase;
    TodoDTOMapper todoDTOMapper;

    TodoController(TodoUseCase todoUseCase, TodoDTOMapper todoDTOMapper) {
        this.todoUseCase = todoUseCase;
        this.todoDTOMapper = todoDTOMapper;
    }

    @Override
    public CreateTodoDTOResponse create(CreateTodoDTORequest request) {
       Todo created = todoUseCase.create(todoDTOMapper.toTodoModel(request));
       return todoDTOMapper.toCreateTodoDTOResponse(created);
    }

    @Override
    public List<TodoDTO> list() {
        List<Todo> todos = this.todoUseCase.list();
        return todoDTOMapper.toListTodoDTO(todos);
    }
    
}
