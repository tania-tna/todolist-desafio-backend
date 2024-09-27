package br.com.taniatrindade.desafio_todolist;

import java.util.ArrayList;
import java.util.List;

import br.com.taniatrindade.desafio_todolist.entity.Todo;

public class TestConstants {
    public static final List<Todo> TODOS = new ArrayList<>() {
        {
            add(new Todo(9995L, "@taniatrindade", "Curtir", false, 1));
            add(new Todo(9996L, "@taniatrindade", "Comentar", false, 1));
            add(new Todo(9997L, "@taniatrindade", "Compartilhar", false, 1));
            add(new Todo(9998L, "@taniatrindade", "Se Inscrever", false, 1));
            add(new Todo(9999L, "@taniatrindade", "Ativar as Notificações", false, 1));
        }
    };

    public static final Todo TODO = TODOS.get(0);
}