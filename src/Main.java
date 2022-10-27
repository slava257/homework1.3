public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университете");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        System.out.println("задание 2");
        int childAge = 12;
        if (childAge < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Ребенок может кататься на аттракционе тоько в сопровождении взрослого");
        } else {
            System.out.println("Ребенок может кататься на аттракционе");
        }
        System.out.println("задание 3");
        int one = 950;
        int two = 900;
        int three = 77;
        if (one > two) {
            if (one >= three) {
                System.out.println("больше число " + one);
            } else {
                System.out.println("больше чесло " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("больше число " + two);
            } else {
                System.out.println("больше число " + three);
            }
            if (one>three) {
                System.out.println("больше число" + one);
            }
        } else if (three > one) {
            System.out.println("больше число " + three);
        }
    }
}



