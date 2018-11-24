/**
 *
 */
package org.snowolf.chipmunk.controller;

import org.snowolf.chipmunk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author snowolf
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *
     */
    @PostMapping(value = "changePasword")
    public ModelAndView changePassword(
            @RequestParam(name = "id") long id,
            @RequestParam(name = "oldPassword") String oldPassword,
            @RequestParam(name = "newPassword") String newPassword) {
        boolean isOk = userService.changePassword(id, oldPassword, newPassword);
        ModelAndView mv = new ModelAndView();
        mv.addObject("isOk", isOk);
        return mv;
    }
}
