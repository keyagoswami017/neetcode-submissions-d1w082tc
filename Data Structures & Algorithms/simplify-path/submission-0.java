class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] paths = path.split("/");

        for(String p : paths){
            if(p.equals("..")){
                if(!st.isEmpty())
                    st.pop();
            }  
            else if(!p.equals("") && !p.equals("."))
                    st.push(p);
        }

        return "/" + String.join("/",st);
        
    }
}