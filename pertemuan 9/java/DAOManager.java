/**
 * Nama      : Muhammad Raihan Ridho
 * NIM       : 24060121140131
 * Tanggal   : 2 juli 2023 
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
*/

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
