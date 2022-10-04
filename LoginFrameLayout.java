package LogFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginFrameLayout extends JFrame implements ActionListener {
    
    JButton LogB;
    JButton NewB;
    JPanel contenedor;
    JLabel etiqueta1;
    JLabel etiqueta2;
    JLabel espacio1;
    JLabel espacio2;
    JTextField textoUsuario;
    JTextField textoContraseña;
    
    LoginFrameLayout(){
        
        etiqueta1 = new JLabel();
        etiqueta1.setText("Usuario:");
        textoUsuario = new JTextField(15);
        
        etiqueta2 = new JLabel();
        etiqueta2.setText("Contraseña:");
        textoContraseña = new JPasswordField(15);
        
        espacio1 = new JLabel();
        espacio1.setText(" ");
        
        espacio2 = new JLabel();
        espacio2.setText(" ");
        
        LogB =  new JButton("Ingrear");
        
        NewB = new JButton("Crear cuenta");
        
        contenedor = new JPanel(new GridLayout(10, 6));
        contenedor.add(etiqueta1);
        contenedor.add(textoUsuario);
        contenedor.add(etiqueta2);
        contenedor.add(textoContraseña);
        contenedor.add(espacio1);
        contenedor.add(LogB);
        contenedor.add(espacio2);
        contenedor.add(NewB);
        add(contenedor, BorderLayout.NORTH);
        setTitle("Login Frame");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
