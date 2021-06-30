package lesson01.homework;

public class Main {

    public static void main(String[] args) {

        Object[] competitors = {
                new Man("Иван", 300, 4),
                new Cat("Мурзик", 100, 10),
                new Robot("Терминатор", 500, 1)
        };

        Object[] obstacles = {
                new Road(200),
                new Wall(3)
        };

        for (Object competitor : competitors) {
            for (Object obstacle : obstacles) {
                if (obstacle instanceof Road road) {
                    CanRun runner = (CanRun) competitor;
                    boolean checkResult = road.check(runner);
                    if (checkResult) {
                        System.out.println(runner.getName() + " смог пробежать " + road.getRoadLength() + " метров!");
                    } else {
                        System.out.println(runner.getName() + " не смог пробежать " + road.getRoadLength() + " метров и выбыл из соревнований!");
                        break;
                    }
                } else if (obstacle instanceof Wall wall) {
                    CanJump jumper = (CanJump) competitor;
                    boolean checkResult = wall.check(jumper);
                    if (checkResult) {
                        System.out.println(jumper.getName() + " смог прыгнуть " + wall.getWallHeight() + " метров!");
                    } else {
                        System.out.println(jumper.getName() + " не смог прыгнуть " + wall.getWallHeight() + " метров и выбыл из соревнований!");
                        break;
                    }
                }
            }
        }

    }
}