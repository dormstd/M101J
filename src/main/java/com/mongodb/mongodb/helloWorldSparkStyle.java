package com.mongodb.mongodb;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * Created by Bego on 23/03/2017.
 */
public class helloWorldSparkStyle {
    public static void main(String[] args) {
        Spark.get(new Route("/")
        {
            @Override
            public Object handle(final Request request, final Response response){
                return "Hello Workld From Spark";
            }
        });
        Spark.get(new Route("/test")
        {
            @Override
            public Object handle(final Request request, final Response response){
                return "Hello test page";
            }
        });
        Spark.get(new Route("/echo/:thing")
        {
            @Override
            public Object handle(final Request request, final Response response){
                return request.params(":thing");
            }
        });
    }
}
