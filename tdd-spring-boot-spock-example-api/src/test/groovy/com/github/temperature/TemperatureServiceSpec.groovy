package com.github.temperature

import com.github.tomakehurst.wiremock.junit.WireMockRule
import org.junit.Rule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

import static com.github.tomakehurst.wiremock.client.WireMock.*

@ContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TemperatureServiceSpec extends Specification {

    @Autowired
    private TemperatureService temperatureService

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8089)

    def "GET temperature for a specific city"() {
        given:
        stubFor(get(urlEqualTo("/temperature/Oslo"))
                .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBodyFile("/temperature.json")))

        when:
        def temperature = temperatureService.getTemperature('Oslo')

        then:
        temperature.city == 'Oslo'
        temperature.temperature == 25
        temperature.timestamp == '123456789'
    }
}
