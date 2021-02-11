package com.bootcamp.springboot.controller;


import com.bootcamp.springboot.model.TodoModel;
import com.bootcamp.springboot.repo.TodoRepo;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;



    @GetMapping
    public List<TodoModel> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoModel save(@Validated @NotNull @RequestBody TodoModel todoModel){
        return todoRepo.save(todoModel);
    }

    @PutMapping
    public  TodoModel update(@Validated @NotNull @RequestBody TodoModel todoModel){
        return  todoRepo.save(todoModel);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable long id){
        todoRepo.deleteById(id);
    }
}
