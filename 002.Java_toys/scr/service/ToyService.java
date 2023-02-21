package service;

import java.util.ArrayList;
import java.util.List;

import data.Toy;

public class ToyService implements DataService {

    private List<Toy> constructors;
    private List<Toy> robots;
    private List<Toy> dolls;

    public ToyService() {
        this.constructors = new ArrayList<>();
        this.robots = new ArrayList<>();
        this.dolls = new ArrayList<>();
    }

    @Override
    public void createToy(Integer toyID, String toyName, Integer weight) {
        if (toyName == "конструктор" || toyName == "Конструктор") {
            this.constructors.add(new Toy(toyID, toyName, weight));
        } else if (toyName == "робот" || toyName == "Робот") {
            this.robots.add(new Toy(toyID, toyName, weight));
        } else if (toyName == "кукла" || toyName == "Кукла") {
            this.dolls.add(new Toy(toyID, toyName,  weight));
        }
    }


    public List<Toy> getAllConstructors() {
        return this.constructors;
    }

    public List<Toy> getAllRobots() {
        return this.robots;
    }

    public List<Toy> getAllDolls() {
        return this.dolls;
    }


    @Override
    public List<Toy> getAllToys() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllToys'");
    }
    
}
