package org.example.player;

public class MagicianPlayer extends Player{
    public MagicianPlayer(String name) {
        this.setName(name);
    }

    public int heal(){
        return 99;
    }
}

