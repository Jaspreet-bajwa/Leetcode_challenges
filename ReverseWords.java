
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWords rev = new ReverseWords();
		String str = "  b      a";
		System.out.println(rev.reverseWords(str));
	}
	
	public String reverseWords(String s) {
	       if(s == null || s.equals("")){
	           return s;
	       }
	      /* String s[] = s.split(" ");
	       StringBuilder sb = new StringBuilder();
	       for(int i = s.length-1; i >= 0; i--){
	           sb.append(s[i]);
	           sb.appent(" ");
	       } 
	       return sb.toString().trim(); */
	       char ch[] = s.toCharArray();
	       boolean space = false;
	       StringBuilder sb = new StringBuilder();
	       for(int i = ch.length-1; i >= 0; i--){
	           if(ch[i] != ' '){
	               sb.append(ch);
	               space = false;
	           } else if(ch[i] == ' ' && !space){
	               sb.append(" ");
	               space = true;
	           }
	       }
	       return sb.reverse().toString();
	 }
}
