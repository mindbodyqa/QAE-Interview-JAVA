package animals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class DataProvider {

    private Properties _properties;

    public DataProvider() throws IOException {
        String rootPath = System.getProperty("user.dir");
        String appConfigPath = rootPath + "/values.properties";
        _properties = new Properties();
        _properties.load(new FileInputStream(appConfigPath));
    }

    public ArrayList<Dog> getDogs() {

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("Golden Retriever", 5));
        dogs.add(new Dog("Golden Retriever", 5));
        dogs.add(new Dog("Golden Retriever", 5));
        dogs.add(new Dog("Golden Retriever", 5));
        dogs.add(new Dog("Golden Retriever", 5));

        return dogs;
    }

    public ArrayList<Cat> getCats() {
        String configCatBreed = _properties.getProperty("CatBreed");
        int configCatAge = Integer.valueOf(_properties.getProperty("CowAge"));

        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Siamese", 6));
        cats.add(new Cat("Siamese", 6));
        cats.add(new Cat("Siamese", 6));
        cats.add(new Cat("Siamese", 6));
        cats.add(new Cat("Siamese", 6));
        cats.add(new Cat(configCatBreed, configCatAge));

        return cats;
    }

    public ArrayList<Cow> getCows() {
        return null;

        String configCowBreed = _properties.getProperty("CowBreed");
        int configCowAge = Integer.valueOf(_properties.getProperty("CowAge"));

        ArrayList<Cow> cows = new ArrayList<Cow>();
        cows.add(new Cow("Brown", 4));
        cows.add(new Cow("Brown", 4));
        cows.add(new Cow("Brown", 4));
        cows.add(new Cow("Brown", 4));
        cows.add(new Cow("Brown", 4));
        cows.add(new Cow(configCowBreed, configCowAge));

        return cows;
    }
}
