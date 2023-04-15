package com.techpalle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController
{
	@RequestMapping(value="calc",params="btnAdd")
	public ModelAndView getAdd(String tbFn, String tbSn)
	{
		ModelAndView mv = new ModelAndView();
//		Convert the String to Integer.
		int fn = Integer.parseInt(tbFn);
		int sn = Integer.parseInt(tbSn);
		
//		Add the above 2 numbers and store it in a variable.
		int res = fn + sn;
		
//		Put the result in ModelAndView.
		mv.addObject("result", res);
		
//		Redirect user to display.jsp.
		mv.setViewName("display.jsp");
		
		
		return mv;
	}
	
	@RequestMapping(value="calc",params="btnSub")
	public ModelAndView getSub(String tbFn, String tbSn)
	{
		ModelAndView mv = new ModelAndView();
//		Convert the String to Integer.
		int fn = Integer.parseInt(tbFn);
		int sn = Integer.parseInt(tbSn);
		
//		Sub the above 2 numbers and store it in a variable.
		int res = fn - sn;
		
//		Put the result in ModelAndView.
		mv.addObject("result", res);
		
//		Redirect user to display.jsp.
		mv.setViewName("display.jsp");
		
		
		return mv;
	}
	
	@RequestMapping(value="calc",params="btnMul")
	public ModelAndView getMul(String tbFn, String tbSn)
	{
		ModelAndView mv = new ModelAndView();
//		Convert the String to Integer.
		int fn = Integer.parseInt(tbFn);
		int sn = Integer.parseInt(tbSn);
		
//		Multiply the above 2 numbers and store it in a variable.
		int res = fn * sn;
		
//		Put the result in ModelAndView.
		mv.addObject("result", res);
		
//		Redirect user to display.jsp.
		mv.setViewName("display.jsp");
		
		
		return mv;
	}
	
	@RequestMapping(value="calc",params="btnDiv")
	public ModelAndView getDiv(String tbFn, String tbSn)
	{
		ModelAndView mv = new ModelAndView();
//		Convert the String to Integer.
		float fn = Integer.parseInt(tbFn);
		float sn = Integer.parseInt(tbSn);
		
//		Divide the above 2 numbers and store it in a variable.
		float res = fn / sn;
		
//		Put the result in ModelAndView.
		mv.addObject("result", res);
		
//		Redirect user to display.jsp.
		mv.setViewName("display.jsp");
		
		
		return mv;
	}
}
