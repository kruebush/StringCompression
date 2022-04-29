package com.onboard.StringCompression;

import org.w3c.dom.css.CSSRule;

/**
 * Hello world!
 *
 */
public class Compression 
{
    public static void main( String[] args )
    {
        Compression comp = new Compression();
        System.out.println(comp.compress("aabcccccaaa"));
        System.out.println(comp.compress("abcdef"));
    }
    public static String compress(String str) {
    	StringBuilder compressedString = new StringBuilder();
    	int repeatCount = 0;
    	for (int i =0; i < str.length(); i++) {
    		repeatCount++;
    		
    		if (str.length() <= i+1 || str.charAt(i) !=str.charAt(i+1)) {
    			compressedString.append(str.charAt(i));
    			compressedString.append(repeatCount);
    			repeatCount=0;
    		}
    	}
    	
    	if (compressedString.length() < str.length()) {
    		return compressedString.toString();
    	}
    	else {
    		return str;
    	}
    }
}
