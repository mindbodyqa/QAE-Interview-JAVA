package animals;

public class Cow {

    private String _breed;
    private int _age;

    public Cow(String breed, int age) {
        this._breed = breed;
        this._age = age;
    }

    public String getBreed()
    {
        return this._breed;
    }

    public int getAge() {
        return this._age;
    }
}
