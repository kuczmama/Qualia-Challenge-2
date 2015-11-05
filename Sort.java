/*
 * Mark Kuczmarski
 * Qualia Challenge
 * Purpose : Function to sort an array of strings based on an arbitrary
 *           lexicographic ordering.
 */

import java.util.Collections;
import java.util.ArrayList;

class Sort {

	//Maps a string to a source and a destination
	private static String map(String str, String src, String dest) {
		String temp = "";
		for(int i = 0 ;i < str.length(); i++){
			char ch = str.charAt(i);
			int index = src.indexOf(ch);
			temp = temp + dest.charAt(index);
		}
		return temp;
	}

	static ArrayList<String> sort(String dictionary, String[] words){
		ArrayList<String> res = new ArrayList<String>();
		String eng = "abcdefghijklmnopqrstuvwxyz";
		ArrayList<String> tempArray = new ArrayList<String>();
		//map each string
		for(String str : words){
			tempArray.add(map(str, dictionary, eng));
		}
		//sort the string
		Collections.sort(tempArray);
		//remap it
		for(String str : tempArray){
			res.add(map(str, eng, dictionary));
		}
		return res;
	}
	public static void main(String args[] ) throws Exception {
		String[] words = new String[]{"aaaaaaa", "aaa", "aa", ""};
		sort("abc", words);
    //test it
		System.out.println(sort("a", words));

	}
}
