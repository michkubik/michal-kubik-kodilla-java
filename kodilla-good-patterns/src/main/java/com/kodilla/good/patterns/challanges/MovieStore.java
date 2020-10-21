package com.kodilla.good.patterns.challanges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public final class MovieStore {

    public static Map<String, List<String>> getMovies() {

        final Map<String, List<String>> moviesTitlesWithTranslations = new HashMap<>();

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        moviesTitlesWithTranslations.put("IM", ironManTranslations);
        moviesTitlesWithTranslations.put("AV", avengersTranslations);
        moviesTitlesWithTranslations.put("FL", flashTranslations);

        return new HashMap<>(moviesTitlesWithTranslations);
    }

    public static void main(String[] args) {

        MovieStore.getMovies().entrySet().stream()
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .forEach(n -> System.out.print(n + "! "));
    }
}


