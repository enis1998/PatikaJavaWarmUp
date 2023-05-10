import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creation house, villa, summery object
        Home home1 = new Home(100000.0, 100, 5,2);
        Home home2 = new Home(150000.0, 150,3 ,5);
        Home home3 = new Home(200000.0, 200, 1 ,1);

        Villa villa1 = new Villa(500000.0, 300, 500, 3, 1);
        Villa villa2 = new Villa(750000.0, 500, 1000, 4 ,2);
        Villa villa3 = new Villa(650000.0, 400, 750, 5 ,1);

        Summery summery1 = new Summery(300000.0, 200, 100, 5,1);
        Summery summery2 = new Summery(400000.0, 300, 200, 5, 2);
        Summery summery3 = new Summery(350000.0, 270, 150, 4, 1);

        //Adding homes to list
        List<Home> homeList = new ArrayList<>();
        homeList.add(home1);
        homeList.add(home2);
        homeList.add(home3);

        List<Villa> villaList = new ArrayList<>();
        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);

        List<Summery> summeryList = new ArrayList<>();
        summeryList.add(summery1);
        summeryList.add(summery2);
        summeryList.add(summery3);

        //Creating service to get feature of houses
        HomeService homeService = new HomeService(homeList, villaList, summeryList);

        System.out.println("Total price of houses: " + homeService.getTotalPriceOfHouses());
        System.out.println("Total price of the villas: " + homeService.getVillasTotalPrice());
        System.out.println("Total price of the summery: " + homeService.getSummeryTotalPrice());
        System.out.println("Total price of all houses: " + homeService.getAllHousesTotalPrice());
        System.out.println("Average square meter of houses: " + homeService.getHousesAverageSquareMeters());
        System.out.println("Average square meter of villas: " + homeService.getVillasAverageSquareMeters());
        System.out.println("Average square meter of summery: " + homeService.getSummeryAverageSquareMeters());
        System.out.println("Average square meter of all houses: " + homeService.getAllHousesAverageSquareMeters());

        List<Home> filteredHouses = homeService.filterHouses(3, 2);
        System.out.println("Houses with 3 rooms and 2 living rooms: ");
        for (Home home : filteredHouses) {
            System.out.println(home);
        }
    }
}