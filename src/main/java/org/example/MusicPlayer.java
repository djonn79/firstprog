package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music;
    private int volume;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){}

    public Music getMusic() {
        return music;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playSong(){
        System.out.println("Volume is - " + volume);
        System.out.println("My name is " + name);
        System.out.println("I'm playing " + music.getSong() + " music");


    }
}
