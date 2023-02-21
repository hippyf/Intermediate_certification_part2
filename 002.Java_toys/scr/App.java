import java.util.ArrayList;
import java.util.List;

import controller.Controller;
import data.Toy;

public class App {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createConstructor(1, "Конструктор", 2);
        controller.createConstructor(2, "Конструктор", 2);
        controller.createConstructor(3, "Конструктор", 2);
        controller.createConstructor(4, "Конструктор", 2);
        controller.createConstructor(5, "Конструктор", 2);
        controller.createDolls(1, "Кукла", 2);
        controller.createDolls(2, "Кукла", 2);
        controller.createDolls(3, "Кукла", 2);
        controller.createDolls(4, "Кукла", 2);
        controller.createDolls(5, "Кукла", 2);
        controller.createRobots(1, "Робот", 6);
        controller.createRobots(2, "Робот", 6);
        controller.createRobots(3, "Робот", 6);
        controller.createRobots(4, "Робот", 6);
        controller.createRobots(5, "Робот", 6);
        System.out.println("ВСЕ КОНСТРУКТОРЫ НЕ РАЗЫГРАННЫЕ \n");
        controller.showAllConstructors();
        System.out.println("\nВСЕ КУКЛЫ НЕ РАЗЫГРАННЫЕ \n");
        controller.showAllDolls();
        System.out.println("\nВСЕ РОБОТЫ НЕ РАЗЫГРАННЫЕ \n");
        controller.showAllRobots();

        List<Toy> constructors = controller.listConstructors();
        List<Toy> dolls = controller.listDolls();
        List<Toy> robots = controller.listRobots();

        System.out.println("\nРОЗЫГРЫШ ИГРУШЕК. СПИСОК ПРИЗОВЫХ ИГРУШЕК \n");

        List<Toy> winnerList = new ArrayList<>();
        controller.createLottery(winnerList, constructors, dolls, robots);
        controller.createLottery(winnerList, constructors, dolls, robots);
        controller.createLottery(winnerList, constructors, dolls, robots);
        controller.createLottery(winnerList, constructors, dolls, robots);
        controller.createLottery(winnerList, constructors, dolls, robots);
        System.out.println(winnerList);
        controller.createReceivedToysFile();

        System.out.println("\nПОЛУЧЕНИЕ ПРИЗОВОЙ ИГРУШКИ");
        controller.getWinnerToy(winnerList);
        controller.getWinnerToy(winnerList);
        controller.getWinnerToy(winnerList);
        System.out.println("(полученные игрушки записались в файл Received_Toys.txt ");
        System.out.println("\n Cписок оставшихся призовых игрушек: ");
        System.out.println(winnerList);


    
        
    }
}