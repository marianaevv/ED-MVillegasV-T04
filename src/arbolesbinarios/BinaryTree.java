package arbolesbinarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mariana Villegas
 */
public class BinaryTree {

    NodeTree root;
    int height;
    int elements;

    public BinaryTree() {
        this.root = null;
        this.height = -1;
        this.elements = 0;
    }

    public boolean isEmpty() {
        return root == null;

    }

    public void add(int d) {
        NodeTree node = new NodeTree(d);
        if (isEmpty()) {
            root = node;
            height++;
        } else {//Si no está vacio
            this.insertNode(node, this.root);
        }
    }

    public void insertNode(NodeTree node, NodeTree root) {

        if (node.data >= root.data) {
            //Si no tiene elementos a la izquierda
            if (root.right == null) {//Caso Base
                root.right = node;
            } else {//Si tiene un elemento a la izquierda
                //Buscará por la izquierda hasta encontrar un espacio.
                insertNode(node, root.right);
            }
        } else//Si no es mayor que raiz
         if (root.left == null) {//Caso Base
                root.left = node;
            } else {//Si tiene un elemento a la derecha, buscará por la
                //derecha hasta encontrar un espacio
                insertNode(node, root.left);
            }
        this.elements++;
    }

   
    
    public void eNode(int data, NodeTree root) {
        if(root != null) {
            if (root.data == data) {
                  root.data = 0;
                   System.out.println("El nodo ha sido eliminado");

            } else if (data < root.data) {

                eNode(data, root.left);
            } else {
                eNode(data, root.right);
            }
        }else{

            System.out.println("NO se encontro el nodo");
        }
     }

    public NodeTree getRoot() {
        return this.root;
    }

    //Determinar altura
    //Determinar número de elementos
    public void showTreeInorden(NodeTree root) {
        if (root != null) {
            showTreeInorden(root.left);     //recorre subarbol izquierdo           
            System.out.print(root.data + " ");     //mostrar datos del nodo
            showTreeInorden(root.right);   //recorre subarbol derecho
        }
    }

    public void showTreePreorden(NodeTree root) {
        if (root != null) {
            System.out.print(root.data + " ");     //mostrar datos del nodo
            showTreeInorden(root.left);     //recorre subarbol izquierdo          
            showTreeInorden(root.right);   //recorre subarbol derecho
        }
    }

    public void showTreePostorden(NodeTree root) {
        if (root != null) {
            showTreeInorden(root.left);     //recorre subarbol izquierdo           
            showTreeInorden(root.right);   //recorre subarbol derecho
            System.out.print(root.data + " ");     //mostrar datos del nodo
        }
    }
}
/*if (isEmpty()) {
            System.out.println("No hay nodos");
            return false;
        } else if (root.data >= data) {
            //Si no tiene elementos a la izquierda
            root = root.right;
            if (root.data == data) {
                return true;
                
            }
        } else {//Si tiene un elemento a la izquierda
            //Buscará por la izquierda hasta encontrar un espacio.
            root = root.left;
            if (root.data == data) {
                return true;
            }
        }
        if (root.data ){
        return false;
        }*/
