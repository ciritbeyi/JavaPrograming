package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
       int score = 135;
        if (score>=0 && score<=100){ // if the score is valid
            if (score>=90) { // false : score <90 // score>=90 && score<=100  we can write like this but no need. second part is already mentioned above
                System.out.println("Excellent");
            } else if (score>=80) { // false : score <80  this mentioned below else if
                System.out.println("Great");
            } else if (score>=70) { // false : score <70  this mentioned below else if
                System.out.println("Good");
            } else if (score>=60) { // false : score <60 this mentioned below else if
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else { // if the score is NOT valid
            System.out.println("Invalid Score");
        }
        System.out.println("--------------------------");
        String result = ""; // temporary ""; if we don't do this it will give compile error
        if (score>=0 && score<=100){ // if the score is valid
            if (score>=90) { // false : score <90 // score>=90 && score<=100  we can write like this but no need. second part is already mentioned above
                result = ("Excellent");
            } else if (score>=80) { // false : score <80  this mentioned below else if
                result = ("Great");
            } else if (score>=70) { // false : score <70  this mentioned below else if
                result = ("Good");
            } else if (score>=60) { // false : score <60 this mentioned below else if
                result = ("Passed");
            } else {
                result = ("Failed");
            }

        } else { // if the score is NOT valid
            result = ("Invalid Score");
        }
        System.out.println(result);


    }
}
/*
90 ~ 100 : Excellent
80 ~ 89 : Great
70 ~ 79 : Good
60 ~ 69 : Passed
0 ~ 59 : Failed
 */