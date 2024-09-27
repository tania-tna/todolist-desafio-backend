package br.com.taniatrindade.desafio_todolist.controller;

import java.util.List;

import br.com.taniatrindade.desafio_todolist.entity.Todo;
import br.com.taniatrindade.desafio_todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping
    ResponseEntity<List<Todo>> create(@Validated @RequestBody Todo todo) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(todoService.create(todo));
    }

    @GetMapping
    List<Todo> list() {
        return todoService.list();
    }

    @PutMapping("{id}")
    List<Todo> update(@PathVariable Long id, @RequestBody Todo todo) {
        return todoService.update(id, todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable Long id) {
        return todoService.delete(id);
    }
}
