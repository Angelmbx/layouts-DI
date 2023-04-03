import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ventana extends JFrame implements ItemListener, ActionListener {

    JLabel usuario= new JLabel("Usuario: ");
    JLabel equipo = new JLabel("Equipo favorito: ");
    JLabel localidad = new JLabel("Localidad: ");

    TextField TFusuario = new TextField();
    TextField TFlocalidad = new TextField();
    JComboBox Comboequipo = new JComboBox<>();
    JButton BTguardar = new JButton("Guardar");
    JButton BTcancelar = new JButton("Salir");

public Ventana(){
    Container contenedor = this.getContentPane();
    contenedor.setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.gridx=0; constraints.gridy=0; constraints.gridwidth=1; constraints.gridheight=1;
    constraints.weightx=1; constraints.weighty=1; contenedor.add(usuario, constraints);

    constraints.gridx=0; constraints.gridy=1; constraints.gridwidth=1; constraints.gridheight=1;
    constraints.weightx=1; constraints.weighty=1; contenedor.add(equipo, constraints);

    constraints.gridx=0; constraints.gridy=2; constraints.gridwidth=1; constraints.gridheight=1;
    constraints.weightx=1; constraints.weighty=1; contenedor.add(localidad, constraints);

    constraints.gridx=1; constraints.gridy=0; constraints.gridwidth=1; constraints.gridheight=1;
    constraints.weightx=6; constraints.weighty=1; constraints.fill=MAXIMIZED_HORIZ;contenedor.add(TFusuario, constraints);

    constraints.gridx=1; constraints.gridy=2; constraints.gridwidth=1; constraints.gridheight=1;
    constraints.weightx=6; constraints.weighty=1; constraints.fill=MAXIMIZED_HORIZ;contenedor.add(TFlocalidad, constraints);

    constraints.gridx=1; constraints.gridy=1; constraints.gridwidth=6; constraints.gridheight=1;
    constraints.weightx=6; constraints.weighty=1; constraints.fill=MAXIMIZED_HORIZ;
    Comboequipo.addItem("---");
    Comboequipo.addItem("RC Celta"); Comboequipo.addItem("Timberwolves"); Comboequipo.addItem("Coruxo"); Comboequipo.addItem("76ers");
    Comboequipo.addItemListener(this);
    contenedor.add(Comboequipo, constraints);

    constraints.gridx=0; constraints.gridy=4; constraints.gridwidth=1; constraints.gridheight=1;
    constraints.weightx=1; constraints.weighty=1; contenedor.add(BTguardar, constraints);


    JPanel panelBotones = new JPanel();
    panelBotones.setLayout(new GridLayout(1,2));
    panelBotones.add(BTguardar); BTguardar.addActionListener(this);
    panelBotones.add(BTcancelar); BTcancelar.addActionListener(this);

    constraints.gridx=0; constraints.gridy=4; constraints.gridwidth=2; constraints.gridheight=1;
    constraints.weightx=1; constraints.weighty=1; contenedor.add(panelBotones, constraints);


    this.setVisible(true);
    this.setSize(400, 250);
    this.setTitle("Datos del aficionado");
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

}

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource().equals(BTcancelar)){
        this.dispose();
    }
    if(e.getSource().equals(BTguardar)){
        JOptionPane.showMessageDialog(this,"Registro confirmado","Ventana registro", JOptionPane.INFORMATION_MESSAGE);
    }

    }
}
