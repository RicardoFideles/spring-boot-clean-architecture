package br.com.rf.todolist.api.dtos;

public record CreateTodoDTORequest(String name, String description, Boolean status, int priority) {}