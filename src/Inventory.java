import java.util.*;

public class Inventory {
  private List guitars;
  public Inventory(){
      guitars = new LinkedList();
  }
  public void addGuitar(String serialNumber, double price,
                        Builder builder, String model, Type type,
                        Wood backWood, Wood topWood){
      guitars.add(new Guitar(serialNumber,price, new GuitarSpecs(builder,  type, model,backWood,  topWood,12)));
  }

  public Guitar getGuitar(String serialNumber){
      for (Object it : guitars) {
          Guitar guitar = (Guitar) it;
          if (Objects.equals(serialNumber, guitar.getSerialNumber()))
              return guitar;
      }
    return null;
  }

  public List search(GuitarSpecs searchSpec){
      List<Guitar> validGuitars = new ArrayList();
      for(Object it : guitars){
          Guitar guitar = (Guitar) it;
          if(guitar.getSpecs().matches(searchSpec))
            validGuitars.add(guitar);

     }
      return validGuitars;
  }
}
