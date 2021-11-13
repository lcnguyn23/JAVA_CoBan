package bai20;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeDemo extends JFrame {

	private JPanel contentPane;
	FileTreeModel tree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					TreeDemo frame = new TreeDemo();
					frame.setLocationRelativeTo(null);
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
	public TreeDemo() {
		setTitle("File Tree Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 704, 532);
		contentPane.add(splitPane);

		tree = new FileTreeModel("D:\\DD");

		JTextArea txtArea = new JTextArea();
		splitPane.setRightComponent(txtArea);

		JTree jTree = new JTree();
		splitPane.setLeftComponent(jTree);
		jTree.addTreeSelectionListener(new TreeSelectionListener() {
			@Override
			public void valueChanged(TreeSelectionEvent e) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
				File nodeInfor = (File) node.getUserObject();
				FileAndDerectory fo = new FileAndDerectory();
				File[] list = fo.getDerectoryContent(nodeInfor.getPath());
				txtArea.setText(fo.displayContent(list));
			}
		});

		jTree.setModel(tree);

//		Toolkit toolkit = getToolkit();
//		Dimension size = toolkit.getScreenSize();
//		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

	}
}
