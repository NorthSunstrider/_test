package com.northsunstrider.collection;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月16日 下午3:19:15
 */
public class NodeTest {

	/**
	 * @Description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node("1", null);
		Node node2 = new Node("2", null);
		head.setNext(node2);
		Node node3 = new Node("3", null);
		node2.setNext(node3);

		head = aaaa(head);

		System.out.println((String) head.getObject());

	}

	public static Node reverse(Node head) {
		if (head == null)
			return head;

		Node pre = head;
		Node cur = head.getNext();
		Node temp;
		while (cur != null) {
			temp = cur.getNext();
			cur.setNext(pre);

			pre = cur;
			cur = temp;
		}
		head.setNext(null);

		return pre;

	}

	public static Node reverse2(Node node) {

		if (node == null || node.getNext() == null) {
			return node;
		}
		Node temp = reverse2(node.getNext());
		node.getNext().setNext(node);
		node.setNext(null);
		return temp;
	}

	public static Node aaaa(Node node) {
		if (node.getNext() == null)
			return node;

		Node reHead = aaaa(node.getNext());
		node.getNext().setNext(node);
		node.setNext(null);
		return reHead;

	}

}

class Node {
	Object object;
	Node next;

	public Node(Object object, Node next) {
		super();
		this.object = object;
		this.next = next;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (String) this.object;
	}

}
