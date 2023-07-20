class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid:asteroids){
            if(stack.isEmpty() || asteroid > 0){
                stack.push(asteroid);
            }
            else{
                while(!stack.isEmpty()){
                    int top = stack.peek();
                    if(top < 0){
                        stack.push(asteroid);
                        break;
                    }
                    else if(top == Math.abs(asteroid)){
                        stack.pop();
                        break;
                    }
                    else if(Math.abs(top) > Math.abs(asteroid))break;
                    else {
                        stack.pop();
                        if(stack.isEmpty()){
                            stack.push(asteroid);
                            break;
                        }
                    }
                }
            }
        }
        int len = stack.size();
        int[] ans = new int[len];
        len = 0;
        for(int asteroid : stack){
            ans[len++] = asteroid;
           
        }
        // while(!stack.isEmpty()){
        //     ans[len - 1] = stack.pop();
        //     len--;
        // }
        return ans;
    }
}
