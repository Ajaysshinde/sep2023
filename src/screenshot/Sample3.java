package screenshot;



import java.util.Date;

import net.bytebuddy.utility.RandomString;
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String name
		String s1 = RandomString.make(10);
		System.out.println(s1); //0wU7qeMt  83jSOrkp GrBWAzZ3 SH0Ulijc 
	
		//String s2 = RandomStringUtils.random(5,"Atipune");
//timestamp 
		
                 Date d=new Date();                
                 String timestamp = d.toString().replace("", "_").replace(':', '_');
                 System.out.println(timestamp);
                 

	}

}
