public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        byte userAge = 16;
        if ( userAge >= 18 ){
            System.out.println("поздравляем пользователя с совершеннолетием");
        }
        if ( userAge < 18){
            System.out.println("возраст совершеннолетия еще не наступил, нужно немного подождать");
        }
        System.out.println("задание 2");
        byte personsAge = 25;
        if (personsAge >= 7)
        if (personsAge <18){
            System.out.println("ребенок ходит в школу");
        }
        if (personsAge >=18)
        if (personsAge <24){
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (personsAge >=24){
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
        System.out.println("задание 3");
        byte seatingUsed =50;
        byte standingRoomUsed =42;
        byte wagonCapacity = 102;
        byte seating = 60;
        int standingRoom = wagonCapacity-seating;
        if (wagonCapacity <= seatingUsed+standingRoomUsed){
            System.out.println("вагон уже полностью забит");
        }
        if (standingRoom > standingRoomUsed){
            System.out.println("есть стоячее места в вагоне");
        }
        if (seating >  seatingUsed){
            System.out.println("есть седячее места в вагоне ");
        }
    }
}