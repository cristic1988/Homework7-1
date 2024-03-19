public class Person {

    public String personInfo(String name, String surname, String city, long phone) {
        return "Зателефонувати громадянинові " + name + " " + surname + " з міста " + city + " можна за номером " + phone;




    }

    public static void main(String[] args) {
        Person program = new Person();
        String person1 = program.personInfo("Will", "Smith", "New York", 2936729462846L);
        String person2 = program.personInfo("Jackie", "Chan", "Shanghai", 12312412412L);
        String person3 = program.personInfo("Sherlock", "Holmes", "London", 37742123513L);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);







    }


}
