import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private List<Attraction> attractions;

    // Внутренний класс для хранения информации об аттракционе
    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

         Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }
        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

        String getWorkingHours() {
            return workingHours;
        }

        void setWorkingHours(String workingHours) {
            this.workingHours = workingHours;
        }

        double getCost() {
            return cost;
        }

        void setCost(double cost) {
            this.cost = cost;
        }
    }

     Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }

     void addAttraction(String name, String workingHours, double cost) {
        Attraction attraction = new Attraction(name, workingHours, cost);
        attractions.add(attraction);
    }

     List<Attraction> getAttractions() {
        return attractions;
    }
    public static void main(String[] args) {

            Park cityPark = new Park("Городской парк развлечений");

            cityPark.addAttraction("Колесо обозрения", "10:00–20:00", 300.00);
            cityPark.addAttraction("Карусель", "09:00–19:00", 150.00);
            cityPark.addAttraction("Американские горки", "11:00–21:00", 400.00);

            List<Park.Attraction> parkAttractions = cityPark.getAttractions();

            for (Park.Attraction attraction : parkAttractions) {
                System.out.println("Аттракцион: " + attraction.getName());
                System.out.println("Время работы: " + attraction.getWorkingHours());
                System.out.println("Стоимость: " + attraction.getCost() + " руб.");
                System.out.println();
            }
        }
    }

