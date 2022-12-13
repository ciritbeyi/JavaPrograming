package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("Okan Kenan", "Ciritbeyi");
        System.out.println();

        String [] emails = {"ozgur@gmail.com", "ali@hotmail.com", "kenan@yahoo.com" };
        for (String email : emails) {
            domain(email);
        }
        System.out.println();

        monthName(-1);
        System.out.println();

        nameOfDay(5);
        System.out.println();

        daysOfMonth(2,2022);

    }

//  1. Create a method that can display the initials of the person
    public static void initials (String firstName, String lastName){
        String ch1 = "" +firstName.charAt(0);
        String ch2 = "" +firstName.charAt(firstName.indexOf(" ")+1);
        String ch3 = "" +lastName.charAt(0);

        System.out.print( ch1 + " " + ch2 + " " + ch3);
    }


//	2. Create a method that can display the domain of the email
    public static void domain (String email){
            int a = email.indexOf("@");
            int b = email.indexOf(".");
            String domain = email.substring(a+1,b+1);
            System.out.println(domain);
    }


//	3. Create a method that can display the name of the month based on the given number to the method
    public static void monthName(int number){
        switch (number){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octoberr");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }


//	4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }


//	5. Create a method that can print how many days a month has
    public static void daysOfMonth(int number, int year){
        switch (number){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            case 2:
                if (year%4==0){
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
                break;
            case 4: case 6: case 9: case  11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }









}
