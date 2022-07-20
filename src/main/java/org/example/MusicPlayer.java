package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music1;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music2;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(GroupMusic groupMusic) {
       Random random = new Random();
       switch (groupMusic) {
           case ROCK -> {
               int a = random.nextInt(music1.getSong().size());
               return "Playing: " + music1.getSong().get(a);
           }
           case CLASSICAL -> {
               int a = random.nextInt(music2.getSong().size());
               return "Playing: " + music2.getSong().get(a);
           }
       }
        return null;
    }

    }
