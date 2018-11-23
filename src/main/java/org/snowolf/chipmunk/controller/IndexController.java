/**
 * 
 */
package org.snowolf.chipmunk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author snowolf
 *
 */
@RestController
@RequestMapping(value = "/")
public class IndexController {
	
//	/**
//	 * @return
//	 */
//	@RequestMapping(value = "/index")
//	public ModelAndView index() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("index");
//		mv.addObject("name", "xx");
//		return mv;
//	}

	@RequestMapping(value = "/index")
	public void index() {

	}
}
