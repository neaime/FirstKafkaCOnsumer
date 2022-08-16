package com.consumer.kafka.consumer.repository;

import com.consumer.kafka.consumer.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    //TODO()
}
