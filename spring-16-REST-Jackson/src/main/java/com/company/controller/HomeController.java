package com.company.controller;

import com.company.dto.AccountDTO;
import com.company.dto.UserDTO;
import com.company.service.AccountService;
import com.company.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    private final UserService userService;
    private final AccountService accountService;

    public HomeController(UserService userService, AccountService accountService) {
        this.userService = userService;
        this.accountService = accountService;
    }

    @GetMapping("/users")
    public List<UserDTO> readAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/accounts")
    public List<AccountDTO> readAllAccounts() {
        return accountService.getAccounts();
    }

}
