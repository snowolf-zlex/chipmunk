/**
 *
 */
package org.snowolf.chipmunk.controller;

import org.snowolf.chipmunk.domain.Account;
import org.snowolf.chipmunk.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Snowolf
 */
@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "getAccount")
    public Account getAccountById(@RequestParam(name = "id") long id) {
        return accountService.readById(id);
    }
}
