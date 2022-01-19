package com.example.webrtc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ghy
 */
@Controller
public class IndexController {
    /**
     * WebRTC + WebSocket
     */
    @RequestMapping("/{username}.html")
    public String socketChartPage(@PathVariable String username, ModelMap modelMap) {
        modelMap.addAttribute("username",username);
        return "/webrtc";
    }
}
