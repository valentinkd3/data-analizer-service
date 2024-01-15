package ru.kozhevnikov.dataanalizermicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kozhevnikov.dataanalizermicroservice.model.Data;

@Repository
public interface DataRepository extends JpaRepository<Data,Long> {
}
