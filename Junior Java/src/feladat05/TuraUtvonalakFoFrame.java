package feladat05;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TuraUtvonalakFoFrame {

	private JFrame foFrame;
	private DefaultListModel<Tura> listModel;
	
	private List<Tura> turak;
	private JList list;
	private JTextField txtMegnevezes;
	private JSpinner spnSzintEmelkedes;
	private JSpinner spnHossz;

	private ABKezeloTuraUtvonalak dbMotor;
	
	public TuraUtvonalakFoFrame() {
		initialize();
		
		try {
			
			String connectionURL = "jdbc:mysql://localhost:3306/turautvonalak?autoReconnect=true&useSSL=false";
			dbMotor = new ABKezeloTuraUtvonalak(connectionURL,"root","Ruander2000");
			
			dbMotor.csatlakozas();
			turak = dbMotor.turaLekerdezes();
			dbMotor.bontas();
			
			listaFeltoltes();
			
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(foFrame, e.getMessage(),"Hiba",JOptionPane.ERROR_MESSAGE);
			
		}
	}

	
	
	public void listaFeltoltes() {
		
		listModel = new DefaultListModel<Tura>();
		list.setModel(listModel);
		for (Tura tura : turak) {
			
			listModel.addElement(tura);
			
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		foFrame = new JFrame();
		foFrame.setTitle("Túraútvonalak");
		foFrame.setBounds(100, 100, 850, 385);
		foFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		foFrame.getContentPane().setLayout(null);
		
		list = new JList();
		list.setBounds(417, 39, 409, 242);
		foFrame.getContentPane().add(list);
		
		turak = new ArrayList<Tura>();
		listModel = new DefaultListModel<Tura>();
		list.setModel(listModel);
		
		JLabel lblMegnevezes = new JLabel("Túra megnevezése:");
		lblMegnevezes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMegnevezes.setBounds(39, 64, 145, 33);
		foFrame.getContentPane().add(lblMegnevezes);
		
		JLabel lblHossz = new JLabel("Túra hossza (km):");
		lblHossz.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHossz.setBounds(39, 135, 145, 33);
		foFrame.getContentPane().add(lblHossz);
		
		JLabel lblSzintEmelkedes = new JLabel("Szintemelkedés (m):");
		lblSzintEmelkedes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSzintEmelkedes.setBounds(39, 217, 145, 33);
		foFrame.getContentPane().add(lblSzintEmelkedes);
		
		txtMegnevezes = new JTextField();
		txtMegnevezes.setBounds(194, 72, 213, 19);
		foFrame.getContentPane().add(txtMegnevezes);
		txtMegnevezes.setColumns(10);
		
		spnSzintEmelkedes = new JSpinner();
		spnSzintEmelkedes.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spnSzintEmelkedes.setBounds(193, 225, 214, 20);
		foFrame.getContentPane().add(spnSzintEmelkedes);
		
		JButton btnTuraFelvitel = new JButton("Túra mentése");
		btnTuraFelvitel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ujAdat();
				
			}
		});
		btnTuraFelvitel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTuraFelvitel.setBounds(154, 290, 124, 33);
		foFrame.getContentPane().add(btnTuraFelvitel);
		
		
		spnHossz = new JSpinner();
		spnHossz.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spnHossz.setBounds(194, 143, 214, 20);
		foFrame.getContentPane().add(spnHossz);
		
		
	}



	public void ujAdat() {
		
		// TODO példányosítás, adatszerkezetbe töltés, megjelenítés, adatbázisba szinkronizálás
		
	}

	public JFrame getFoFrame() {
		return foFrame;
	}
}
