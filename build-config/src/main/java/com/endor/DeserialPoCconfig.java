package com.endor;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserialPoCconfig {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Provide a file with a JSON payload as argument");
            System.exit(1);
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping();
        try {
            mapper.readValue(new File(args[0]), Object.class);
        } catch (IOException e) {
            System.err.println(e.getClass().getSimpleName() + " when deserializing: " + e.getMessage());
        }

        new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(null, null);
    }
}
