// Last updated: 8/12/2026, 11:16:57 AM
import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        
        String[] components = path.split("/");
        
        for (String directory : components) {
            if (directory.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            } 
            else if (directory.equals(".") || directory.isEmpty()) {
                continue;
            } 
            else {
                stack.addLast(directory);
            }
        }
                StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        
        return result.length() == 0 ? "/" : result.toString();
    }
}