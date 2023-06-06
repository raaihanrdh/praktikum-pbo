/**
 * File : MainDAO.java
 * Nama 	 : Muhammad Raihan Ridho 
 * NIM 	 : 24060121140131
 * Tanggal    : 2 juli 2023 
 * Deskripsi : Main program untuk akses DAO
 */

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
