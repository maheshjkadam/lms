package com.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

public class LibraryManagementApp {
  private static final Logger logger = LoggerFactory.getLogger(LibraryManagementApp.class);

  //  whenever we load .class file, jvm look for main method with this signature to run(Note : load NOT INTIALIZE)
  public static void main(String[] args){
    SpringApplication.run(LibraryManagementApp.class,args);
    logger.info("Library Management System started sucessfully!");
  }
}