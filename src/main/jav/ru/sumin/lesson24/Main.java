package ru.sumin.lesson24;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Atyrau", "Momyshuly", 21);
        Address address2 = new Address("Atyrau", "Momyshuly", 21);

        if (address1.equals(address2)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
    }
}
