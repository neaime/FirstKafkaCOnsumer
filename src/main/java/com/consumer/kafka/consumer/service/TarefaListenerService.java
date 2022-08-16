package com.consumer.kafka.consumer.service;

import com.consumer.kafka.consumer.model.Tarefa;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TarefaListenerService {

    @Value("${topic.name.consumer}")
    private String topicName;

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
    public void showTarefa(ConsumerRecord<String, Tarefa> payload) {
        log.info("Tarefa: {}", payload.value());
    }

}
