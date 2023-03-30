package main;
import linkedlist.*;
import genericlinkedlist.*;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		//generic linked list and node with Integer type
		GenericLinkedList<Integer> myGList1=new GenericLinkedList<Integer>();
		
		GenericNode<Integer> aGNode1=new GenericNode<Integer>();
		aGNode1.setData(1);
		myGList1.addNode(aGNode1);
		aGNode1 = new GenericNode<Integer>();
		aGNode1.setData(2);
		myGList1.addNode(aGNode1);
		
		GenericNode<Integer> tempgnode1=myGList1.getList();
		do 
		{
			System.out.println(tempgnode1.getData());
			tempgnode1=tempgnode1.getNextNode();
		} while (tempgnode1!=null);
		
		//generic linked list and node with Double type
		GenericLinkedList<Double> myGList2=new GenericLinkedList<Double>();

		GenericNode<Double> aGNode2=new GenericNode<Double>();
		aGNode2.setData(1.0);
		myGList2.addNode(aGNode2);
		aGNode2 = new GenericNode<Double>();
		aGNode2.setData(2.0);
		myGList2.addNode(aGNode2);

		GenericNode<Double> tempgnode2=myGList2.getList();
		do 
		{
			System.out.println(tempgnode2.getData());
			tempgnode2=tempgnode2.getNextNode();
		} while (tempgnode2!=null);
		
		//generic linked list and node with String type
		GenericLinkedList<String> myGList3=new GenericLinkedList<String>();

		GenericNode<String> aGNode3=new GenericNode<String>();
		aGNode3.setData("element 1");
		myGList3.addNode(aGNode3);
		aGNode3 = new GenericNode<String>();
		aGNode3.setData("element 2");
		myGList3.addNode(aGNode3);

		GenericNode<String> tempgnode3=myGList3.getList();
		do 
		{
			System.out.println(tempgnode3.getData());
			tempgnode3=tempgnode3.getNextNode();
		} while (tempgnode3!=null);

	}//end main

}//end class
