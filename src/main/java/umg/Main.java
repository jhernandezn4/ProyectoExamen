package umg;

import umg.DAO.UsuariosDAO;
import umg.DTO.UsuariosDTO;
import umg.Vistas.Login;
import org.mindrot.jbcrypt.BCrypt;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {

        Login login = new Login();
        login.pack();
        //se abre login
        login.setVisible(true);

    }

}