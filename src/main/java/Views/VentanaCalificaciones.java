package Views;

import java.awt.*;
import java.awt.event.*;

public class VentanaCalificaciones extends Frame implements ActionListener {

    private TextField tfCedula;
    private TextField tfNombre;
    private TextField tfApellido;

    private Button btnAgregar;
    private Button btnModificar;
    private Button btnEliminar;
    private Button btnGuardar;
    private Button btnCancelar;

    public VentanaCalificaciones() {
        setSize(400, 250);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        Panel panelSuperior = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnAgregar = new Button("Agregar");
        btnModificar = new Button("Modificar");
        btnEliminar = new Button("Eliminar");

        panelSuperior.add(btnAgregar);
        panelSuperior.add(btnModificar);
        panelSuperior.add(btnEliminar);

        add(panelSuperior, BorderLayout.NORTH);

        Panel panelCentral = new Panel(new GridLayout(3, 2, 5, 5));

        Label lblCedula = new Label("Cédula:");
        tfCedula = new TextField(20);

        Label lblNombre = new Label("Nombre:");
        tfNombre = new TextField(20);

        Label lblApellido = new Label("Apellido:");
        tfApellido = new TextField(20);

        panelCentral.add(lblCedula);
        panelCentral.add(tfCedula);
        panelCentral.add(lblNombre);
        panelCentral.add(tfNombre);
        panelCentral.add(lblApellido);
        panelCentral.add(tfApellido);

        Panel panelCentroContainer = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelCentroContainer.add(panelCentral);

        add(panelCentroContainer, BorderLayout.CENTER);


        Panel panelInferior = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnGuardar = new Button("Guardar");
        btnCancelar = new Button("Cancelar");
        btnGuardar.addActionListener(this);
        btnCancelar.addActionListener(e -> {
            tfCedula.setText("");
            tfNombre.setText("");
            tfApellido.setText("");
        });

        panelInferior.add(btnGuardar);
        panelInferior.add(btnCancelar);

        add(panelInferior, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGuardar) {
            String cedula = tfCedula.getText().trim();
            String nombre = tfNombre.getText().trim();
            String apellido = tfApellido.getText().trim();

            System.out.println("=== Datos Ingresados ===");
            System.out.println("Cédula:  " + cedula);
            System.out.println("Nombre:  " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("========================");
        }
    }

    public static void main(String[] args) {
        new VentanaCalificaciones();
    }
}

