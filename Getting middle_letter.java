import java.util.Scanner;

 class Solution {
   
  public String solution(String word) {

   String answer="";
      
   //���ڰ� ¦������ ��쿡 ��� �α��ڸ� ��������
   //ex) wldmsl
   //wldmsl�� ���ڼ��� s.length() = 6
   //s.length()/2-1 = 2, s.length()/2+1 = 4
   //���������� 2~(4-1)������ ���ڸ� ������
   //�׷��Ƿ� wldms �� dm
		
   if(word.length()%2==0)
   {
        System.out.print(word.substring(word.length()/2-1,word.length()/2+1));   
   }

   //���ڰ� Ȧ������ ��쿡 ��� �ѱ��ڸ� ��������
   //ex) wldms
   //wldms�� ���ڼ��� s.length() = 5
   //s.length()/2 = 2, s.length()/2+1 = 3
   //���������� 2~(3-1)������ ���ڸ� ������
   //�׷��Ƿ� wldms �� d
   
   else
   {
        System.out.print(word.substring(word.length()/2,word.length()/2+1));
   }
       
   //�� answer ��ȯ
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











