package io.yevlabs.springbootbox.springbootexperiment.controllers;

import io.yevlabs.springbootbox.springbootexperiment.topic.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getTopics() {
        return Arrays.asList(
                new Topic("1", "Spring", "Spring"),
                new Topic("1", "Spring", "Spring"),
                new Topic("1", "Spring", "Spring")
        );
    }
}
