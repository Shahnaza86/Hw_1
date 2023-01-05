public class Main {
    public static void main(String[] args) {
        Person person = new Person(18, "Hospital");
        Mother mother = new Mother("Alena", 35, Qualities.GOOD, "married", "doctor");
        System.out.println(mother.getInfo());
        mother.makeWork();
        mother.makeWork("heal pacient");

        Person person1 = new Person(25, "Beeline");
        Daughter daughter = new Daughter("Milana", 16, Qualities.FRIENDLY, "student", "waiter", 170, 45, "book");
        System.out.println(daughter.getInfo());
        daughter.makeWork();
        daughter.makeWork("read book");

        Person person2 = new Person(40, "Shcool");
        Daughter daughter1 = new Daughter("Alina", 18, Qualities.FUNNY, "merried", "teacher", 160, 58, "music");
        System.out.println(daughter1.getInfo());
        daughter1.makeWork();
        daughter1.makeWork("listen to music");
    }
}