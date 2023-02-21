package service;
import java.util.List;

import data.Toy;

public interface DataService {
    void createToy (Integer toyID, String toyName, Integer weight);
    List<Toy>getAllToys();
}
