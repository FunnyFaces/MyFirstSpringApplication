package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> rock = new ArrayList<>();
        rock.add("Nirvana - Smells Like Teen Spirit");
        rock.add("Deep Purple's Smoke On The Water");
        rock.add("Led Zeppelin - Kashmir");
        return rock;
    }
}
