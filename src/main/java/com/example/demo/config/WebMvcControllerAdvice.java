package com.example.demo.config;

public class WebMvcControllerAdvice {
	package com.example.demo.config;

	import org.springframework.beans.propertyeditors.StringTrimmerEditor;
	import org.springframework.dao.EmptyResultDataAccessException;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.WebDataBinder;
	import org.springframework.web.bind.annotation.ControllerAdvice;
	import org.springframework.web.bind.annotation.ExceptionHandler;
	import org.springframework.web.bind.annotation.InitBinder;


	/**
	 * ëSÇƒÇÃControllerÇ≈ã§í èàóùÇíËã`
	 */
	@ControllerAdvice
	public class WebMvcControllerAdvice {

		/*
		 * This method changes empty character to null
		 * Ç±ÇøÇÁÇÃÉÅÉ\ÉbÉhÇópà”ÇµÇƒÇ®Ç≠Ç∆ëóêMÇ≥ÇÍÇΩãÛï∂éöÇÕnullÇ…ïœä∑Ç≥ÇÍÇ‹Ç∑
		 */
	    @InitBinder
	    public void initBinder(WebDataBinder dataBinder) {
	        dataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	    }
	   
	}
}
