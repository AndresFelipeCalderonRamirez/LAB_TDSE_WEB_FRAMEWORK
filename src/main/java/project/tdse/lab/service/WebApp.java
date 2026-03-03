package project.tdse.lab.service;
import project.tdse.lab.server.HttpServer;
import project.tdse.lab.server.Router;

import java.io.IOException;
import java.net.URISyntaxException;

public class WebApp {
    public static void main(String[] args) throws IOException, URISyntaxException {
        // Archivos estáticos en target/classes/webroot
        Router.staticfiles("/webroot");

        // REST services — accesibles con prefijo /App
        Router.get("/hello", (req, res) -> "Hello " + req.getValues("name"));
        Router.get("/pi", (req, res) -> String.valueOf(Math.PI));
        Router.get("/index.html", (req, res) ->
                "<h1>Hola Mundo</h1><p>Bienvenido a Mini HTTP Framework</p>");

        // Puerto 8080 ya configurado en HttpServer
        HttpServer.main(args);
    }
}
