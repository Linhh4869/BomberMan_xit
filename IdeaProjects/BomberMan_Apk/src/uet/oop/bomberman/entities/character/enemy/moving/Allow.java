package uet.oop.bomberman.entities.character.enemy.moving;

public class Allow extends AutoMove {
    @Override
    public int calculateDirection() {
        int i;
        i = random.nextInt(4);
        return i;
    }
}
