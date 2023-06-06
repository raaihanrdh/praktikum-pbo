import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
* Nama 	    : Muhammad Raihan Ridho 
* NIM 	    : 24060121140131
* Tanggal   : 2 juli 2023 
* File      : MySQLPersonDAO.java
* Deskripsi : implementasi PersonDAO untuk MySQL
*/

public class MySQLPersonDAO implements PersonDAO{

    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        //membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection (
                "jdbc:mysql://localhost/pbo","root","mraihanrdh21.");
        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database
        con.close();
    }
}
