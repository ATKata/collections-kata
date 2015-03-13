public class Person {
    public final String name;
    public final int age;
    public final double height;
    public final HairColour hairColour;

    public Person(String name, int age, double height, HairColour hairColour) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public HairColour getHairColour() {
        return hairColour;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null
                && obj instanceof Person
                && ((Person) obj).name == name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
