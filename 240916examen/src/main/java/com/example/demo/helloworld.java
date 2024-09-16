package com.example.demo;
import java.lang.Math;
import java.util.Random;
import java.util.ArrayList;
import java.io.PrintWriter;
import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmNativeQueryReturnType.JaxbHbmReturnDiscriminator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

   @RestController
   public class helloworld {
	   @GetMapping("/")
	   public String main(@RequestParam("identificador") int id) {
		   ArrayList<Integer> lista = generador();
		   System.out.print(lista);
	        
		   for (int i = 0; i <= lista.size(); i++) {
			   if (lista.get(i) == id)
				   return "existe";
			   else
				   return "no existe";
		   }
		   return "";
	   }
       public ArrayList<Integer> generador() {
    	   ArrayList<Integer> lista = new ArrayList<Integer>();
    	   Random rnd = new Random();
    	   for(int i = 0; i <= 4; i++)
    		   lista.add(rnd.nextInt(1, 10));
           return lista;
       }
   }