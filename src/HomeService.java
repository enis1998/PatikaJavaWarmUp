import java.util.ArrayList;
import java.util.List;

public class HomeService {
    private List<Home> homeList;
    private List<Villa> villaList;
    private List<Summery> summeryList;

    public HomeService(List<Home> homeList, List<Villa> villaList, List<Summery> summeryList) {
        this.homeList = homeList;
        this.villaList = villaList;
        this.summeryList = summeryList;
    }

    public List<Home> getHomeList() {
        return homeList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<Summery> getSummeryList() {
        return summeryList;
    }

    public double getTotalPriceOfHouses() {
        double totalPrice = 0.0;
        for (Home home : homeList) {
            totalPrice += home.getPrice();
        }
        return totalPrice;
    }

    public double getVillasTotalPrice() {
        double totalPrice = 0.0;
        for (Villa villa : villaList) {
            totalPrice += villa.getPrice();
        }
        return totalPrice;
    }

    public double getSummeryTotalPrice() {
        double totalPrice = 0.0;
        for (Summery summery : summeryList) {
            totalPrice += summery.getPrice();
        }
        return totalPrice;
    }

    public double getAllHousesTotalPrice() {
        return getTotalPriceOfHouses() + getVillasTotalPrice() + getSummeryTotalPrice();
    }
    public double getHousesAverageSquareMeters() {
        double totalSquareMeters = 0.0;
        for (Home home : homeList) {
            totalSquareMeters += home.getSquareMeters();
        }
        return totalSquareMeters / homeList.size();
    }

    public double getVillasAverageSquareMeters() {
        double totalSquareMeters = 0.0;
        for (Villa villa : villaList) {
            totalSquareMeters += villa.getSquareMeters();
        }
        return totalSquareMeters / villaList.size();
    }

    public double getSummeryAverageSquareMeters() {
        double totalSquareMeters = 0.0;
        for (Summery summery : summeryList) {
            totalSquareMeters += summery.getSquareMeters();
        }
        return totalSquareMeters / summeryList.size();
    }

    public double getAllHousesAverageSquareMeters() {
        double totalSquareMeters = 0.0;
        int totalHouses = homeList.size() + villaList.size() + summeryList.size();
        for (Home home : homeList) {
            totalSquareMeters += home.getSquareMeters();
        }
        for (Villa villa : villaList) {
            totalSquareMeters += villa.getSquareMeters();
        }
        for (Summery summery : summeryList) {
            totalSquareMeters += summery.getSquareMeters();
        }
        return totalSquareMeters / totalHouses;
    }
    public List<Home> filterHouses(int numberOfRooms, int numberOfHalls) {
        List<Home> filteredHouses = new ArrayList<>();
        for (Home home : homeList) {
            if (home instanceof Villa) {
                Villa villa = (Villa) home;
                if (villa.getRoomNumber() == numberOfRooms && villa.getHallNumber() == numberOfHalls) {
                    filteredHouses.add(villa);
                }
            } else if (home instanceof Summery) {
                Summery summery = (Summery) home;
                if (summery.getRoomNumber() == numberOfRooms && summery.getHallNumber() == numberOfHalls) {
                    filteredHouses.add(summery);
                }
            } else {
                if (home.getRoomNumber() == numberOfRooms && home.getHallNumber() == numberOfHalls) {
                    filteredHouses.add(home);
                }
            }
        }
        return filteredHouses;
    }

}
