import java.util.Scanner;

 class Solution {
   
  public String solution(String word) {

   String answer="";
      
   //글자가 짝수개일 경우에 가운데 두글자를 가져오기
   //ex) wldmsl
   //wldmsl의 글자수는 s.length() = 6
   //s.length()/2-1 = 2, s.length()/2+1 = 4
   //최종적으로 2~(4-1)까지의 글자를 가져옴
   //그러므로 wldms → dm
		
   if(word.length()%2==0)
   {
        System.out.print(word.substring(word.length()/2-1,word.length()/2+1));   
   }

   //글자가 홀수개일 경우에 가운데 한글자를 가져오기
   //ex) wldms
   //wldms의 글자수는 s.length() = 5
   //s.length()/2 = 2, s.length()/2+1 = 3
   //최종적으로 2~(3-1)까지의 글자를 가져옴
   //그러므로 wldms → d
   
   else
   {
        System.out.print(word.substring(word.length()/2,word.length()/2+1));
   }
       
   //답 answer 반환
         return answer;
 } 
}

 public class Mid{
  public static void main(String[] args)
   {
        Solution sol=new Solution();

        Solution sol2 = new Solution();
		
        sol.solution("wldmsl");

        System.out.println();

        sol2.solution("wldms");
		
        System.out.println();
   }
}











