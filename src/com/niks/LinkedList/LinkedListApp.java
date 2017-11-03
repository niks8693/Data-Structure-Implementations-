package com.niks.LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.addNode(10);
		list.addNode(15);
		list.addNode(20);
		list.popElement();
		
		list.printNodes();
	}

}
