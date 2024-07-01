package com.m44rk0.screenmatch;

import com.m44rk0.screenmatch.model.Serie;
import com.m44rk0.screenmatch.services.ConsumoAPI;
import com.m44rk0.screenmatch.services.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.JacksonJsonParser;

@SpringBootApplication
public class AluraScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AluraScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Teste");
        var consumoAPI = new ConsumoAPI();
        var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=7a517755");
        var conversor = new ConverteDados();
        Serie serie = conversor.obterDados(json, Serie.class);
        System.out.println(serie);
    }
}
