package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {


    @Bean
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }

    @Bean
    Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

}
