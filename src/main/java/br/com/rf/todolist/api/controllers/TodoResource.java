package br.com.rf.todolist.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rf.todolist.api.dtos.CreateTodoDTORequest;
import br.com.rf.todolist.api.dtos.CreateTodoDTOResponse;
import br.com.rf.todolist.api.dtos.TodoDTO;

@RequestMapping("/todos")
public interface TodoResource {
    
    @PostMapping()
    CreateTodoDTOResponse create(@RequestBody CreateTodoDTORequest request);

    @GetMapping()
    List<TodoDTO> list();
}
