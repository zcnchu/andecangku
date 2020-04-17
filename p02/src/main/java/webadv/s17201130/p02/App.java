package webadv.s17201130.p02;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;
public class App {
    private static String username="zouchao";
    private static String password="17201130";
    public static void main(String[] args) {
    	Scanner scanner  = new Scanner(System.in);
       System.out.println("请输入用户名");
    	String nameString = scanner.nextLine();
    	System.out.println("请输入密码");
    	String passString = scanner.nextLine();
        if(nameString.equals(username)&&passString.equals(passString)) {
        	System.out.println("登录成功");
        System.out.println("input uesrname:"+nameString+"\nusername in file is:"+username);
        System.out.println("input uesrname:"+passString+"\npassword in file is:"+sha256hex(password));
        }else {
        	System.out.println("登录失败");
        System.out.println("input uesrname:"+nameString+"\nusername in file is:"+username);
        System.out.println("input uesrname:"+passString+"\npassword in file is:"+sha256hex(password));
		}
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}

