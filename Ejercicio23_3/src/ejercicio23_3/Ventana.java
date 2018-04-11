package ejercicio23_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Arturo
 */
public class Ventana implements ActionListener{

    JFrame marco;
    JPanel panel;
    JButton bSaudo, bDesp;
    JLabel etiqueta;

    public Ventana(){
        //Instanciamos los objetos
        marco=new JFrame("Ventana");
        panel=new JPanel();
        bSaudo=new JButton("Saudos");
        bDesp=new JButton("Despedida");
        etiqueta=new JLabel();
        //Damos valores a la ventana
        marco.setBounds(100, 100, 400, 200);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Añadimos el panel y el boton
        panel.add(bSaudo);
        panel.add(bDesp);
        panel.add(etiqueta);
        marco.add(panel);
        marco.pack();
        bSaudo.addActionListener(this);
        bDesp.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object boton=e.getSource();
        if(boton==bSaudo){
            etiqueta.setText("Un Saudo a DAM");
            marco.pack();
        }else{
            etiqueta.setText("Fin do Programa");
            marco.pack();
        }
    }

}
