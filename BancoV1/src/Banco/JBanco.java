package Banco;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class JBanco extends JFrame {

	private JPanel contentPane;
	private JTextField nomeFuncionario;
	private JTextField idadeFuncionario;
	private JTextField guiche;
	private final Action action = new SwingAction();
	private Atendimento modelo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JBanco frame = new JBanco();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JBanco() {
		modelo = new Atendimento();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nomeFuncionario = new JTextField();
		nomeFuncionario.setBounds(144, 53, 86, 20);
		contentPane.add(nomeFuncionario);
		nomeFuncionario.setColumns(10);
		
		idadeFuncionario = new JTextField();
		idadeFuncionario.setBounds(144, 84, 86, 20);
		contentPane.add(idadeFuncionario);
		idadeFuncionario.setColumns(10);
		
		guiche = new JTextField();
		guiche.setBounds(144, 115, 86, 20);
		contentPane.add(guiche);
		guiche.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setAction(action);
		btnCadastrar.setBounds(141, 192, 118, 28);
		contentPane.add(btnCadastrar);
		
		JLabel lblNomeFuncionrio = new JLabel("Nome Funcion\u00E1rio:");
		lblNomeFuncionrio.setBounds(23, 53, 111, 20);
		contentPane.add(lblNomeFuncionrio);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(23, 87, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblGuich = new JLabel("Guich\u00EA:");
		lblGuich.setBounds(23, 118, 46, 14);
		contentPane.add(lblGuich);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 20);
		contentPane.add(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cadastro Funcion\u00E1rio");
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cadastro Cliente");
		menuBar.add(mntmNewMenuItem_1);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Cadastrar");
			putValue(SHORT_DESCRIPTION, "Cadastra o novo funcionário");
		}
		public void actionPerformed(ActionEvent e) {
			String nome = nomeFuncionario.getText();
			String idade = idadeFuncionario.getText();
			String guic = guiche.getText();
			int idad = Integer.parseInt(idade);
			int gui = Integer.parseInt(guic);
			Funcionario func = new Funcionario(nome, idad, guic, 0);
			modelo.adicionaFunc(func);
			System.out.println(modelo.mostraLista());
		}
	}
}
