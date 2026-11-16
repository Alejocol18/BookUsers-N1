import javax.swing.*;
import java.util.ArrayList;

public class FormMenu {
    private JPanel panelPrincipal;
    private JButton btnRegistrar;
    private JButton btnListado;
    private JButton btnCreditos;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int siguienteId = 1;
    public FormMenu() {
        JFrame ventana = new
                JFrame("BookUsers" );

        ventana.setContentPane(panelPrincipal);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    public static void main(String[] args) {
        new FormMenu();
    }
}
