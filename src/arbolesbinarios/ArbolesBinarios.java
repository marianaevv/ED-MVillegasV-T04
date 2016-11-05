/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

/**
 *
 * @author Mariana Villegas
 */
public class ArbolesBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        BinaryTree b = new BinaryTree();

        b.add(40);
        b.add(20);
        b.add(10);
        b.add(30);
        b.add(60);
        b.add(50);
        b.add(70);

        //   b.insertNode(4);
        System.out.println("INORDEN");
        b.showTreeInorden(b.getRoot());
        System.out.println("");
        System.out.println("POSTORDEN");
        b.showTreePostorden(b.getRoot());
        System.out.println("");
        System.out.println("PREORDEN");
        b.showTreePreorden(b.getRoot());
        System.out.println("");
     
       b.eNode(30, b.root);
        System.out.println("");
        b.eNode(4, b.getRoot());
        b.showTreeInorden(b.getRoot());
      
    }

}
