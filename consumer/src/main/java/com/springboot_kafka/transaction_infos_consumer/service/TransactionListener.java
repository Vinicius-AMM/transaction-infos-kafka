package com.springboot_kafka.transaction_infos_consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransactionListener {
    @KafkaListener(topics = "transaction-topic", groupId = "transaction-group")
    public void processTransaction(String message) {
        System.out.println("Transacao recebida: " + message);
    }
}
