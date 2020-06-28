package com.r.rosa;

import com.r.rosa.emailApp.Email;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Email email = new Email("Ricardo", "Rosa", "SpartaGlobal");
        System.out.println(email.showInfo());
    }
}
