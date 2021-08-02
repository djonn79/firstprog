package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> music = new ArrayList<>();
    private int volume;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public MusicPlayer(){}

    public List<Music> getMusic() {
        return music;
    }

    public int getVolume() {
        return volume;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playSong(){
        System.out.println("Volume is - " + volume);
        System.out.println("My name is " + name);
        for (Music m : music) {
            System.out.println("I'm playing " + m.getSong() + " music");
        }


    }
}
