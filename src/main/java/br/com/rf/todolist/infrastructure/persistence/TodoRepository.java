package br.com.rf.todolist.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rf.todolist.infrastructure.entity.TodoEntity;

public interface TodoRepository extends JpaRepository <TodoEntity, Long> {
    
}
