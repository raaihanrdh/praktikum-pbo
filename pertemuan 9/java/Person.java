/**
 * File         : PersonDAO.java
 * Deskripsi    : Person database model
 * Nama         : Muhammad Raihan Ridho 
 * NIM          : 24060121140131
 * Tanggal      : 2 juli 2023 
 */

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
