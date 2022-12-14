package uet.oop.bomberman.entities.tile;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.bomb.Bomb;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.graphics.Sprite;

public class Portal extends Tile {
    private Board _board;

    public Portal(int x, int y, Sprite sprite, Board board) {
        super(x, y, sprite);
        _board = board;
    }

    @Override
    public boolean collide(Entity e) {
        // TODO: xử lý khi Bomber đi vào
        if (e instanceof Bomber) {
            if (!_board.detectNoEnemies()) return false;
            if (_board.detectNoEnemies() && e.getXTile() == getX() && e.getYTile() == getY()) {
                _board.nextLevel();

            }
            return true;
        }
        return false;
    }

}
