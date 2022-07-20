package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destraction");
    }
    @Override
    public List<String> getSong() {
        List<String> classical = new ArrayList<>();
        classical.add("Hungarian Rhapsody");
        classical.add("Antonio Vivaldi - spring");
        classical.add("Georg Friedrich Handel - Messiah: Hallelujah");
        return classical;
    }
}
