package org.pluralsight;

import org.pluralsight.service.CourseRetrievalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOG= LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Hello world!");
        retrieveCourses("sander-mak");
    }

    public static void retrieveCourses(String authorId){

        LOG.info("Retrieven Courses for author '{}'", authorId);
        CourseRetrievalService courseRetrievalService=new CourseRetrievalService();

        String coursesToStore= courseRetrievalService.getCoursesFor(authorId);
        LOG.info("Retrieved Service '{}'", coursesToStore);
    }
}