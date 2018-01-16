/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejempprogfuncional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Paredes
 */
public class EjempProgFuncional {

    public static void main(String[] args) throws IOException {
        
        // Creo el archivo temporal
        File f = new File("Progra.rtf");
        
        // Lectura con el Stream API y utilizando expresiones lambda
        Stream<String> lambdaStream = Files.lines(f.toPath());
        lambdaStream.forEach(s -> System.out.println(s));
        lambdaStream.close();
        
        f.delete();
    }

}
