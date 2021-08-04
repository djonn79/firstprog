package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playSong(Genre.ROCK, 0, 2);
//        ClassicalMusic music = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(music.getSong());

        context.close();
    }

}
