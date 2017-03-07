package com.velociteg.sample;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String sam ="companyid=101&page=1#2+sum-lo_n.ghttp://%%";
        String sam1 ="companyid=101&";
        System.out.println(StringUtils.containsAny(sam,
        		"#%&_+=-?/.;:'!".toCharArray()));
        System.out.println(StringUtils.containsOnly(sam1,
        		"abcdefijklmnopqrstuvwxyzABCDEFIJKLMNOPQRSTUVWXYZ0123456789#%$&-=+_;:/.".toCharArray()));
    }
}
