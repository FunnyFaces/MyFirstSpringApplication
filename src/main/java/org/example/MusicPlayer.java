package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music;

    private List<Object> listMusic = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Object> listMusic) {
        this.listMusic = listMusic;
    }

    public String playMusic(GroupMusic groupMusic) {
       Random random = new Random();
       int b = random.nextInt(listMusic.size());
       music = (Music) listMusic.get(b);
       switch (groupMusic) {
           case ROCK, CLASSICAL -> {
               int a = random.nextInt(music.getSong().size());
               return "Playing: " + music.getSong().get(a);
           }
       }
        return null;
    }

    }
