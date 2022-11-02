package uet.oop.bomberman.entities.character.enemy.moving;

import java.util.Random;

public abstract class AutoMove {

    protected Random random = new Random();

    public abstract int calculateDirection();
}
