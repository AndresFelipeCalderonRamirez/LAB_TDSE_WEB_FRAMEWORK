package project.tdse.lab.util;
import java.net.MalformedURLException;
import java.net.URL;

public class URLParser {
    public static void main (String [] args) throws  MalformedURLException {
        URL myURL = new URL("http://is.escuelaing.edu.co:7654/respuestas/respuesta.txt?val=7&t=3#pubs");
        System.out.println("URL: "+myURL);
        System.out.println("Protocol: "+myURL.getProtocol());
        System.out.println("Host: "+myURL.getHost());
        System.out.println("Port: "+myURL.getPort());
        System.out.println("File: "+myURL.getFile());
        System.out.println("Path: "+myURL.getPath());
        System.out.println("Query: "+myURL.getQuery());
        System.out.println("Ref: "+myURL.getRef());
    }
}
