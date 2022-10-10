package com.ardecs.smarthome.repository;

import com.ardecs.smarthome.model.Detector;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DetectorRepository extends CrudRepository<Detector, Long> {
    @Query(value = "SELECT * FROM detector u WHERE u.id = ?1",
            nativeQuery = true)
    Optional<String> findById(String id);
}
