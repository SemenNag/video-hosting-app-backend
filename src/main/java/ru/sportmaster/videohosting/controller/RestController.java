package ru.sportmaster.videohosting.controller;


import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/videos/{videoId}", method = RequestMethod.GET, headers = "Accept=*/*")
    public ResponseEntity<?> getContent(@PathVariable("videoId") Long id) {

        String videoName = id + ".mp4";
        ClassLoader classLoader = getClass().getClassLoader();

        InputStreamResource inputStreamResource = new InputStreamResource(classLoader.getResourceAsStream("videos/" + videoName));
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "video/mp4");
        return new ResponseEntity<Object>(inputStreamResource, headers, HttpStatus.OK);
    }

}
