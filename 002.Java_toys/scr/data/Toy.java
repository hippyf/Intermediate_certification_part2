package data;

public class Toy {
    private Integer toyID;
    private String toyName;
    private Integer weight;

    public Toy(Integer toyID, String toyName, Integer weight) {
        this.toyID = toyID;
        this.toyName = toyName;
        this.weight = weight;
    }

    public Integer getToyID() {
        return toyID;
    }
     public void setToyID(Integer toyID) {
        this.toyID = toyID;
     }

     public String getToyName() {
        return toyName;
     }

     public void setToyName(String toyName) {
        this.toyName = toyName;
     }


     public Integer getWeight() {
        return weight;
     }

     public void setWeight(Integer weight) {
        this.weight = weight;
     }

     @Override
     public String toString() {
      return "Игрушка{ID = '" + getToyID() + '\'' + ", Наименование = '" + getToyName() + '\'' + ", Вес = '" + getWeight() + '\'' + '}';
     }

     public String consoleWinnerToys() {
      return "Призовые игрушки: ID = " + getToyID() + " Наименование: " + getToyName() + " Вес " + getWeight();
     }

     
}