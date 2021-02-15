package com.bootcamp.springboot.service;

import com.bootcamp.springboot.model.Todo;
import com.bootcamp.springboot.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository repository;

    public List<Todo> listAll(){
        return repository.findAll();
    }

    public void save(Todo todo){
        repository.save(todo);
    }

    public  Todo get(Long id){
        return repository.findById(id).get();
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
