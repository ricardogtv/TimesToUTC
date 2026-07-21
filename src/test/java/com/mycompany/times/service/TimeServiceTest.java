package com.mycompany.times.service;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

class TimeServiceTest {

    private final TimeService timeService = new TimeService();

    @Test
    void utcTimeIsAValidTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        assertThat(LocalTime.parse(timeService.getUtcTime(), formatter)).isNotNull();
    }

    @Test
    void localTimeIsAValidTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        assertThat(LocalTime.parse(timeService.getLocalTime(), formatter)).isNotNull();
    }
}
