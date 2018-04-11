package ejercicio23_2;

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
    JButton bBases, bProg;

    public Ventana(){
        //Instanciamos los objetos
        marco=new JFrame("Curso DAM");
        panel=new JPanel();
        bBases=new JButton("Bases de datos");
        bProg=new JButton("Programación");
        //Damos valores a la ventana
        marco.setBounds(100, 100, 400, 200);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Añadimos el panel y el boton
        panel.add(bBases);
        panel.add(bProg);
        marco.add(panel);
        marco.pack();
        bBases.addActionListener(this);
        bProg.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object boton=e.getSource();
        if(boton==bBases){
            marco.setTitle("Bases de datos");
        }else{
            marco.setTitle("Programación");
        }
    }

}
