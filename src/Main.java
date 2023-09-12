import java.util.List;

public class Main {
    private static void initializeInventory(Inventory inventory){
        inventory.addGuitar("V95693",
                1499.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V9512",
                1512.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
    public static void main(String[] args) {
        // setting up Inventory
        Inventory inventory = new Inventory();

        // Initializing the inventory
        initializeInventory(inventory);

        // making a guitar
        GuitarSpecs guitarSpecs = new GuitarSpecs(Builder.FENDER,Type.ELECTRIC,"Stratocastor",Wood.ALDER,Wood.ALDER,12);
        List guitars = inventory.search(guitarSpecs);
        if(!guitars.isEmpty()){
            System.out.println("Here is Eren : ");
            System.out.println("-------------------------------");
           for(Object it : guitars){
               Guitar guitar = (Guitar) it;
               System.out.println(guitar);
               System.out.println("-------------------------------");
           }

        }else{
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
        Guitar g1 = inventory.getGuitar("V95693");
       // System.out.println(g1);
    }
}