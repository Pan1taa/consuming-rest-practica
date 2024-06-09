package com.example.consumingrest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {
    private final RestTemplate restTemplate;

    public PokemonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Pokemon getPokemon(String name) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + name;
        String response = restTemplate.getForObject(url, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        Pokemon pokemon = new Pokemon();
        try {
            JsonNode root = objectMapper.readTree(response);
            pokemon.setNombre(root.get("name").asText());
            pokemon.setTipo1(root.get("types").get(0).get("type").get("name").asText());
            if (root.get("types").size() > 1) {
                pokemon.setTipo2(root.get("types").get(1).get("type").get("name").asText());
            }
            pokemon.setFoto(root.get("sprites").get("front_default").asText());
            pokemon.setFotoShiny(root.get("sprites").get("front_shiny").asText());
            pokemon.setHp(root.get("stats").get(0).get("base_stat").asInt());
            pokemon.setAtaque(root.get("stats").get(1).get("base_stat").asInt());
            pokemon.setDefensa(root.get("stats").get(2).get("base_stat").asInt());
            pokemon.setAtEsp(root.get("stats").get(3).get("base_stat").asInt());
            pokemon.setDefEsp(root.get("stats").get(4).get("base_stat").asInt());
            pokemon.setVelocidad(root.get("stats").get(5).get("base_stat").asInt());
        } catch (Exception e) {
            e.printStackTrace();

        }

        return pokemon;
    }
}
