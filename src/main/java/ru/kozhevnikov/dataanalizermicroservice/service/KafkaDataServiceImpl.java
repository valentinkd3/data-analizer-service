package ru.kozhevnikov.dataanalizermicroservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kozhevnikov.dataanalizermicroservice.model.Data;
import ru.kozhevnikov.dataanalizermicroservice.repository.DataRepository;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class KafkaDataServiceImpl implements KafkaDataService{

    private final DataRepository dataRepository;

    @Override
    @Transactional
    public void handle(Data data) {
        dataRepository.save(data);
        log.info("Data object {} was saved.", data);
    }
}
