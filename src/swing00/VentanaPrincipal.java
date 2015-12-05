
package swing00;
import java.awt.BorderLayout;
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
    JButton btn1=new JButton("Mi boton");
    JButton btn2=new JButton("Mi Segundo boton");
    JButton btn3=new JButton("Mi Tercer boton");
    JButton btn4=new JButton("Mi Cuarto boton");
    JButton btn5=new JButton("Mi Quinto boton");
    JTextField txt1=new JTextField();
     JTextArea txtArea=new JTextArea();
     JScrollPane scroll=new JScrollPane(txtArea);
    //MENU
    JMenuBar barra=new JMenuBar();
    JMenu mnuArchivo=new JMenu("Archivo");
    JMenuItem mnuNuevo=new JMenuItem("Nuevo");
    JMenuItem mnuAbrir=new JMenuItem("Abrir");
    JMenuItem mnuGuardar=new JMenuItem("Guardar");
    JMenuItem mnuGuardarComo=new JMenuItem("Guardar Como");
    JMenuItem mnuCon=new JMenuItem("Configurar Pagina");
    JMenuItem mnuImp=new JMenuItem("Imprimir");
    JMenuItem mnuSalir=new JMenuItem("Salir");
    JMenu mnuEdit=new JMenu("Edicion");
    JMenuItem mnuUndo=new JMenuItem("Deshacer");
    JMenuItem mnuCortar=new JMenuItem("Cortar");
    JMenuItem mnuCopiar=new JMenuItem("Copiar");
    JMenuItem mnuPegar=new JMenuItem("Pegar");
    JMenuItem mnuEl=new JMenuItem("Eliminar");
    JMenuItem mnuBusc=new JMenuItem("Buscar");
    JMenuItem mnuBus=new JMenuItem("Buscar Siguiente");
    JMenuItem mnuReem=new JMenuItem("Reemplazar");
    JMenuItem mnuIra=new JMenuItem("Ir a");
    JMenuItem mnuSelec=new JMenuItem("Seleccionar Todo");
    JMenuItem mnuHora=new JMenuItem("Hora y Fecha");
    
    
    
    public PanelPrincipal(){
      barra.add(mnuArchivo);
      mnuArchivo.add(mnuNuevo);
      mnuArchivo.add(mnuAbrir);
      mnuArchivo.add(mnuGuardar);
      mnuArchivo.add(mnuGuardarComo);
         mnuArchivo.addSeparator();
      mnuArchivo.add(mnuCon);
      mnuArchivo.add(mnuImp);
         mnuArchivo.addSeparator();
      mnuArchivo.add(mnuSalir);
   
      barra.add(mnuEdit);
      mnuEdit.add(mnuUndo);
      mnuUndo.setEnabled(false);
      mnuEdit.add(mnuCortar);
      mnuCortar.setEnabled(false);
      mnuEdit.add(mnuCopiar);
      mnuCopiar.setEnabled(false);
      mnuEdit.add(mnuPegar);
      mnuEdit.add(mnuEl);
      mnuEl.setEnabled(false);
      mnuEdit.add(mnuBusc);
      mnuBusc.setEnabled(false);
      mnuEdit.add(mnuBus);
      mnuEdit.add(mnuReem);
      mnuEdit.add(mnuIra);
      mnuEdit.add(mnuSelec);
      mnuEdit.add(mnuHora);
        this.setLayout(new BorderLayout());
        //this.add(btn1,BorderLayout.NORTH);
        //this.add(btn2,BorderLayout.CENTER);
        //this.add(btn3,BorderLayout.SOUTH);
        this.add(btn4,BorderLayout.EAST);
        this.add(btn5,BorderLayout.WEST);
        //this.add(txt1,BorderLayout.CENTER);
        this.add(scroll,BorderLayout.CENTER);
        this.add(barra,BorderLayout.NORTH);
        
    }
}



