package com.example.spring1.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public  class BubbleSort implements Sort {


	public int[] sort(int[] num) {
		
		return num;
	}

	
	
}
