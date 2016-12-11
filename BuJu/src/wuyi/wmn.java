package wuyi;
import java.util.Scanner;
public class wmn {
	public static void main(String[] args){
	 for(int j=0;j<10;j++){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的邮箱：");
		String strMail=sc.nextLine();
		boolean b=true;
		if(strMail.indexOf("@")==-1||strMail.indexOf(".")==-1){
			b=false;
		}
		if(strMail.indexOf("@")!=strMail.lastIndexOf("@")||strMail.indexOf(".")!=strMail.lastIndexOf(".")){
			b=false;
		}
		if(strMail.indexOf("@")>strMail.indexOf(".")){
			b=false;
		}
		for(int i=0;i<strMail.indexOf("@");i++){
			if(((strMail.charAt(i)>'A'&&strMail.charAt(i)<'Z')||(strMail.charAt(i)>'a'&&strMail.charAt(i)<'z'))){
				b=true;
				break;
				
			}
		}
		if(b){
			System.out.println("你输入的邮箱"+strMail+"是正确的");
			System.exit(0);
		}
	 }
	}
}

	