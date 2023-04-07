package com.imooc.reader.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class CustomLocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {

    public void serialize(LocalDateTime dateTime, JsonGenerator generator, SerializerProvider sp)
            throws IOException, JsonProcessingException {
        long time = dateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        generator.writeNumber(time);
    }
}