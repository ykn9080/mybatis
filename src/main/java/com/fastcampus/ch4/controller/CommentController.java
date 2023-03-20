package com.fastcampus.ch4.controller;

import com.fastcampus.ch4.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired CommentService commentService;
    @GetMapping("/count")
    public int count(Integer bno){
        try {
            return commentService.getCount(bno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
