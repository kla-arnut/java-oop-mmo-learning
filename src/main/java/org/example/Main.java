package org.example;

import org.example.equipment.Equipment;
import org.example.player.MagicianPlayer;
import org.example.player.Player;
import org.example.player.SwordPlayer;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to game!");

        int playerType = new Random().nextInt(2);
        int arMorAdd = new Random().nextInt(25);
        // generate player
        Player player = null;
        if(playerType == 0) {
            player = new MagicianPlayer("MagicMan");
            // todo add armor equipment
        } else {
            player = new SwordPlayer("SwordMan");
        }
        System.out.println(player.getName());

        // generate monster

        // fighting
    }
}