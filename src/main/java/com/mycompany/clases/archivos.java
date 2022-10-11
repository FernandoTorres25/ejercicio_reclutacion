package com.mycompany.clases;

import java.io.*;

public class archivos {
    
    public String leertxt(String direccion){ //direccion del archivo
        
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                //mientras bfRead tiene datos
                temp = temp + bfRead; //guarda el texto del archivo
            }
            
            texto = temp;
            
        }catch(Exception e){
            System.err.println("No se encontro el archivo");
        }  
        
        return texto;
    }
}       