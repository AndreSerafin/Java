package exercicios.exerc19_arquivos.application;

import exercicios.exerc19_arquivos.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        String inFilePath = "res\\in.csv";
        List<Product> productList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inFilePath))){
            String line = br.readLine();

            while (line != null) {
                String[] vect = line.split(",");
                productList.add(new Product(vect[0],Double.parseDouble(vect[1]), Integer.parseInt(vect[2])));
                line = br.readLine();
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

        String outFilePath = "src\\out\\out.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFilePath))) {
            
        }
    }
}
