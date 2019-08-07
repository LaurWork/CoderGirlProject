package com.codergirl.FirstProj.Controllers;

import com.codergirl.FirstProj.model.Video;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("viewList")
public class listController {


    private static List<Video> titles;

    public listController(){
        titles = new ArrayList<Video>();
        titles.add(new Video("First One", "www.cool.com"));
        titles.add(new Video("Second One", null));

    }

    @RequestMapping("")
    public String viewList(Model model){
System.out.println("Loading List");

        model.addAttribute("titles", titles);
        model.addAttribute("count", 42);
        return "viewList.html";
    }

    @RequestMapping("new")
    public String addTitle(Model model, @RequestParam String videoTitle){

        System.out.println("Adding Video: " + videoTitle);

      titles.add(new Video(videoTitle, null));
        return "redirect:";
    }

}
