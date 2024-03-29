package in.assignment.Q7;

import java.util.*;

public class BackSpaceCompare {

	public static void main(String[] args) {

		String s="shreeyash";
		String t="yashshree";
		boolean ans=rotateString(s,t);
		System.out.println(ans);
	}

	public static boolean rotateString(String s, String goal) {
        if(s ==null || goal == null){
            return false;
        }
        if(s.length() != goal.length()) return false;
        if(s.length() == 0){
            return true;
        }
        int i =0, j =0;
        while(i < s.length() && j < goal.length()){
            if(s.charAt(i) == goal.charAt(j)){
                i++; j++;
            }
            else{
                if(j == 0){
                    i++;
                }
                else{
                    j= 0;
                }
            }
        }
        return (s.substring(0,goal.length() - j).equals(goal.substring(j)));
    }
	

}
