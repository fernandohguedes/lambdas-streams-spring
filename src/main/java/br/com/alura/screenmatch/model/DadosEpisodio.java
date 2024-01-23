package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(
        @JsonAlias("Title") String titulo,
        @JsonAlias("Episode") Integer numero,
        @JsonAlias("imdbRating") String avaliacao,
        @JsonAlias("Released") String dataLancamento) {


    @Override
    public String toString() {
        return "DadosEpisodio{" +
                "titulo='" + titulo + '\'' +
                ", numero=" + numero +
                ", avaliacao='" + avaliacao + '\'' +
                ", dataLancamento='" + dataLancamento + '\'' +
                '}';
    }
}
