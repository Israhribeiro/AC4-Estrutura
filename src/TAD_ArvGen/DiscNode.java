package TAD_ArvGen;

import position.Position;
import position.PositionList;

public class DiscNode<E> implements TreePosition<E>{
    private E element;
    private TreePosition<E> parent;
    private PositionList<Position<E>> children;
    private String name;
    private int kbytes;

    public DiscNode() {}

    public DiscNode(E element, TreePosition<E> parent, PositionList<Position<E>> children) {
        setElement(element);
        setParent(parent);
        setChildren(children);
    }

    public E element() { return element; }

    public void setElement(E o) { element = o; }

    public E getElement() { return element; }

    public PositionList<Position<E>> getChildren() { return children; }

    public void setChildren(PositionList<Position<E>> c) { children = c; }

    public TreePosition<E> getParent() { return parent; }

    public void setParent(TreePosition<E> v) { parent = v; }

    public int getKbytes() { return kbytes; }

    public void setKbytes(int kb) { kbytes = kb; }

    public String getName() { return name; }

    public void setName(String nm) { name = nm; }
}
