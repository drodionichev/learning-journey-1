package org.example.oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Circus {
    private List<Performer> performers = new ArrayList<>();

    public void addPerformer(Performer performer) {
        performers.add(performer);
    }

    public void startShow() {
        for (Performer performer : performers) {
            performer.doTrick();
        }
    }
}
