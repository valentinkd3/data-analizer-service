package ru.kozhevnikov.dataanalizermicroservice.service;

import ru.kozhevnikov.dataanalizermicroservice.model.Data;

public interface KafkaDataService {

    void handle(Data data);
}
