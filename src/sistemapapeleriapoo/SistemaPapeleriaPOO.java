package sistemapapeleriapoo;

import GUI.JFLogin;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class SistemaPapeleriaPOO {
    public static void main(String[] args) {
        try {
            FlatMacLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        JFLogin ventanaLogin = new JFLogin();
        ventanaLogin.setVisible(true);
        ventanaLogin.setLocationRelativeTo(null);
    }
}
