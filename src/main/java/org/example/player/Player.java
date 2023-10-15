package org.example.player;

import lombok.Getter;
import lombok.Setter;
import org.example.equipment.Armor;
import org.example.equipment.Equipment;

@Setter
@Getter
public class Player {
    private String name;
    private int attack = 1;
    private int HP = 10;
    private int defend = 0;
    private Equipment weapon;
    private Armor armor;
}
