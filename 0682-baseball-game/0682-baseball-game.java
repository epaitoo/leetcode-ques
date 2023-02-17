class Solution {
    public int calPoints(String[] operations) {
        int output =0;
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int val = stack.get(stack.size()-2) + stack.peek();
                stack.push(val);
            } else if(op.equals("D")) {
                stack.push(stack.peek()*2);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        if (stack.empty()) return 0;

        for (Integer val: stack) {
            output += val;
        }

        return output;

    }
}