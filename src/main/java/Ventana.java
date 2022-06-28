import java.awt .*;
import javax.swing .*;
import java.awt.event .*;
import javax.swing.text.InternationalFormatter;

public class Ventana extends JFrame implements ActionListener {
    JButton boton1;
    JButton boton;

    protected Ventana(String nombre, int largoX, int largoY) {
        super(nombre);
        super.setVisible(true);
        super.setDefaultCloseOperation(3);
        super.setSize(largoX, largoY);
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        this.setLayout(null);
        //this.fuenteTitulo = new Font("Calibri", 3, 20);
        //this.fuenteTexto = new Font("Calibri", 1, 20);
    }

    public Ventana() {
        Pestaña();
    }


    protected void generarJLabelEncabezado(JLabel etiqueta, String texto, int posicionX, int posicionY, int
            largoX, int largoY) {
        etiqueta = new JLabel(texto);
        etiqueta.setBounds(posicionX, posicionY, largoX, largoY);
        //label.setFont(this.fuenteTitulo);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(etiqueta);
    }

    protected JButton generarBoton(String texto, int posicionX, int posicionY, int largoX, int largoY) {
        boton = new JButton(texto);
        boton.setBounds(posicionX, posicionY, largoX, largoY);
        //boton.setFont(this.fuenteTexto);
        this.add(boton);
        boton.addActionListener(this);
        return boton;
    }

    protected void generarJLabel(JLabel label, String texto, int posicionX, int posicionY, int largoX, int
            largoY) {
        label = new JLabel(texto);
        label.setBounds(posicionX, posicionY, largoX, largoY);
        //label.setFont(this.fuenteTexto);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(label);
    }

    //Genera campo de texto con un formato en específico
    protected JFormattedTextField generarJFormattedTextField(InternationalFormatter formato, int
            posicionX, int posicionY, int largoX, int largoY) {
        JFormattedTextField textField = new JFormattedTextField(formato);
        textField.setBounds(posicionX, posicionY, largoX, largoY);
        return textField;
    }

    protected InternationalFormatter generarFormato(int minimo) {
        InternationalFormatter formato = new InternationalFormatter();
        formato.setMinimum(minimo);

        return formato;
    }

    protected InternationalFormatter generarFormato(int minimo, int maximo) {
        InternationalFormatter formato = new InternationalFormatter();
        formato.setMinimum((minimo));
        formato.setMaximum((maximo));
        return formato;
    }

    protected JTextField generarJTextField(int posicionX, int posicionY, int largoX, int largoY) {
        JTextField textField = new JTextField("Wenas", 20);
        textField.setBounds(posicionX, posicionY, largoX, largoY);
        add(textField);
        return textField;
    }

    protected JRadioButton generarJRadioButton(String texto, int posicionX, int posicionY, int largoX, int
            largoY) {
        JRadioButton boton = new JRadioButton(texto);
        boton.setBounds(posicionX, posicionY, largoX, largoY);
        return boton;
    }

    protected JComboBox generarListaDesplegable(Object[] datosLista, int posicionX, int posicionY, int
            largoX, int largoY) {
        datosLista = ColorVehiculo.values();
        JComboBox lista = new JComboBox(datosLista);
        lista.setBounds(posicionX, posicionY, largoX, largoY);
        return lista;
    }

    public void Pestaña() {
        Ventana Principal = new Ventana("Automotra", 500, 700);
        Principal.setVisible(true);
        Principal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Principal.generarJLabelEncabezado(null, "Inicio", 10, 10, 500, 30);
        Principal.generarBoton("Cliente",100,100,100,40);

    }
    public void Cliente(){

    }

    public void Etiqeta() {
        generarJLabel(null, "Inicio", 100, 10, 500, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            Ventana v2 = new Ventana();
            v2.setSize(500,700);
            v2.setVisible(true);
            v2.setLayout(null);
            v2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JLabel etiqueta = new JLabel();
            etiqueta.setText("Usuario");
            etiqueta.setBounds(10,100,100,40);
            v2.add(etiqueta);
            JTextField cajon= new JTextField();
            cajon.setBounds(100,110,100,20);
            v2.add(cajon);
        }
    }
}
