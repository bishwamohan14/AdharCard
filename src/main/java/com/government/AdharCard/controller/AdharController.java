package com.government.AdharCard.controller;


import com.government.AdharCard.entity.AdharUsers;
import com.government.AdharCard.service.AdharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class AdharController {


    @Autowired
    private AdharService service;

    @GetMapping("/")
    public String home(Model m)
    {
        List<AdharUsers> users=service.getAllUsers();
        m.addAttribute("users",users);
        return "index";
    }

    @GetMapping("/adduser")
    public String addUserForm()
    {
        return "add_adharUsers";
    }

    @PostMapping("/register")
    public String userRegister (@ModelAttribute AdharUsers users, HttpSession session)
    {
        System.out.println(users);
        service.addUsers(users);
        session.setAttribute("msg","User has been added successfully");
        return "redirect:/";

    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model m)
    {
        AdharUsers users=service.getUserById(id);
        m.addAttribute("users",users);
        return "edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute AdharUsers users,HttpSession session)
    {
        service.addUsers(users);
        session.setAttribute("msg","User Data updated successfully");
        return "redirect:/";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id,HttpSession session)
    {
        service.deleteUser(id);
        session.setAttribute("msg","User data deleted successfully");
        return "redirect:/";
    }
}
