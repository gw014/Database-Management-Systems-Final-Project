package com.DBMS.finalproject;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    DB db;

    MyController()
    {
        db = new DB();
        
        try 
        {
            db.initDatabase();
        } catch (SQLException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @RequestMapping("/")
    public String home(Model model)
    {
        return "home.html";
    }

    @GetMapping("/team")
    public String addTeamForm(Model model)
    {
        model.addAttribute("team", new Team());
        return "team";
    }

    @PostMapping("/team")
    public String addTeamSubmit(@ModelAttribute Team team, Model model)
    {
        model.addAttribute("team", team);
        team.printTeam();
        return "viewteam";
    }

    @GetMapping("/player")
    public String addPlayerForm(Model model)
    {
        model.addAttribute("player", new Player());
        return "player";
    }

    @PostMapping("/player")
    public String addPlayerSubmit(@ModelAttribute Player player, Model model)
    {
        model.addAttribute("player", player);
        player.printPlayer();
        return "viewplayer";
    }    

    @GetMapping("/signing")
    public String signingForm(Model model)
    {
        model.addAttribute("signing", new Signing());
        return "signing";
    }

    @PostMapping("/signing")
    public String signingSubmit(@ModelAttribute Signing signing, Model model)
    {
        model.addAttribute("signing", signing);
        signing.printSigning();
        return "viewsigning";
    }     

}
