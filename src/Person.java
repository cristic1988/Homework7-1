public class Person {

    public String personInfo(String name, String surname, String city, long phone) {
        return null;


    }

    public static void main(String[] args) {
        Person program = new Person();
        String person1 = program.personInfo("Will", "Smith", "New York", 2936729462846L);
        String person2 = program.personInfo("Jackie", "Chan", "Shanghai", 12312412412L);
        String person3 = program.personInfo("Sherlock", "Holmes", "London", 37742123513L);

        String formatedString = String.format("Зателефонувати громадянинові %s %s з міста %s за номером телефону %d", person1());
        System.out.println(formatedString);

    }


}
