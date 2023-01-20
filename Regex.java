package org.zoho1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.*;

public class Regex {

	public static void main(String[] args) {
				        Scanner s=new Scanner(System.in);
		        while(s.hasNext()){
		            String IP=s.next();
		            System.out.println(IP.matches(new MyRegex().pattern));
		            
		            
		        }
		    }
		}
		class MyRegex{
			String pattern ="^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"; 
		 

		}
		    
		
		    