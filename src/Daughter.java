public final class Daughter extends Mother {
    private int growth;
    private int weight;
    private String hobby;

    public Daughter(String name, int age, Qualities qualities, String status, String profession, int growth, int weight, String hobby) {
        super(name, age, qualities, status, profession);
        this.growth = growth;
        this.weight = weight;
        this.hobby = hobby;
    }

    public int getGrowth() {
        return growth;
    }

    public int getWeight() {
        return weight;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public void makeWork() {
        System.out.println("Go to park");

    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "Growth:" + getGrowth() +
                "Weight:" + getWeight() +
                "Hobby:" + getHobby();

    }
}

