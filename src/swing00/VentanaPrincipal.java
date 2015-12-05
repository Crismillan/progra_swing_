
package swing00;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    JLabel lblNombre=new JLabel("Numero1");
    JTextField txtN1=new JTextField();
    JLabel lblApellido=new JLabel("Numero2");
    JTextField txtN2=new JTextField();
    JButton btnMostrar=new JButton("Mostrar");
    JButton btnLimpiar=new JButton("Limpiar");
    JTextField lblResultado=new JTextField();
    JLabel txtResultado=new JLabel("Resultado");
    
public PanelPrincipal(){
   this.setLayout(null);
   lblNombre.setBounds(20,20,120,20);
   this.add(lblNombre);
   txtN1.setBounds(150,20,120,20);
   this.add(txtN1);
   lblApellido.setBounds(20,50,120,20);
   this.add(lblApellido);
   txtN2.setBounds(150,50,120,20);
   this.add(txtN2);
   btnMostrar.setBounds(20,80,120,20);
   this.add(btnMostrar);
   btnLimpiar.setBounds(150,80,120,20);
   this.add(btnLimpiar);
   lblResultado.setBounds(20,110,120,20);
   txtResultado.setBounds(150,110,120,20);
   this.add(txtResultado);
   this.add(lblResultado);
    Oyente o1=new Oyente();
        btnMostrar.addActionListener(o1);
        
        
        Oyente2 o2=new Oyente2();
        btnLimpiar.addActionListener(o2);
        
    }
    class Oyente implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int n1=Integer.parseInt(txtN1.getText());
            int n2=Integer.parseInt(txtN2.getText());
            int resultado=n1*n2;
            txtResultado.setText(""+resultado);
            
        }
    }
        class Oyente2 implements ActionListener{
            public void actionPerformed(ActionEvent e){
                txtN1.setText("");
                txtN2.setText("");
            
        }
    }

   
    
    
    
    
    
}






