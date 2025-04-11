package vista;

import java.awt.Font;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controlador.logica_ventana;

public class ventana extends JFrame {

	public JPanel contentPane;
	public JTextField txt_nombres;
	public JTextField txt_telefono;
	public JTextField txt_email;
	public JTextField txt_buscar;
	public JCheckBox chb_favorito;
	public JComboBox cmb_categoria;
	public JButton btn_add;
	public JButton btn_modificar;
	public JButton btn_eliminar;
	public JTable tbl_contactos;
	public DefaultTableModel modeloTabla;

	// Labels para estadísticas
	public JLabel lbl_totalContactos;
	public JLabel lbl_favoritos;
	public JLabel lbl_familia;
	public JLabel lbl_amigos;
	public JLabel lbl_trabajo;
	public JButton btn_exportar;
	public JProgressBar barraProgreso;


	public ventana() {
		setTitle("GESTION DE CONTACTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 1026, 748);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(0, 0, 1010, 710);
		contentPane.add(tabbedPane);

		// Panel Contactos
		JPanel panelContactos = new JPanel();
		panelContactos.setLayout(null);
		tabbedPane.addTab("Contactos", panelContactos);

		JLabel lbl_etiqueta1 = new JLabel("NOMBRES:");
		lbl_etiqueta1.setBounds(25, 41, 89, 13);
		lbl_etiqueta1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelContactos.add(lbl_etiqueta1);

		JLabel lbl_etiqueta2 = new JLabel("TELEFONO:");
		lbl_etiqueta2.setBounds(25, 80, 89, 13);
		lbl_etiqueta2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelContactos.add(lbl_etiqueta2);

		JLabel lbl_etiqueta3 = new JLabel("EMAIL:");
		lbl_etiqueta3.setBounds(25, 122, 89, 13);
		lbl_etiqueta3.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelContactos.add(lbl_etiqueta3);

		JLabel lbl_etiqueta4 = new JLabel("BUSCAR POR NOMBRE:");
		lbl_etiqueta4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_etiqueta4.setBounds(25, 661, 192, 13);
		panelContactos.add(lbl_etiqueta4);

		txt_nombres = new JTextField();
		txt_nombres.setBounds(124, 28, 427, 31);
		txt_nombres.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt_nombres.setColumns(10);
		panelContactos.add(txt_nombres);

		txt_telefono = new JTextField();
		txt_telefono.setBounds(124, 69, 427, 31);
		txt_telefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt_telefono.setColumns(10);
		panelContactos.add(txt_telefono);

		txt_email = new JTextField();
		txt_email.setBounds(124, 110, 427, 31);
		txt_email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt_email.setColumns(10);
		panelContactos.add(txt_email);

		txt_buscar = new JTextField();
		txt_buscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt_buscar.setColumns(10);
		txt_buscar.setBounds(212, 650, 784, 31);
		panelContactos.add(txt_buscar);

		chb_favorito = new JCheckBox("CONTACTO FAVORITO");
		chb_favorito.setBounds(24, 170, 193, 21);
		chb_favorito.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelContactos.add(chb_favorito);

		cmb_categoria = new JComboBox();
		cmb_categoria.setBounds(300, 167, 251, 31);
		panelContactos.add(cmb_categoria);
		String[] categorias = { "Elija una Categoria", "Familia", "Amigos", "Trabajo" };
		for (String categoria : categorias) {
			cmb_categoria.addItem(categoria);
		}

		btn_add = new JButton("AGREGAR");
		btn_add.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_add.setBounds(601, 70, 125, 65);
		panelContactos.add(btn_add);

		btn_modificar = new JButton("MODIFICAR");
		btn_modificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_modificar.setBounds(736, 70, 125, 65);
		panelContactos.add(btn_modificar);

		btn_eliminar = new JButton("ELIMINAR");
		btn_eliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_eliminar.setBounds(871, 69, 125, 65);
		panelContactos.add(btn_eliminar);

		String[] columnas = { "NOMBRE", "TELEFONO", "EMAIL", "CATEGORIA", "FAVORITO" };
		modeloTabla = new DefaultTableModel(null, columnas);
		tbl_contactos = new JTable(modeloTabla);
		tbl_contactos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tbl_contactos.setRowHeight(25);
		JScrollPane scrollPane = new JScrollPane(tbl_contactos);
		scrollPane.setBounds(25, 242, 971, 398);
		panelContactos.add(scrollPane);
		
		barraProgreso = new JProgressBar();
		barraProgreso.setBounds(25, 200, 971, 25);
		barraProgreso.setStringPainted(true);
		panelContactos.add(barraProgreso);

		// Panel Estadísticas
		JPanel panelEstadisticas = new JPanel();
		panelEstadisticas.setLayout(null);
		tabbedPane.addTab("Estadísticas", panelEstadisticas);

		lbl_totalContactos = new JLabel("Total de contactos: ");
		lbl_totalContactos.setBounds(50, 50, 400, 25);
		lbl_totalContactos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelEstadisticas.add(lbl_totalContactos);

		lbl_favoritos = new JLabel("Contactos favoritos: ");
		lbl_favoritos.setBounds(50, 90, 400, 25);
		lbl_favoritos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelEstadisticas.add(lbl_favoritos);

		lbl_familia = new JLabel("Contactos en categoría Familia: ");
		lbl_familia.setBounds(50, 130, 400, 25);
		lbl_familia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelEstadisticas.add(lbl_familia);

		lbl_amigos = new JLabel("Contactos en categoría Amigos: ");
		lbl_amigos.setBounds(50, 170, 400, 25);
		lbl_amigos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelEstadisticas.add(lbl_amigos);

		lbl_trabajo = new JLabel("Contactos en categoría Trabajo: ");
		lbl_trabajo.setBounds(50, 210, 400, 25);
		lbl_trabajo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelEstadisticas.add(lbl_trabajo);
		
		btn_exportar = new JButton("Exportar a CSV");
		btn_exportar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_exportar.setBounds(50, 260, 200, 40);
		panelEstadisticas.add(btn_exportar);

		// Controlador
		logica_ventana lv = new logica_ventana(this);
	}
}