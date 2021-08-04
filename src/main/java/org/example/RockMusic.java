package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music{
    List<String> songs = Arrays.asList("rock1", "rock2", "rock3");

    @Override
    public String getSong(int i) {
        return songs.get(i);
    }
}
