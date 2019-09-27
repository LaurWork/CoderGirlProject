package com.codergirl.FirstProj.Controllers;

import com.codergirl.FirstProj.dao.VideoDAO;
import com.codergirl.FirstProj.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("viewList")
public class listController {

    @Autowired
    private VideoDAO videoDAO;

    @GetMapping()
    public String viewList(Model model) {
        System.out.println("Loading List");
        List<Video> videos = videoDAO.getAll();
        model.addAttribute(("videos"), videos);
        model.addAttribute("count", videos.size());
        return "viewList.html";
    }


    public String saveAddNewVideo(@RequestParam String title, @RequestParam String area, @RequestParam String webAddress) {
    System.out.println("Saved..." + title + " " + area + " " + webAddress);

    videoDAO.addVideo(new Video(-1, title, area, webAddress));

    return "redirect:";

    }


    @GetMapping("/{id}/edit")
    public String viewVideo(Model model, @PathVariable int id) {
    Video video = videoDAO.findByID(id);
    model.addAttribute("video", video);

    return "video.html";
    }

    @PostMapping("/{id}/edit")
    public String editVideo(@ModelAttribute Video video, @PathVariable int id) {
    videoDAO.updateVideo(id, video);
    return "redirect:/videos";
    }

}
