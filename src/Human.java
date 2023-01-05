public class Human {
    private String name;
    private int age;
    private Qualities qualities;

    public Qualities getQualities() {
        return qualities;
    }


    public Human(String name, int age, Qualities qualities) {
        this.name = name;
        this.age = age;
        this.qualities = qualities;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
