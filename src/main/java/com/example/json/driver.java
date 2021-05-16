package com.example.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class driver {
    public static void main(String[] args) {
        try {
            //create a object Mapper
            ObjectMapper map=new ObjectMapper();

            //read JSON file and map/convert to Java POJO
            //data.sample-lite.json

            demo student=map.readValue(new File("data/sample-full.json"),demo.class);

            System.out.println(student.getFirstName());
            System.out.println(student.getLastName());
            System.out.println(student.isActive());
            address som=student.getAddress();
            System.out.println(som.getCity());
            String[] a=student.getLanguages();

            for (String b: a ){
                System.out.println(b);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();

        }


    }

}
