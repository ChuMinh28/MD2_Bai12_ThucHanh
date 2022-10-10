package thuchanh4;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {

    protected TreeNode<E> root;
    protected int size = 0;

    public BST(){
    }
    public BST(E[] object){
        for (int i = 0; i < object.length; i++) {
            insert(object[i]);
        }
    }
    @Override
    public boolean insert(Object o) {
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public boolean insert(E e){
        if (root == null){
            root = createNewNode(e);
        }else {
            TreeNode<E> parent = null;
            TreeNode<E> current = null;
            while (current!=null){
                if (e.compareTo(current.element)<0){
                    parent=current;
                    current=current.left;
                } else if (e.compareTo(current.element)>0) {
                    parent=current;
                    current=current.right;
                }else {
                    return false;
                }
                if (e.compareTo(parent.element)<0){
                    parent.left=createNewNode;
                }else {
                    parent.right=createNewNode;
                }
                size++;
            }
        }
        return true;
    }
}
