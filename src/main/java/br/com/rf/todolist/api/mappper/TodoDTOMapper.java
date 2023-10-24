package br.com.rf.todolist.api.mappper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.rf.todolist.api.dtos.CreateTodoDTORequest;
import br.com.rf.todolist.api.dtos.CreateTodoDTOResponse;
import br.com.rf.todolist.api.dtos.TodoDTO;
import br.com.rf.todolist.domain.model.Todo;

@Service
public class TodoDTOMapper {

    public Todo toTodoModel(CreateTodoDTORequest request) {
        return new Todo(request.name(), request.description(), request.status(), request.priority());
    }

    public CreateTodoDTOResponse toCreateTodoDTOResponse(Todo created) {
        return new CreateTodoDTOResponse(created.name(), created.description());
    }

    public List<TodoDTO> toListTodoDTO(List<Todo> todos) {
        List<TodoDTO> dtos = new ArrayList<TodoDTO>();

        for (Todo todoModel : todos) {
            TodoDTO todoDTO = new TodoDTO(todoModel.name(), todoModel.description());
            dtos.add(todoDTO);    
        }
        return dtos;
    }
    
}
