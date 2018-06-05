package com.launchacademy.linkedlist;

public class LinkedList {

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
	Node node = head;
    while(node != null) {
	  if (node.next == null) {
	    node.next = nodeToAppend;
	    break;
	  } else {
	    node = node.next;
	  }
    }
  }
  
  public void insertAfter(Node prevNode, Node newNode) {
    newNode.next = prevNode.next;
    prevNode.next = newNode;
  }
  
  public Node deleteNode(Node nodeToDelete) {
	Node node = head;
    while(node != null) {
      if (head == nodeToDelete) {
        this.head = head.next;
      } else if (node.next == nodeToDelete) {
	    node.next = nodeToDelete.next;
	    nodeToDelete.next = null;
	  } else {
	   	node = node.next;
	  }
    }
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
  
}
