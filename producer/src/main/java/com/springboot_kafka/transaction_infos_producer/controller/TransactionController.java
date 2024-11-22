package com.springboot_kafka.transaction_infos_producer.controller;

import com.springboot_kafka.transaction_infos_producer.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private KafkaTemplate<String, Transaction> kafkaTemplate;

    @PostMapping("/create")
    public ResponseEntity<Void> createTransaction(@RequestBody Transaction transaction){
        kafkaTemplate.send("transaction-topic", transaction);
        return ResponseEntity.ok().build();
    }

}
