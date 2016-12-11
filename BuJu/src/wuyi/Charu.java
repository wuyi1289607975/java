package wuyi;

import java.util.Scanner;
public class Charu {

	public static void main(String[] args) {
		String s=new String("123456");
		char[]sr1=s.toCharArray();
		Scanner st=new Scanner(System.in);
		String sb=st.nextLine();
		String sb1=st.nextLine();
		String[]ss=s.split(sb);
		String s1=new String();
		for(int i=0;i<ss.length;i++){
			 s1=ss[i+1]+sb+sb1+ss[i];
		}
		System.out.println(s1);
		// TODO Auto-generated method stub

	}

}
