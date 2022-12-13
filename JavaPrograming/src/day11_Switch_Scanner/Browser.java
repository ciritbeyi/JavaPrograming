package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName = "chrome";
        String result = "";  // temporary value

        boolean validBrowser = browserName=="chrome" || browserName=="firefox" || browserName=="opera"
                || browserName=="safari" || browserName=="edge";
// yukarda browserName = "chrome" secili oldugu icin onun disindakiler renkli gozukuyor. intelliJ is smart. it will not control the others
        if (validBrowser) { // if boolean is true // 5 options
            if (browserName=="chrome"){
                result = "Chrome Browser is Selected";
            } else if (browserName=="firefox") {
                result = "firefox Browser is Selected";
            } else if (browserName=="opera") {
                result = "opera Browser is Selected";
            } else if (browserName=="safari") {
                result = "safari Browser is Selected";
            }else {
                result = "edge Browser is Selected";
            }
        } else {  // if boolean is false
           result = "Invalid Browser Name";
        }
        System.out.println(result);


    }
}
