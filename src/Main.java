import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
        int ages = 21;
        if (ages >= 18) {
            System.out.println("Если возраст человека равен " + ages + ", он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + ages + ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        int temp = 2;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        int speedAuto = 40;
        if (speedAuto > 60) {
            System.out.println("Если скорость " + speedAuto + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedAuto + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 40;
        if (age >= 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему не нужно ходить в детский сад");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему не нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему не нужно ходить в университет ");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageChild = 13;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ",то ему нельзя кататься на аттракционе");
        } else if (ageChild > 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ",то ему можно кататься только" +
                    " в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ",то ему можно кататься " +
                    "без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int wagon = 102;
        int seating = 60;
        int standing = 42;
        int human = 55;
        if (human <= standing) {
            System.out.println(" В вагоне есть стоячие места");
        } else if (human <= seating) {
            System.out.println("В вагоне есть сидячие места");
        } else if (human > wagon) {
            System.out.println("Вагон полностью забит");
        }
    }
    
    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Первое число больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Второе чило больше остальных");
        } else if (three > one && three > two) {
            System.out.println("Третье число больше остальных");
        }
    }
}