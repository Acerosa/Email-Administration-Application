package com.r.rosa.emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String alternativaEmail;
    private int emailCapacity;
    private String department;
    private String email;
    private String company;
    int passLength;

    //Construct to receive the first name and the last name
    public Email(String firstName, String lastName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.department = setDepartment();
        this.password = randomPassword();
        System.out.println("You password is: >>> " + this.password + " <<<\nplease take note.");
        //Elements to create email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+ company + ".com";

    }

    //Ask for the department
    private String setDepartment(){
        System.out.println("New worker : " + firstName + " Department codes\n1+ for Sales\n2 for Dev\n3 for Accounting\nEnter department codes:\n");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        switch (depChoice){
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            case 0:
                return "";
            default:
                System.out.println("Not a department\n");
                return   setDepartment();

        }
    }
    //Generate the random password
    private String randomPassword(){
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter a number between 6 and 12 for you password ");
        int choosenLenght = scann.nextInt();

        if (choosenLenght <= 5 || choosenLenght >= 13){
            System.out.println("Choose a number between 6 and 12");
            randomPassword();
        } else {
            passLength = choosenLenght;
        }
        char[] password = new char[passLength];
        String passwordSet = "ABCDEFGHIJKLMNOPQRCTUVYVWXZ1234567890@_-";
        for (int i = 0; i <passLength; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public int getEmailCapacity() {
        return emailCapacity;
    }

    public void setEmailCapacity(int emailCapacity) {
        this.emailCapacity = emailCapacity;
    }
// Set the email capacity

    //Set the alternative email

    public String getAlternativaEmail() {
        return alternativaEmail;
    }

    public void setAlternativaEmail(String alternativeEmail) {
        this.alternativaEmail = alternativeEmail;
    }


    //Change the password

    public void changePassword(String password){
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    public String showInfo (){
        return "NAME DISPLAY:\n" +   "----" + firstName + " " + lastName + "----" +
                "\nDISPLAY COMPANY:\n" + "----" + company + "----" +
                "\nDISPLAY EMAIL:\n" +"----"+  email + "----"+
                "\nDISPLAY EMAIL CAPACITY:\n" + emailCapacity + " mb";

    }

}
