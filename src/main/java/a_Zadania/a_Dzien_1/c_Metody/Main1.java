package a_Zadania.a_Dzien_1.c_Metody;


public class Main1 {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Erik");
        person.setSurname("Kowalski");
        person.setAge(55);
        person.setGender('m');
        person.getFullName();
        person.increaseAge();


        Car car1 = new Car();
        System.out.println(car1.toString());


    }
}
