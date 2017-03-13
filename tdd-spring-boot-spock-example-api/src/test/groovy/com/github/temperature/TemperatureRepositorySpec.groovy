package com.github.temperature

import com.github.testutils.DbIntegration
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@DbIntegration
class TemperatureRepositorySpec extends Specification {

    @Autowired
    private TemperatureRepository repository

    def "Save temperature"() {
        given:
        def temperature = new Temperature('Oslo', 30, '987654321')

        when:
        def savedTemperature = repository.save(temperature)

        then:
        savedTemperature.city == 'Oslo'
        savedTemperature.temperature == 30
        savedTemperature.timestamp == '987654321'
    }
}
