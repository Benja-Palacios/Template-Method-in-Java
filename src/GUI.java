import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
   public GUI(){
       setTitle("Mantenimiento de Motos");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(500,100);

       JPanel panel = new JPanel();
       panel.setLayout(new FlowLayout());
       JLabel marcaLabel = new JLabel("Marca:");
       JTextField marcaField = new JTextField(10);

       JLabel modeloLabel = new JLabel("Modelo");
       JTextField modeloField = new JTextField(10);

       JButton realizarMantenimientoButton  = new JButton("Realizar Mantenimiento");

       realizarMantenimientoButton.addActionListener(e ->{
           String marca = marcaField.getText();
           String modelo = modeloField.getText();

           MantenimientoMoto mantenimientoMoto;
           if("Honda".equalsIgnoreCase(marca)){
               mantenimientoMoto = new MantenimientoHonda(modelo);
           }else if("Yamaha".equalsIgnoreCase(marca)){
               mantenimientoMoto = new MantenimientoYamaha(modelo);
           }else{
               JOptionPane.showMessageDialog(this,
                       "Marca no Valida", "Error", JOptionPane.ERROR_MESSAGE);
               return;
           }
           mantenimientoMoto.realizarMantenimiento();
       });

       panel.add(marcaLabel);
       panel.add(marcaField);
       panel.add(modeloLabel);
       panel.add(modeloField);
       panel.add(realizarMantenimientoButton);

       add(panel);
       setVisible(true);
   }
}
