package com.niks.LinkedList;

public class LinkedList<T extends Comparable<T>> implements Cloneable {
	private Node<T> head=null;
	public LinkedList(){
		
	}
	
	//append a new node at the end of LinkedList
	
	public void addNode(T data){
		if(head==null){
			head=new Node<T>(data);
			//if there are no nodes in the list then make the head point to this node
		}
		//if there are multiple nodes in the list then traverse till the end
		//node whose next pointer points to null is the last node
		//set the curr last node point to the new node
		//new node's next pointer will point to null by default
		else{
			Node<T> curr=head;
			while(curr.getNext()!=null){
				curr=curr.getNext();
			}
			curr.setNext(new Node<T>(data));
		}
	}
	
	public void printNodes(){
		if(head==null){
			System.out.println("The Linked List is empty");
		}
		else{
			Node<T> curr=head;
			int i=1;
			while(curr!=null){
				System.out.println("Node<T> number is "+i+" , the value it stores is "+curr.toString());
				curr=curr.getNext();
				i++;
			}
		}
	}
	
	public int countNodes(){
		if(head==null){
			System.out.println("The Linked List is empty");
			return 0;
		}
		else{
			Node<T> curr=head;
			int count=0;
			while(curr!=null){
				curr=curr.getNext();
				count++;
			}
			return count;
		}
	}
	
	public T popElement(){
		if(head!=null){
			T topElement=head.getData();
			head=head.getNext();
			return topElement;
		}
		return null;
	}
	
	

}
