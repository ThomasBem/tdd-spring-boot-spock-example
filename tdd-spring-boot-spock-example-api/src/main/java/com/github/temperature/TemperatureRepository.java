package com.github.temperature;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TemperatureRepository extends CrudRepository<Temperature, String> {
    @Query(value = "SELECT * FROM tdd.temperature LIMIT 5", nativeQuery = true)
    List<Temperature> findLastFiveTemperatureReadings();
}
