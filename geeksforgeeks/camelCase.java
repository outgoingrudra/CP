class Solution {
    // Function to convert the given string to Camel Case
    public String convertToCamelCase(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));  // Start with first char as-is
        
        for (int i = 1; i < s.length(); i++) {
            char prev = s.charAt(i - 1);
            char curr = s.charAt(i);
            
            if (prev == ' ' && curr != ' ') {
                // Capitalize the first letter after a space
                ans.append(Character.toUpperCase(curr));
            } else if (curr != ' ') {
                // Append other non-space chars as-is
                ans.append(curr);
            }
            // Spaces are ignored (not appended)
        }
        
        return ans.toString();
    }
}