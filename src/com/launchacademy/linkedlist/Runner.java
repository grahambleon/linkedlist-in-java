package com.launchacademy.linkedlist;

public class Runner {

  public static void main(String[] args) {
    Node theNode = new Node("The");
    Node orangeNode = new Node("Orange");
    Node catNode = new Node("Cat");
//    Node thereNode = new Node("There");
    
    LinkedList sentence = new LinkedList(theNode);
    theNode.next = orangeNode;
    orangeNode.next = catNode;
//    sentence.pushNode(thereNode);
    
    System.out.println(sentence.toString());
    
    //output "The Orange Furry Cat"  
    Node furryNode = new Node("Furry");
    sentence.insertAfter(orangeNode, furryNode);
//    sentence.appendNode(new Node("I'm"));
    System.out.println(sentence.toString());
    
    sentence.deleteNode(catNode);
    sentence.appendNode(new Node("Kitten"));
    System.out.println(sentence.toString());
    
    System.out.println(sentence.length());
    
//    //output "The Orange Furry Dog"
//    sentence.deleteNode(catNode);
//    sentence.appendNode(new Node("Dog"));
//    System.out.println(sentence.toString());
//    
//    
//    //output "An Orange Furry Dog"
//    sentence.deleteNode(theNode);
//    sentence.pushNode(new Node("An"));
//    System.out.println(sentence.toString());
  }
}
