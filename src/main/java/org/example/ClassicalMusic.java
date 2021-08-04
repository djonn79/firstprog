package org.example;


import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    List<String> songs = Arrays.asList("classical1", "classical2", "classical3");
    @Override
    public String getSong(int i) {
        return songs.get(i);
    }

}
