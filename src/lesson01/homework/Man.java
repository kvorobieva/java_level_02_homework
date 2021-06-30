package lesson01.homework;

public class Man implements CanRun, CanJump {

    private String name;
    private float runLimit;
    private float jumpLimit;

    public Man(String name, float runLimit, float jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRunLimit() {
        return runLimit;
    }

    public void setRunLimit(float runLimit) {
        this.runLimit = runLimit;
    }

    public float getJumpLimit() {
        return jumpLimit;
    }

    public void setJumpLimit(float jumpLimit) {
        this.jumpLimit = jumpLimit;
    }

    @Override
    public boolean jump(int height) {
        return this.jumpLimit >= height;
    }

    @Override
    public boolean run(int length) {
        return this.runLimit >= length;
    }
}
