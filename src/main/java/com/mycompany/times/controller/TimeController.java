package com.mycompany.times.controller;

import com.mycompany.times.dto.TimeResponse;
import com.mycompany.times.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/api/times")
    public TimeResponse getTimes() {
        return new TimeResponse(timeService.getLocalTime(), timeService.getUtcTime());
    }
}
