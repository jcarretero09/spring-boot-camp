package com.bootcamp.springboot.controller;


import com.bootcamp.springboot.model.Todo;
import com.bootcamp.springboot.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    private TodoService service;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Todo> todoList = service.listAll();
        model.addAttribute("todoLists" ,todoList);
        Todo todo = new Todo();
        model.addAttribute("todo",todo);
        return "index";
    }

//    @RequestMapping("/index")
//    public String viewIndexPage(Model model){
//        List<Todo> todoList = service.listAll();
//        model.addAttribute("todoLists" ,todoList);
//        return "index";
//    }

    @PostMapping(value = "/save")
    public String saveTodo(@ModelAttribute("todo") Todo todo){
        service.save(todo);
        return "redirect:/";
    }

    @RequestMapping("/update/{id}")
    public ModelAndView updateTodoForm(@PathVariable(name = "id") Long id){

        ModelAndView mav = new ModelAndView("update_todo");
        Todo todo = service.get(id);
        mav.addObject("todo",todo);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteTodo(@PathVariable(name = "id") Long id){
        service.delete(id);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

}
