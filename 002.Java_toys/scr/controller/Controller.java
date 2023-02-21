package controller;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import data.Toy;
import service.ToyService;
import view.AddToysView;


public class Controller {
    private ToyService toyService = new ToyService();
    private AddToysView toysView = new AddToysView();

    public List<Toy> createConstructor(Integer toyID, String toyName, Integer weight) {
        toyService.createToy(toyID, toyName, weight);
        List<Toy> constructors = toyService.getAllConstructors();
        return constructors;
    }

    public List<Toy> createRobots(Integer toyID, String toyName, Integer weight) {
        toyService.createToy(toyID, toyName, weight);
        List<Toy> robots = toyService.getAllRobots();
        return robots;
    }

    public List<Toy> createDolls(Integer toyID, String toyName, Integer weight) {
        toyService.createToy(toyID, toyName, weight);
        List<Toy> dolls = toyService.getAllDolls();
        return dolls;
    }


    public void showAllConstructors() {
        List<Toy> constructors = toyService.getAllConstructors();
        toysView.viewConstructors(constructors);
    }

    public void showAllRobots() {
        List<Toy> robots = toyService.getAllRobots();
        toysView.viewConstructors(robots);
    }

    public void showAllDolls() {
        List<Toy> dolls = toyService.getAllDolls();
        toysView.viewConstructors(dolls);
    }

    public List<Toy> listConstructors () { return toyService.getAllConstructors(); } 
    public List<Toy> listDolls () { return toyService.getAllDolls(); } 
    public List<Toy> listRobots () { return toyService.getAllRobots(); } 

    public void createLottery(List<Toy> winnerToyList, List<Toy> constructors, List<Toy> dolls, List<Toy> robots) {
        Random random = new Random();
        Integer randomToy = random.nextInt(3);
        Toy winnerToy;
        if (randomToy == 0) {
            winnerToy = constructors.get(0);
            winnerToyList.add(winnerToy);
            constructors.remove(0);
        } else if (randomToy == 1) {
            winnerToy = dolls.get(0);
            winnerToyList.add(winnerToy);
            dolls.remove(0);
        } else {
            winnerToy = robots.get(0);
            winnerToyList.add(winnerToy);
            robots.remove(0);
        }
    }

    public void createReceivedToysFile() {
        try (FileWriter fw = new FileWriter("Received_Toys", false)) {
            fw.write("Полученные призовые игрушки");
            fw.flush();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

    public void getWinnerToy(List<Toy> winnerToyList) {
        Toy receivedToy = winnerToyList.get(0);
        Integer ID = receivedToy.getToyID();
        String name = receivedToy.getToyName();
        Integer weight = receivedToy.getWeight();
        StringBuilder sb = new StringBuilder();
        sb.append("\nID игрушки: " + ID + ", ");
        sb.append(" Наименование: " + name + ", ");
        sb.append(" Вес " + weight + ".");
        String text = sb.toString();

        try (FileWriter fw = new FileWriter("Received_Toys", true)) {
            fw.append(text);
            fw.flush();
        } catch (Exception e) {
            System.out.println("Error");
        }

        winnerToyList.remove(0);
    

    }

}
