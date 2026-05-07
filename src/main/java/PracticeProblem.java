/**

        * File: Lesson 5.6 - else if

        * Author: Nithin.A

        * Date Created: may 7th, 2026

        * Date Last Modified: May 7th, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean isPalindrome(String word){
		String[] arr = word.split("");
		int count = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i].equals(" ")){
				count++;
			}
		}
		String[] forward = new String[arr.length - count];
		int idx = 0;
		for (int i = 0; i < arr.length; i++){
			if (!arr[i].equals(" ")){
				forward[idx] = arr[i];
				idx++;
			}
			
		}

		String[] backward = new String[forward.length];
		for (int i = 0; i < forward.length; i++){
			backward[i] = forward[(forward.length - 1) - i];
		}
		
		for (int i = 0; i < forward.length; i++){
			if (!backward[i].toLowerCase().equals(forward[i].toLowerCase())){
				return false;
			}
		}
		return true;


	}

}
