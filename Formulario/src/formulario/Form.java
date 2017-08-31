
package formulario;
//se importan las librerias necesarias
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Form extends JFrame implements ActionListener{
    //se crean las variables necesarias
        private JLabel nom, app, apm, esc;
        private JTextField tnom, tapp, tapm, tesc;
        private JButton enviar;
    //se inicializa la ventana    
        public Form() {                  
        configurarVentana();        
        inicializarComponentes();   
        }
    //se cpnfigura la ventana   
        private void configurarVentana() {                   
        setSize(500, 500);  //(ancho, alto)
        setLocationRelativeTo(null);                       
        setLayout(null);                                                                 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);    
        }
    // se introducen los componentes  
        private void inicializarComponentes() {
            nom = new JLabel("Nombre: ");
            tnom = new JTextField();
            app = new JLabel("Apellido paterno: ");
            tapp = new JTextField();
            apm = new JLabel("Apellido materno: ");
            tapm = new JTextField();
            esc = new JLabel("Escuela: ");
            tesc = new JTextField();
            enviar = new JButton("Enviar");           
            
            nom.setBounds(20, 50, 120, 20);
            app.setBounds(20, 100, 120, 20);
            apm.setBounds(20, 150, 120, 20);
            esc.setBounds(20, 200, 120, 20);
            tnom.setBounds(200, 50, 200, 20);
            tapp.setBounds(200, 100, 200, 20);
            tapm.setBounds(200, 150, 200, 20);
            tesc.setBounds(200, 200, 200, 20);
            enviar.setBounds(20, 300, 100, 20);          
            
            add(nom);        
            add(app);
            add(apm);
            add(esc);
            add(tnom);
            add(tapp);
            add(tapm);
            add(tesc);
            add(enviar);
            
            enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               accionenviar();   
               }
        });
        }
        
        // se realiza el envio a las variables de instancia
        public void accionenviar(){ 
            Datos datos = new Datos ();
            
            datos.setNombre(tnom.getText());
            datos.setApp(tapp.getText());
            datos.setApm(tapm.getText());
            datos.setEsc(tesc.getText());
              
            JOptionPane.showMessageDialog(this, "Enviado");                   
            JOptionPane.showMessageDialog(this, datos.getNombre());   

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
