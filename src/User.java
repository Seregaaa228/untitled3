public class User {
    String name;
    int age;
    String town;

    public User(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + town + ".";
    }
}
