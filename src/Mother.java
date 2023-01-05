public class Mother extends Human {
    private String status;
    private String profession;

    public Person getPerson() {
        return person;
    }

    private Person person;

    public String getStatus() {
        return status;
    }

    public String getProfession() {
        return profession;
    }

    public Mother(String name, int age, Qualities qualities, String status, String profession) {
        super(name, age, qualities);
        this.status = status;
        this.profession = profession;
    }

    public void makeWork() {
        System.out.println("Cleaning at home");
    }

    final public void makeWork(String work) {
        System.out.println(work);
    }

    public String getInfo() {
        return "Name:" + getName()
                + "Age:" + getAge()
                + "Qualities:" + getQualities()
                + "Status:" + getStatus()
                + "Profession:" + getProfession()
                + "person.age:" + person.getAge()
                + "person.place off work:" + person.getPlaceOfWork();
    }
}
