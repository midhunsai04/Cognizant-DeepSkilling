package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCoreApplication.class);

    public static void main(String[] args) {
        LOGGER.info("START");
        displayCountry();
        LOGGER.info("END");
    }

    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        Country us = context.getBean("countryUS", Country.class);
        Country de = context.getBean("countryDE", Country.class);
        Country in = context.getBean("countryIN", Country.class);
        Country jp = context.getBean("countryJP", Country.class);

        LOGGER.debug("Country : {}", us);
        LOGGER.debug("Country : {}", de);
        LOGGER.debug("Country : {}", in);
        LOGGER.debug("Country : {}", jp);
    }

}
