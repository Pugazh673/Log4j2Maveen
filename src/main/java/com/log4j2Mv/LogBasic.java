package com.log4j2Mv;

import java.util.Iterator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogBasic {
	 
	Logger log= LogManager.getLogger(LogBasic.class);
	
	
	public void m1() {
		
		log.info("Method is Start");
		
		for(int i=0;i<=8;i++) {
			
		}
		log.info("Method is end");
	}
	
	
}
