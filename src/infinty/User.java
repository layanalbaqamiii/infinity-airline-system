/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinty;


/**
 *
 * @author USER
 */
/* 
Here the person is logged in only without being a passenger 
Entry will not be accepted unless it meets the conditions in the main 
*/

public class User {
    
    public String username;
    public static String password;
    
    public User() {
    }
    
    public User(String username) {
        this.username = username;
    }
    
    public boolean Check(String password) {
        if (password.length() < 8) {
            return false;
        }
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            // ظ‚ط·ط¹ ط­ط±ظپ ظˆط§ط­ط¯ ظ…ظ† ط§ظ„ط¨ط§ط³ظˆظˆط±ط¯ ظ„ظ†طµ 
            //Take the character at index i as sting "Take only one letter" 
            String ss = password.substring(i, i + 1);
            /* exception handling
            try Take the String and try to convert it to a number Integer and put it in the variable x
            If it works then it is a number and add the number ( 1 )
            */
            try {
                int x = Integer.parseInt(ss);
                numCount++;
            } 
             /* exception handling
             If it not works then go to catch and This means that it is
            not a number so if char add 1 or if not return false 
            */
            catch (Exception e) {
                if (Check(ss.charAt(0))) {
                    charCount++;
                } else {
                    return false;
                }
            }
        }
        if ((charCount >= 2 && numCount >= 2)) {
            User.password = password;
            return true;
        }
        return false;
    }
//overloading 
    public boolean Check(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
       
        
    @Override
    public String toString() {
        return "username:" + username + "password:" + password;
    }
}



