package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

@DisplayName("TDD: Weather Forecast Test Suite")

class WeatherForecastTestSuite2 {

    private static int testCounter = 0;


    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Mock
    private Temperatures temperaturesMock;

    private Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeEach
        public void temperaturesMapCreate() {

        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

    }


    @DisplayName("Weather Forecast Test")
    @Test
    void testCalculateForecastWithMock() {
        //Given

        temperaturesMapCreate();

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @DisplayName("Calculate Average Test")
    @Test
    void testCalculateAverageWithMock() {
        //Given
        temperaturesMapCreate();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageTemp = weatherForecast.calculateAverage();

        //Then
        Assertions.assertEquals(25.56, averageTemp);
    }

    @DisplayName("Caclulate Median Test")
    @Test
    void testCalculateMedianWithMock() {
        //Given
        temperaturesMapCreate();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianTemp = weatherForecast.calculateMedian();

        //Then
        Assertions.assertEquals(25.50, medianTemp);
    }

}