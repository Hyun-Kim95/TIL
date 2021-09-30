package com.ajax.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Handles requests for the application home page.
 */
@Controller
public class AjaxTestController {


//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//
//		return "AjaxTest";
//	}
//
//	@RequestMapping(value="check", method=RequestMethod.POST)
//	@ResponseBody
//	public Object buttonClick(@RequestParam Map<String, Object> paramMap) {
//		 //���ϰ�
//        Map<String, Object> retVal = new HashMap<String, Object>();
//        
//        retVal.put("value", paramMap.get("key"));
//        
//        return retVal;
//        
//	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "rock";
	}

}
