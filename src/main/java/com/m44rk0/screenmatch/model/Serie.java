package com.m44rk0.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Serie(@JsonAlias("Title") String name,
                    @JsonAlias ("totalSeasons") Integer totalSeasons,
                    @JsonAlias ("imdbRating") String rating) {
}
