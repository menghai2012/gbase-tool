package com.ztgx.web;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;


public class AbstractController {
	//获取请求参数
	protected Map<String,Object> parseRequestParam(HttpServletRequest  request){
		Map<String,Object> paramMap=new HashMap<String,Object>();
		Enumeration<String> paramNames=request.getParameterNames();
		while(paramNames.hasMoreElements()){
			String key=paramNames.nextElement();
			String value=request.getParameter(key);
			if(StringUtils.isNotBlank(value)){
				paramMap.put(key,value);
			}
			
		}
		return paramMap;
	}
	
	public Map<String,Object> getParams(){
		return new HashMap<String,Object>();
	}
}
