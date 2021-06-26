package DsAlgo;

import java.util.Stack;

public class StackProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer>stack = new Stack<>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack,2);
		stack_search(stack,6);

	}

	private static void stack_peek(Stack<Integer> stack) {
		Integer ele = (Integer)stack.peek();
		System.out.println("Element on stack top: "+ ele);
		
	}

	private static void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop");
		for(int i=0;i<3;i++) {
			Integer y = (Integer)stack.pop();
			System.out.println(y);
		}
		
	}

	private static void stack_search(Stack<Integer> stack, int element) {
		Integer pos = (Integer)stack.search(element);
		if(pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element at pos : "+ pos);
	}

	private static void stack_push(Stack<Integer> stack) {
		
		System.out.println("Push");
		for(int i=0;i<7;i++) {
			stack.push(i);
			System.out.println("Element pushed is : " + i);
		}
		
	}

}
