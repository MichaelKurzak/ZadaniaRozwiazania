package a_Zadania.a_Dzien_1.c_Metody;

public class Person {

    private String name = "Ala";
    private String surname = "Bak";
    private int age = 20;
    private char gender = 'w';

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void getFullName(){
        System.out.println(name + " " + surname);
    }

    public void increaseAge(){
        System.out.println(age = age + 1);
    }

}
