package ejercicio23_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Arturo
 */
public class Ventana implements ActionListener{
    JFrame marco, marco2;
    JPanel panel;
    JButton boton;

    public Ventana(){
        marco=new JFrame("Ventana");
        marco2=new JFrame("Ventana Nueva");
        panel=new JPanel();
        boton=new JButton("Nueva Ventana");
        
        marco.setBounds(100, 100, 400, 200);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel.add(boton);
        marco.add(panel);
        boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        marco2.setBounds(150, 150, 400, 200);
        marco2.setVisible(true);
        marco2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
