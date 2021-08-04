package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private int volume;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public MusicPlayer(Music music1, Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public MusicPlayer(){}


    public int getVolume() {
        return volume;
    }

    @Autowired
    public void setMusic(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playSong(Genre genre, int minId, int maxId){

        int idSong = minId + (int)(Math.random()*((maxId) + 1));
        switch (genre){
            case CLASSICAL:
                System.out.println("I'm playing " + music1.getSong(idSong) + " music");
                break;
            case ROCK:
                System.out.println("I'm playing " + music2.getSong(idSong) + " music");
                break;
        }

    }
}
