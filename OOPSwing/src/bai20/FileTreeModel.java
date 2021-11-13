package bai20;

import java.io.File;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class FileTreeModel implements TreeModel {
	DefaultTreeModel tree;
	DefaultMutableTreeNode rootNode;

	public FileTreeModel(String rootDir) {
		// rootNode = new DefaultMutableTreeNode("root", true);
		// getList(rootNode, new File(rootDir));
		rootNode = new DefaultMutableTreeNode(new File(rootDir));
		buildDirectoryTree(rootNode, rootDir);

		tree = new DefaultTreeModel(rootNode);

	}

	public void buildDirectoryTree(DefaultMutableTreeNode node, String rootDir) {
		File curDir = new File(rootDir);
		if (!curDir.isDirectory()) {
			return;
		}
		File[] list = curDir.listFiles();
		for (int i = 0; i < list.length; i++) {
			DefaultMutableTreeNode child = new DefaultMutableTreeNode(list[i]);
			node.add(child);
			buildDirectoryTree(child, rootDir + File.separator + list[i].getName());
		}

	}

//	public void getList(DefaultMutableTreeNode node, File f) {
//		if (!f.isDirectory()) {
//			// We keep only JAVA source file for display in this HowTo
//			if (f.getName().endsWith("java")) {
//				System.out.println("FILE  -  " + f.getName());
//				DefaultMutableTreeNode child = new DefaultMutableTreeNode(f);
//				node.add(child);
//			}
//		} else {
//			System.out.println("DIRECTORY  -  " + f.getName());
//			DefaultMutableTreeNode child = new DefaultMutableTreeNode(f);
//			node.add(child);
//			File fList[] = f.listFiles();
//			for (int i = 0; i < fList.length; i++)
//				getList(child, fList[i]);
//		}
//	}

	@Override
	public Object getRoot() {
		// TODO Auto-generated method stub
		return this.rootNode;
	}

	@Override
	public Object getChild(Object parent, int index) {
		// TODO Auto-generated method stub
		return tree.getChild(parent, index);
	}

	@Override
	public int getChildCount(Object parent) {
		// TODO Auto-generated method stub
		return tree.getChildCount(parent);
	}

	@Override
	public boolean isLeaf(Object node) {
		// TODO Auto-generated method stub
		return tree.isLeaf(node);
	}

	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		// TODO Auto-generated method stub
		tree.valueForPathChanged(path, newValue);
	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		// TODO Auto-generated method stub
		return tree.getIndexOfChild(parent, child);
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		tree.addTreeModelListener(l);
	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		tree.removeTreeModelListener(l);
	}

}
