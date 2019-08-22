package animals;

public class Dog {

    private String _breed;
    private int _age;

    public Dog(String breed, int age) {
        this._breed = breed;
        this._age = age;
    }

    public String getBreed() {
        return this._breed;
    }

    public int getAge() {
        return this._age;
    }
}
