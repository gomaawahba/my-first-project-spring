package com.gomaawahba.validation;

import org.springframework.stereotype.Service;


public class Checkvaliduser {
	
	public boolean checkvaliduser(String name,String password) {
		if(name.equals("gomaa")&&password.equals("1234")) {
			return true;
		}else {
			return false;
		}
	}

}
