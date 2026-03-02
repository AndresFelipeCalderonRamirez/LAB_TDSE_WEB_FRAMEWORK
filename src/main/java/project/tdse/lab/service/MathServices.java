package project.tdse.lab.service;
import project.tdse.lab.server.HttpServer;
import project.tdse.lab.server.Router;

import java.io.IOException;
import java.net.URISyntaxException;


public class MathServices {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Router.staticfiles("webroot/public");  // <-- define la carpeta

        Router.get("/pi",    (req, res) -> "PI = " + Math.PI);
        Router.get("/hello", (req, res) -> "Hello " + req.getValues("name"));

        HttpServer.main(args);
    }
}
