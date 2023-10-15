package org.example.monster;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Monster {
    private String name;
    private int attack;
    private int HP;
    private int defend;

    public Monster(String name, int attack, int HP, int defend) {
        this.name = name;
        this.attack = attack;
        this.HP = HP;
        this.defend = defend;
    }
}
