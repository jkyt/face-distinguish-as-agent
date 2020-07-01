package com.jsc.utils;

import org.apache.commons.lang3.StringUtils;

public class BooleanUtils2 {

	public static Boolean parse(String s) {
		if(StringUtils.isEmpty(s)) return false;
		
		s = StringUtils.trim(s).toLowerCase();
		
		return s.equals("true") || s.equals("1");
	}
}

