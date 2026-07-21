package com.mycompany.times.dto;

public class TimeResponse {

    private final String local;
    private final String utc;

    public TimeResponse(String local, String utc) {
        this.local = local;
        this.utc = utc;
    }

    public String getLocal() {
        return local;
    }

    public String getUtc() {
        return utc;
    }
}
