package com.launchacademy.linkedlist;

public class LinkedList {
  @SuppressWarnings("unused")
  private Node head;

  LinkedList(Node head) {
    this.head = head;
  }
  
  public String toString() {
    String sentence = "";
    Node node = head;
    while(node != null) {
      sentence += node.getWord() + " ";
      node = node.next;
    }
    return sentence.trim();
  }
  
  public void appendNode(Node nodeToAppend) {
    head.next = nodeToAppend;
  }
  
  public void insertAfter(Node prevNode, Node newNode) {
    newNode.next = prevNode.next;
    prevNode.next = newNode;
  }
  
  public Node deleteNode(Node nodeToDelete) {
	Node node = head;
    while(node != null) {
	  if (node.next == nodeToDelete) {
	    nodeToDelete = node.next;
	    node.next = nodeToDelete.next;
	    nodeToDelete.next = null;
	  } else {
	   	node = node.next;
	  }
    }
    //Note: be sure to handle what happens if we delete the head
    //I'm pretty sure this covers that requirement but I need to double check.
	return nodeToDelete;
  }
  
  public void pushNode(Node nodeToPush) {
	  nodeToPush.next = head;
	  this.head = nodeToPush;
  }
  
  public int length() {
	int length = 0;
	Node node = head;
    while(node != null) {
      length += 1;
      node = node.next;
    }
    return length;
  }
  
  //Extra credit:
  public void deleteWordsStartingWith(char letter) {
    //eliminate all words starting with the specified letter
  }
  
  public void makeUnique() {
    //eliminate all duplicate words in the list
  }
}
