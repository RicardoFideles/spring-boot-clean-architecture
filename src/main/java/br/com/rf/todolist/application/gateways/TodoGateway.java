package br.com.rf.todolist.application.gateways;

import java.util.List;

import br.com.rf.todolist.domain.model.Todo;

public interface TodoGateway {

    Todo create(Todo todo);

    List<Todo> list();
    
}
