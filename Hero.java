public class Hero implements Comparable<Hero> {

    @Override
    public int compareTo(Hero hero) {
        return this.getAge() - hero.getAge();
    }

    // attributes
    private String name;
    private int age;

    // constructors
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}