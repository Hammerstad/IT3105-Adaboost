package classifier.decisiontree;


import java.util.LinkedList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicklas
 */
public abstract class Node {   
    protected NodeData data;
    
    public Node(NodeData data) {
        this.data = data;
    }
    public abstract boolean isLeaf();
    public abstract void addChild(Node n, double choice);
    public abstract List<Node> getChildren();
    public abstract String getName();
}
