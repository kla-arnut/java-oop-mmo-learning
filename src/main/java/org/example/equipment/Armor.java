package org.example.equipment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Armor extends Equipment {
    @Override
    public void setAttactAdd(int attactAdd) {
        super.setAttactAdd(attactAdd);
    }

    @Override
    public int getDefendAdd() {
        return super.getDefendAdd()+20;
    }
}
