package com.mycompany.times.service;

import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    public String getLocalTime() {
        return ZonedDateTime.now().format(FORMATTER);
    }

    public String getUtcTime() {
        return ZonedDateTime.now(ZoneId.of("UTC")).format(FORMATTER);
    }
}
