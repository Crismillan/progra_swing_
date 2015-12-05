
package swing00;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    PanelPrincipal p=new PanelPrincipal();
    public VentanaPrincipal(){
        
        this.setSize(500,500);
        this.setTitle("Mi primera ventana");
        this.setVisible(true);
        this.add(p);
        
    }
    
}
class PanelPrincipal extends JPanel {
    JLabel lblNombre=new JLabel("Nombre");
    JTextField txtNombre=new JTextField();
    JLabel lblApellido=new JLabel("Apellido");
    JTextField txtApellido=new JTextField();
    JButton btnMostrar=new JButton("Mostar");
    JButton btnLimpiar=new JButton("Limpiar");
    
public PanelPrincipal(){
    this.setLayout(new GridLayout(3,2));
    this.add(lblNombre);
    this.add(txtNombre);
    this.add(lblApellido);
    this.add(txtApellido);
    this.add(btnMostrar);
    this.add(btnLimpiar);
    
    
    
    
    
}
}





