package ejercicio23_1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Arturo
 */
public class Ventana implements ActionListener{

    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;

    public Ventana(){
        //Instanciamos los objetos
        marco=new JFrame("Ventana");
        panel=new JPanel();
        boton=new JButton("Pulsa el botón");
        //Damos valores a la ventana
        marco.setBounds(100, 100, 400, 200);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Añadimos el panel y el boton
        panel.add(boton);
        marco.add(panel);
        boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        etiqueta=new JLabel("Botón Pulsado");
        panel.add(etiqueta);
        panel.updateUI();

    }
}
