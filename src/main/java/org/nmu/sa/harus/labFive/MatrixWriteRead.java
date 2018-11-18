package org.nmu.sa.harus.labFive;

import java.io.*;
import java.util.Scanner;

import com.google.gson.*;

public class MatrixWriteRead {

    private static Gson JSONFile = new Gson();
    private static String JSONText;
    private static FileWriter writer;
    private static Scanner scan;

    public String writeJSONFile(Matrix arrayObject, String fileName) throws IOException {
        writer = new FileWriter(fileName, false);
        JSONText = JSONFile.toJson(arrayObject);
        writer.write(JSONText);
        writer.close();
        return JSONText;
    }

    public Matrix readJSONFile(Matrix arrayObject, String fileName) throws IOException {
        try {
            FileReader reader = new FileReader(fileName);
            scan = new Scanner(reader);
            arrayObject = JSONFile.fromJson(scan.nextLine(), Matrix.class);
            reader.close();
            return arrayObject;
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, specified file not found");
            return arrayObject;
        }
    }

}