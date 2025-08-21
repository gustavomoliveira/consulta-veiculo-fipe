package consultaveiculo.project.gustavo.consultaveiculo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterDadosApiService {
    private final ObjectMapper mapper;

    public ConverterDadosApiService(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public <T> T converter(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}