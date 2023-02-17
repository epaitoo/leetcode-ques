class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();

       for (int i=0; i < s.length(); i++) {
           if (s.charAt(i) == '(') {
               stack.push('(');
           } else if (s.charAt(i) == ')') {
               if (!stack.empty() && stack.peek() == '(') {
                   stack.pop();
               } else {
                   return false;
               }
           } else if (s.charAt(i) == '[') {
               stack.push('[');
           } else if (s.charAt(i) == ']') {
               if (!stack.empty() && stack.peek() == '[') {
                   stack.pop();
               } else {
                   return false;
               }
           } else if (s.charAt(i) == '{') {
               stack.push('{');
           } else if (s.charAt(i) == '}') {
               if (!stack.empty() && stack.peek() == '{') {
                    stack.pop();
               } else {
                   return false;
               }
           }
       }
       return stack.empty();
    }
}