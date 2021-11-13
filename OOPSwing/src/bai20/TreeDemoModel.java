package bai20;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class TreeDemoModel implements TreeModel {

	DefaultTreeModel tree;
	DefaultMutableTreeNode rootNode;

	public TreeDemoModel() {
		super();
		// TODO Auto-generated constructor stub
		rootNode = buildTree("Car&Motor");
		tree = new DefaultTreeModel(rootNode);
	}

	private DefaultMutableTreeNode buildTree(String rootName) {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootName);
		DefaultMutableTreeNode car = new DefaultMutableTreeNode("Car");
		DefaultMutableTreeNode motor = new DefaultMutableTreeNode("Motor");

		root.add(car);
		root.add(motor);

		DefaultMutableTreeNode honda = new DefaultMutableTreeNode("Honda");
		DefaultMutableTreeNode mazda = new DefaultMutableTreeNode("Mazda");
		DefaultMutableTreeNode toyota = new DefaultMutableTreeNode("Toyota");

		car.add(honda);
		car.add(mazda);
		car.add(toyota);

		DefaultMutableTreeNode ducati = new DefaultMutableTreeNode("Ducati");
		DefaultMutableTreeNode suzuki = new DefaultMutableTreeNode("Suzuki");
		DefaultMutableTreeNode yamaha = new DefaultMutableTreeNode("Yamaha");
		DefaultMutableTreeNode harley = new DefaultMutableTreeNode("Harley");

		motor.add(ducati);
		motor.add(suzuki);
		motor.add(yamaha);
		motor.add(harley);

		return root;

	}

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
		return;
	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub

	}

	public DefaultTreeModel getTree() {
		return tree;
	}

	public void setTree(DefaultTreeModel tree) {
		this.tree = tree;
	}

	public DefaultMutableTreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(DefaultMutableTreeNode rootNode) {
		this.rootNode = rootNode;
	}

}
