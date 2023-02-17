class MinStack {
  Stack<Integer> stack;
  Stack<Integer> minStack;

  public MinStack() {
      stack = new Stack<>();
      minStack = new Stack<>();
  }

  void push(int val) {
      stack.push(val);

      if (minStack.empty() || val <= minStack.peek()) {
          minStack.push(val);
      } else {
          minStack.push(minStack.peek());
      }
  }

  void pop() {
    stack.pop();
    minStack.pop();   
  }

  int top() {
      return stack.peek();
  }

  int getMin() {
      return minStack.peek();
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */