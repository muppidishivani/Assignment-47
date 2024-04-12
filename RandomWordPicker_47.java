package com.web.java;

import java.util.Random;

public class RandomWordPicker_47 {

	
	   public static void main(String[] args) {
	       
	        String[] w = {"java", ".net", "oracle", "spring", "springboot"};

	       
	        Random r = new Random();

	        
	        int ri= r.nextInt(w.length);

	        
	        String rw= w[ri];

	      
	        System.out.println("Randomly picked word in array is= " + rw);
	    }
	}

