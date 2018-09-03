package com.mpm.EWalletApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class EWalletApplication  extends SpringBootServletInitializer
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EWalletApplication.class, args);
    }
}
