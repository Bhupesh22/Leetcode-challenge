class Solution {
    public boolean backspaceCompare(String S, String T) {
            
			Stack<Character> s1=new Stack<>();
            Stack<Character> s2=new Stack<>();
            
			int i=0;
            for(char c:S.toCharArray())
            {
               if(c!='#')
                   s1.push(c);
               else if(!s1.isEmpty())
                   s1.pop();
            }
            
            
            for(char c:T.toCharArray())
            {
               if(c!='#')
                   s2.push(c);
               else if(!s2.isEmpty())
                   s2.pop();
            }
            
            while(!s1.isEmpty() && !s2.isEmpty())
            {
                char c=s1.pop();
                if(c!=s2.pop())
                    return false;

            }
            return s1.isEmpty() && s2.isEmpty();
        
    }
}
}