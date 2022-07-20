package org.example;

import java.util.ArrayList;
import java.util.List;

public class RepMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> rep = new ArrayList<>();
        rep.add("The Notorious B.I.G. - Spiritual Rhymes feat. Big L");
        rep.add("Kurupt, 2Pac & The Outlawz - Initiated");
        rep.add("Dr. Dre - Still D.R.E. (Remix) ft. Snoop Dogg, 2Pac, Eminem, 50 Cent, Eazy E, Method Man, BIG L");
        return rep;
    }
}
