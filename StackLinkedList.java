package Stack;

public class StackLinkedList {
	Node head;
	Node tail;
	int size;

	public void push(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = tail = node;
		} else {
			Node n = head;
			head = node;
			head.next = n;
			n = head;
		}
		size++;
		System.out.println(data + " Pushed to the list Successfully!");
	}

	public void display() {
		Node temp;
		temp = head;
		if (head == null) {
			System.out.println("Stack is Empty");
		} else if (head == tail) {
			System.out.println("[" + head.data + "]");
		} else {
			System.out.print("Stacked List: [");
			while (temp.next != null) {
				System.out.print(temp.data + ",");
				temp = temp.next;
			}
			System.out.println(temp.data + "]");
		}
	}

	public void pop() {
		if (head != null) {
			System.out.println(head.data + " Deleted Successfully");
			head = head.next;
			size--;

		} else {
			System.out.println("Stack is Empty!");
		}
	}

	public void search(int toSearch) {
		Node temp = head;
		int index = size - 1;
		if (size == 0) {
			System.out.println("Empty Stack");
		} else {
			while (temp.next != null) {
				if (temp.data == toSearch) {
					System.out.println("The number " + toSearch + " has been found at index " + index + ".");
					return;
				} else {
					temp = temp.next;
					index--;
				}

			}
			if (temp.data == toSearch) {
				System.out.println("The number " + toSearch + " has been found at index " + index + ".");

			} else {
				System.out.println("Number not found in the stack");
			}
		}
	}

	public int getSize() {
		return size;
	}
}
