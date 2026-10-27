public class Main {
    public static void main(String[] args) {


        // Create instances of the provinces and territories
        Canada novaScotia = new novaScotia() {};
        Canada manitoba = new Manitoba() {};
        Canada saskatchewan = new Saskatchewan() {};
        Canada alberta = new Alberta() {};
        Canada britishColumbia = new britishColumbia() {};
        Canada newBrunswick = new newBrunswick() {};
        Canada newfoundlandAndLabrador = new newfoundlandAndLabrador() {};
        Canada princeEdwardIsland = new princeEdwardIsland() {};
       Canada quebec = new Quebec() {};
       Canada ontario = new Ontario() {};
       Canada northWestTerritories = new northWestTerritories() {}; 
        Canada nunavut = new Nunavut() {};
        Canada yukon = new Yukon() {};
       

        // Call the methods for each province and territory
    System.out.println("Provinces:");
            
       
        System.out.println("Nova Scotia:");
        novaScotia.provinceAndTerritories();
        novaScotia.city();
        System.out.println("\n");  

        System.out.println("\nManitoba:");
        manitoba.provinceAndTerritories();
        manitoba.city();
        System.out.println("\n");  

        System.out.println("\nSaskatchewan:");
        saskatchewan.provinceAndTerritories();
        saskatchewan.city();
        System.out.println("\n");  

        System.out.println("\nAlberta:");
        alberta.provinceAndTerritories();
        alberta.city();
        System.out.println("\n");  

        System.out.println("british Columbia:");
        britishColumbia.provinceAndTerritories();
        britishColumbia.city();
        System.out.println("\n");  

        System.out.println("new Brunswick:");
        newBrunswick.provinceAndTerritories();
        newBrunswick.city();
        System.out.println("\n");   

        System.out.println("newfoundland And Labrador:");
        newfoundlandAndLabrador.provinceAndTerritories();
        newfoundlandAndLabrador.city();
        System.out.println("\n");  

        System.out.println("prince Edward Island:");
        princeEdwardIsland.provinceAndTerritories();
        princeEdwardIsland.city();      
        System.out.println("\n");  

        System.out.println("quebec:");
        quebec.provinceAndTerritories();
        quebec.city();
        System.out.println("\n");   

        System.out.println("ontario:");
        ontario.provinceAndTerritories();
        ontario.city();
        System.out.println("\n");   

        
        System.out.println("Territories:");
        
        
        System.out.println("northwest Territories:");
        northWestTerritories.provinceAndTerritories();
        northWestTerritories.city();
        System.out.println("\n");       

     System.out.println("\nNunavut:");
        nunavut.provinceAndTerritories();
        nunavut.city();
        System.out.println("\n");  

        System.out.println("\nYukon:");
        yukon.provinceAndTerritories();
        yukon.city();  
         System.out.println("\n");          




    }

}