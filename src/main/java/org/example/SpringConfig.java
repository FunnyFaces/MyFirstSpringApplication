package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
    return new ClassicalMusic();
}
    @Bean
    public RockMusic rockMusic(){
    return new RockMusic();
}
    @Bean
    public RepMusic repMusic() {
         return new RepMusic();
    }
    @Bean
    public List<Object> listMusic() {
        List<Object> listMusic = new ArrayList<>();
        listMusic.add(classicalMusic());
        listMusic.add(rockMusic());
        listMusic.add(repMusic());
        return listMusic;
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(listMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
