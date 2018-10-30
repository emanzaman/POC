package com.example.demo.newapp;

import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Tags;
import io.micrometer.elastic.ElasticMeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.time.Duration;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping(path = "/sample")
public class SampleController {

    @Autowired
    private ElasticMeterRegistry registry;

    private final Map<String, String> _strings = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        this._strings.put("Test", "Test");
        this._strings.put("Test2", "Test");

        this.registry.gaugeCollectionSize("strings_count", Tags.empty(), this._strings.keySet());
    }

    @GetMapping("/put")
    public String put(@RequestParam String key, @RequestParam String value) {
        return this._strings.put(key, value);
    }

}