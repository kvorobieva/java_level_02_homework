package lesson01.homework;

public class Wall {

    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public int getWallHeight() {
        return wallHeight;
    }

    public void setWallHeight(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public boolean check(CanJump competitor) {
        return competitor.jump(this.wallHeight);
    }


}


