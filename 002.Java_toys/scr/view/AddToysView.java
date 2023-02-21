package view;
import java.util.List;
import java.util.logging.Logger;

import data.Toy;

public class AddToysView {
    public void viewConstructors(List<Toy> constructors) {
        Logger logger = Logger.getAnonymousLogger();
        for (Toy constructor : constructors) {
            logger.info(constructor.toString());
        }
    }
    

    public void viewRobots(List<Toy> robots) {
        Logger logger = Logger.getAnonymousLogger();
        for (Toy robot : robots) {
            logger.info(robot.toString());
        }
    }

    public void viewDolls(List<Toy> dolls) {
        Logger logger = Logger.getAnonymousLogger();
        for (Toy doll : dolls) {
            logger.info(doll.toString());
        }
    }

    public void viewWinnerList(List<Toy> winnerToys) {
        Logger logger = Logger.getAnonymousLogger();
        for (Toy winerToy : winnerToys) {
            logger.info(winerToy.consoleWinnerToys());
        }
    }
}
