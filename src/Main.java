import javax.swing.table.JTableHeader;

public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("задание 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("он совершеннолетний ");
        } else {
            System.out.println("он не достиг совершеннолетия ");

        }
        //задание 2
        System.out.println("задание 2");
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        //задание 4
        System.out.println("задание 4");
        int age2 = 25;
        if (age2 > 2 && age2 < 6) {
            System.out.println(" нужно ходить в детский сад");
        } else if (age2 > 7 && age2 < 18) {
            System.out.println("нужно ходить в школу");
        } else if (age2 > 18 && age2 < 24) {
            System.out.println("то его место в университете");
        } else if (age2 > 24) {
            System.out.println("пора ходить на работу");
        }
        //задание 7
        System.out.println("задание 7");
        int max;
        int one = 5;
        int two = 6;
        int three = 7;
        if (one > two) {
            max = one;
        } else {
            max = two;
        }
        if (max > three) {
            System.out.println(max);
        } else {
            System.out.println(three);
        }
        if (three > max) {
            max = three;
        }
        System.out.println(max);
        //задание 6
        System.out.println("задание 6 ");
        int total = 102;
        int seet = 60;
        int busy = 40;
        if (busy < seet) {
            System.out.println("есть сидячее место");
        } else {
            if (busy < total) {
                System.out.println("есть стоячее место");
            } else {
                System.out.println("мест нет");
            }
        }
        //задание 5
        System.out.println("задание 5 ");
        int age3 = 16;
        if (age3 < 5) {
            System.out.println("он не может кататься на аттракционе");
        } else if (age3 > 5 && age3 < 14) {
            System.out.println(" может кататься только в сопровождении взрослого");

        } else if (age3 > 14) {
            System.out.println("он может кататься без сопровождения взрослого.");
        }
        //задание 3
        System.out.println("задание 3");
        int speed = 120;
        if (speed < 60) {
            System.out.println("превышения скорости нет");
        } else {
            System.out.println("превышения скорости ");
        }

    }

}

