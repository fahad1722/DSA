class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operators = "+-*/";
        for (String op : tokens) {
            if (operators.contains(op)) {
                int b = stack.pop();
                int a = stack.pop();
                switch (op) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            } 
            else {
                stack.push(Integer.parseInt(op));
            }
        }

        return stack.pop();
    }
}