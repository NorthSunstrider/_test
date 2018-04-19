package com.northsunstrider.collection;

/**
 * @Description: 手动实现单向链表反转
 * @author: North
 * @date: 2018年4月16日 下午3:19:15
 */
public class NodeTest {

	/**
	 * @Description main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node("1", null);
		Node node2 = new Node("2", null);
		head.setNext(node2);
		Node node3 = new Node("3", null);
		node2.setNext(node3);

		head = reverse(head);

		System.out.println((String) head.getObject());

	}

	/**
	 * @Description 反转的循环实现
	 * @param head
	 * @return
	 */
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

	/**
	 * @Description 反转的递归实现
	 * @param node
	 * @return
	 */
	public static Node reverse2(Node node) {

		if (node == null || node.getNext() == null) {
			return node;
		}
		Node temp = reverse2(node.getNext());
		node.getNext().setNext(node);
		node.setNext(null);
		return temp;
	}

}

class Node {
	private Object object;
	private Node next;

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
