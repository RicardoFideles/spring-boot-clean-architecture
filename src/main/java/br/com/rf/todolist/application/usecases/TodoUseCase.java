package br.com.rf.todolist.application.usecases;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.rf.todolist.application.gateways.TodoGateway;
import br.com.rf.todolist.domain.model.Todo;

@Service
public class TodoUseCase {

    TodoGateway todoGateway;

    TodoUseCase (TodoGateway todoGateway) {
        this.todoGateway = todoGateway;
    }
    
    public Todo create(Todo todo) {
        Todo createdTodo = todoGateway.create(todo);
        return createdTodo;
    }

    public List<Todo> list() {
        return todoGateway.list();
    }

    public Todo update(Todo todo) {
        return null;
    }

    public boolean delete(int id) {
        return false;
    }
}
