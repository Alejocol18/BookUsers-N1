
import javax.swing.*;
import java.awt.Image;
import java.io.File;

public class FormDetalle extends JFrame {
    private JPanel panelPrincipal;
    private JLabel lblIdentificacion;
    private JLabel lblUsername;
    private JLabel lblTelefono;
    private JLabel lblCorreo;
    private JLabel lblFoto;
    private JButton btnGenerarPDF;
    private JButton btnEditar;
    private JButton btnEliminar;
    private JButton btnVolver;
    private Usuario usuario;

    public FormDetalle(Usuario usuario) {
        this.usuario = usuario;

        setContentPane(panelPrincipal);
        setTitle("Detalles del usuario");
        setSize(650, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrarDatos();

        btnVolver.addActionListener(e -> dispose());

        btnEditar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "La edición se implementará después");
        });

        btnEliminar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "La eliminación se implementará después");
        });

        btnGenerarPDF.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "La generación del PDF se implementará después");
        });
    }

    private void mostrarDatos() {
        lblIdentificacion.setText(
                "Identificación: " +
                        usuario.getTipoIdentificacion() + " - " +
                        usuario.getNumeroIdentificacion()
        );

        String nombreCompleto =
                usuario.getPrimerNombre() + " " +
                        usuario.getSegundoNombre() + " " +
                        usuario.getPrimerApellido() + " " +
                        usuario.getSegundoApellido();

        lblUsername.setText(
                "Nombre: " + nombreCompleto +
                        " | Usuario: " + usuario.getUsername()
        );

        lblTelefono.setText("Teléfono: " + usuario.getTelefono());
        lblCorreo.setText("Correo: " + usuario.getCorreo());

        String ruta = usuario.getRutaFoto();

        if (ruta != null && !ruta.isEmpty() && new File(ruta).exists()) {
            ImageIcon imagen = new ImageIcon(ruta);
            Image foto = imagen.getImage().getScaledInstance(
                    120, 120, Image.SCALE_SMOOTH
            );
            lblFoto.setIcon(new ImageIcon(foto));
            lblFoto.setText("");
        } else {
            lblFoto.setText("Sin foto");
        }
    }
}
