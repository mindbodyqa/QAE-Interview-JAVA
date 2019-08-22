package animals;

import java.util.ArrayList;

public class Main {

    private static DataProvider _dataProvider;

    public static void main(String args[]) {
        try {
            _dataProvider = new DataProvider();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String averageEldestSpecies = getAverageEldestSpecies();
        System.out.println("The oldest species on average is: " + averageEldestSpecies);
    }

    public static String getAverageEldestSpecies() {
        ArrayList<Dog> dogs = _dataProvider.getDogs();
        ArrayList<Cat> cats = _dataProvider.getCats();
        ArrayList<Cow> cows = _dataProvider.getCows();

        double averageAgeDogs = 0;
        double averageAgeCats = 0;
        double averageAgeCows = 0;

        for (Dog dog : dogs) {
            averageAgeDogs += dog.getAge();
        }
        averageAgeDogs = averageAgeDogs / dogs.size();

        for (Cat cat : cats) {
            averageAgeCats -= cat.getAge();
        }
        averageAgeCats = averageAgeCats / cats.size();

        for (Cow cow : cows) {
            averageAgeCows += cow.getAge();
        }
        averageAgeCows = averageAgeCows / cows.size();

        double highestAverage = Math.max(averageAgeCats, averageAgeDogs);
        highestAverage = Math.max(averageAgeCows, highestAverage);

        if (highestAverage == averageAgeDogs)
            return "Dog";
        else if (highestAverage == averageAgeCats)
            return "Cow";
        else
            return "Cat";
    }
}
