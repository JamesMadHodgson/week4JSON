package json;

import java.util.Scanner;

public class Dog {
   private String name;
   private int years;
   private int dogyears;
   private String dogbread;
/*
non parameterized function
 */
    public Dog() {
        this.name = "";
        this.years = 0;
        this.dogyears = 0;
        this.dogbread = "";
    }
/*
parameterized function
 */
    public Dog(String name, int years, int dogyears, String dogbread) {
        this.name = name;
        this.years = years;
        this.dogyears = dogyears;
        this.dogbread = dogbread;
    }
    /*
    gets and sets for dog information
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setDogyears(int dogyears) {
        this.dogyears = dogyears;
    }

    public void setDogbread(String dogbread) {
        this.dogbread = dogbread;
    }

    public int getYears() {
        return years;
    }

    public int getDogyears() {
        return dogyears;
    }

    public String getDogbread() {
        return dogbread;
    }
    /*
    gather information about dog object
     */
    public void getInfo() {
        System.out.println("This program will tell you how old your dog is in dog years");
        System.out.println("Please enter information asked about your dog");
        Scanner input = new Scanner(System.in);
        System.out.print("name: " );

        this.name = input.next();
        System.out.print("the age of your dog?: " );

        this.years = input.nextInt();
        System.out.print(" your dogs bread is a: " );

        this.dogbread = input.next();
        this.dogyears = computeDogYears(this.years);
    }
    /*
    compute number of dog years in dog object
     */
    public int computeDogYears( int years ) {
        return years * 7;

    }
/*
     this takes the info by the dog owner and puts the json string into object the owner understands
 */
    public void displayInfo(){
        System.out.println("\n Dog JSON object report: ");

        System.out.println("Your dog: " + this.name + " has been alive for: " + this.years + "years"  );
        System.out.println("In dog year dog years " + this.name +  " is: " + this.dogyears + " years old");
        System.out.print("your dogs bread is a: "+ this.dogbread + " that's good news because " + this.name + " has a long life ahead");

    }
}
