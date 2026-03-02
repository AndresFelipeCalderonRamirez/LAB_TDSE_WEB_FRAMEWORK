package project.tdse.lab.util;

@FunctionalInterface
public interface WebMethod {
    String execute(Request req, Response res);
}