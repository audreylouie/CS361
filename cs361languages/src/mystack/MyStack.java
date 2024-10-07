/**
 * 
 */
package mystack;

/**
 * @author Audrey Louie 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		T value = theStack.val;
		theStack = theStack.next;
		return value;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> intStack = new MyStack<Integer>();
		// Push 1 and 2
		intStack.push(1);
		intStack.push(2);
		// Pop
		intStack.pop();
		// Push 5
		intStack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> personStack = new MyStack<Person>();
		// Push a person p1 with your name
		personStack.push(new Person("Audrey", "Louie"));
		// Push a person p2 with my name
		personStack.push(new Person("Christelle", "Scharff"));
	}

}
