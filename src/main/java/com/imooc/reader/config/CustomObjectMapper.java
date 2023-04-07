package com.imooc.reader.config;

import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDateTime;

public class CustomObjectMapper extends ObjectMapper {
    public CustomObjectMapper(){
        this.registerModule(new JavaTimeModule());
    }

    public class JavaTimeModule extends SimpleModule {
        public JavaTimeModule() {
            super(PackageVersion.VERSION);
            this.addSerializer(LocalDateTime.class, new CustomLocalDateTimeSerializer());
        }
    }
}
