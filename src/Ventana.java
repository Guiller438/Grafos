import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JCheckBox conPesosCheckBox;
    private JCheckBox direccionadoCheckBox;
    private JButton crearButton;
    private JButton quemarDatosButton;
    private JTextField txtvertice;
    private JButton insertarButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField1;
    private JButton insertarButton1;
    private JButton mostrarButton;
    private JComboBox comboBox3;
    private JButton DFSButton;
    private JButton BFSButton;
    private JButton dijkstraButton;
    private JTextArea areagrafos;


    public Ventana() {
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(conPesosCheckBox.isSelected() && direccionadoCheckBox.isSelected()){
                    Grafos grafo = new Grafos(true, true);
                    JOptionPane.showMessageDialog(null, "Grafo creado con exito");
                }
                else if(conPesosCheckBox.isSelected() && !direccionadoCheckBox.isSelected()){
                    Grafos grafo = new Grafos(false, true);
                    JOptionPane.showMessageDialog(null, "Grafo creado con exito");
                }
                else if(!conPesosCheckBox.isSelected() && direccionadoCheckBox.isSelected()){
                    Grafos grafo = new Grafos(true, false);
                    JOptionPane.showMessageDialog(null, "Grafo creado con exito");
                }
                else if(!conPesosCheckBox.isSelected() && !direccionadoCheckBox.isSelected()){
                    Grafos grafo = new Grafos(false, false);
                    JOptionPane.showMessageDialog(null, "Grafo creado con exito");
                }
            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //imprimir los grafos
                

            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
