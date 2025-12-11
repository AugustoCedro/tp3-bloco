package org.example.app;

import io.javalin.Javalin;
import org.example.controller.ClientController;


public class App 
{
    public static void main( String[] args ) {
        Javalin app = Javalin.create().start(7000);

        new ClientController(app);
    }
}
