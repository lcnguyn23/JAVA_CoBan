package bai20;

import java.awt.Color;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class SimpleTreee implements Runnable {

	private DefaultMutableTreeNode root;

	private DefaultTreeModel treeModel;

	private JTree tree;

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public void run() {
		JFrame frame = new JFrame("File browser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		File fileRoot = new File("D:\\DD");
		root = new DefaultMutableTreeNode(new FileNode(fileRoot));
		treeModel = new DefaultTreeModel(root);
		frame.getContentPane().setLayout(null);

		tree = new JTree(treeModel);

		tree.setShowsRootHandles(true);
		JScrollPane scrollPane = new JScrollPane(tree);
		scrollPane.setBorder(new LineBorder(Color.BLACK));
		scrollPane.setBounds(0, 0, 259, 530);

		frame.getContentPane().add(scrollPane);

		JTextArea txtketqua = new JTextArea();
		txtketqua.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtketqua.setBackground(new Color(255, 255, 255));
		txtketqua.setBounds(269, 0, 478, 530);
		frame.getContentPane().add(txtketqua);
		frame.setLocationByPlatform(true);
		frame.setSize(763, 569);
		frame.setVisible(true);

		tree.addTreeSelectionListener(new TreeSelectionListener() {
			@Override
			public void valueChanged(TreeSelectionEvent e) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				if (node == null) {
					return;
				}
				File nodeInfor = (File) node.getUserObject();
				FileAndDerectory fo = new FileAndDerectory();
				File[] list = fo.getDerectoryContent(nodeInfor.getPath());
				txtketqua.setText(fo.displayContent(list));
//				DefaultMutableTreeNode dmtn = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
//				FileNode fileNode = (FileNode) dmtn.getUserObject();
//				File file = fileNode.getFile();
//				File directoryPath = new File("D:\\DD");
//				// List of all files and directories
//				String contents[] = directoryPath.list();
//				for (int i = 0; i < contents.length; i++) {
//					txtketqua.setText(contents[i].toString());
//				}
				// txtketqua.setText(file.getPath().toString());

			}
		});

		CreateChildNodes ccn = new CreateChildNodes(fileRoot, root);
		new Thread(ccn).start();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new SimpleTreee());
	}

	public class CreateChildNodes implements Runnable {

		private DefaultMutableTreeNode root;

		private File fileRoot;

		public CreateChildNodes(File fileRoot, DefaultMutableTreeNode root) {
			this.fileRoot = fileRoot;
			this.root = root;
		}

		@Override
		public void run() {
			createChildren(fileRoot, root);
		}

		private void createChildren(File fileRoot, DefaultMutableTreeNode node) {
			File[] files = fileRoot.listFiles();
			if (files == null)
				return;

			for (File file : files) {
				DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(new FileNode(file));
				node.add(childNode);
				if (file.isDirectory()) {
					createChildren(file, childNode);
				}
			}
		}

	}

	public class FileNode {

		private File file;

		public FileNode(File file) {
			this.file = file;
		}

		public File getFile() {
			return file;
		}

		@Override
		public String toString() {
			String name = file.getName();
			if (name.equals("")) {
				return file.getAbsolutePath();
			}
			return name;
		}
	}
}
