/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejempprogfuncional;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Paredes
 */
public class EjempProgFuncional {

    public static void main(String[] args) throws IOException {

        File f = new File("producciones.csv");
        
        List<ProdCedulasEneFeb2016> p = new ArrayList<>();
        
        //UTILIZANDO PROGRAMACION FUNCIONAL
//        Stream<String> st = Files.lines(f.toPath());
//        st.forEach(s -> p.add(nuevo(s)));
        
        BufferedReader bf = new BufferedReader(new FileReader(f));

        String s;
        
        while ((s = bf.readLine()) != null) {            
//            System.out.println(s);
            p.add(nuevo(s));
        }
        bf.close();
        
        p.stream().forEach(c -> System.out.println(c.toString()));
        
        System.out.println("\n\nCedulas de Enero\n");
        
        //PRESENTA LAS CEDULAS DEL MES DE ENERO
        p.stream().filter(c -> {
            return c.getMes() == 1;
        }).forEach(c -> System.out.println(c.toString()));
        
        System.out.println("\n\nCedulas de Febrero\n");
        
        //PRESENTA LAS CEDULAS DEL MES DE FEBRERO
        p.stream().filter(c -> {
            return c.getMes() != 1;
        }).forEach(c -> System.out.println(c.toString()));
        //p.stream().forEach(c -> System.out.println(c.toString().toLowerCase()));
        
    }

    public static ProdCedulasEneFeb2016 nuevo(String s) {
        String[] list = s.split(";");
        String ciudad = list[0];
        int año = Integer.parseInt(list[1]);
        int mes = Integer.parseInt(list[2]);
        String tipo = list[3];
        int cantidad = Integer.parseInt(list[4]);
        ProdCedulasEneFeb2016 n = new ProdCedulasEneFeb2016(ciudad, año, mes, tipo, cantidad);
//        System.out.println(n);
        return n;
    }
}
