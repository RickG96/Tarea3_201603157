/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromos;

import java.util.Scanner;

/**
 *
 * @author Runi
 */
public class menu {
    
    int opcion_menu = 0;
    int opcion_usuario= 0;
    String[] usuarios = new String[5];
    String cadena;
    Scanner sc = new Scanner(System.in);
    
    
    public menu(){
    
    menuprincipal();
    
}
    
    public void menuprincipal ()
    {
        while (true){
            
            if (opcion_usuario == 5)
            {
                break;
            }
            
            System.out.println("-----Tarea 3-----");
            System.out.println(" ---201603157---");
            System.out.println("");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Usuarios");
            System.out.println("2. Palabras Palindromas");
            System.out.println("3. salir");

            opcion_menu = sc.nextInt();
            
            if (opcion_menu == 3)
            {    
                break;
            }    

            primer_menu (opcion_menu);
            
        }
    }
    
    public void primer_menu (int opcion_menu)
    {
        switch (opcion_menu)
        {
            case 1:
                
                while (true){
                    
                
                System.out.println("---Menu de Usuarios---");
                System.out.println("");
                System.out.println("1. Ingresar usuarios");
                System.out.println("2. Mostrar todos los usuarios");
                System.out.println("3. Mostrar un usuario personalizado");
                System.out.println("4. Menu principal");
                System.out.println("5. Salir");
                
                opcion_usuario = sc.nextInt();
                
                menu_usuarios (opcion_usuario);
                
                if (opcion_usuario == 4 || opcion_usuario == 5)
                {
                    break;
                }
                
                }
            break;
            
            
            case 2:
                System.out.println("escogiste la opcion 2");
                System.out.println("");
            
            break;  
        }
    }
    
    public void menu_usuarios (int opcion_usuario)
    {
        switch (opcion_usuario)
        {
            case 1:
                
                System.out.println("Ingrese Usuarios");
                
                usuarios[0] = sc.nextLine();
                
                for (int i = 0; i < 5; i++)
                {
                    usuarios[i] = sc.nextLine();
                }
                System.out.println("");
                
            break;
            
            case 2:
                
                System.out.println("Mostrar todos los usuairios:");
                System.out.println("");
                
                for (int i = 0; i < 5; i++)
                {
                    System.out.println("usuario " +i+ ": " +usuarios[i]);
                }
                System.out.println("");
                
            break;
            
            case 3:
                
                System.out.println("Ingrese nombre de Usuario");
                sc.nextLine();
                cadena = sc.nextLine();
                
                if (cadena.equalsIgnoreCase(usuarios[0])||
                    cadena.equalsIgnoreCase(usuarios[1])||
                    cadena.equalsIgnoreCase(usuarios[2])||
                    cadena.equalsIgnoreCase(usuarios[3])||
                    cadena.equalsIgnoreCase(usuarios[4]))
                {
                    System.out.println("Bienvenido: " +cadena+ " :v");
                }
                else
                {
                    System.out.println("ERROR!!!!! el usuario no existe :'v");
                }
                
                System.out.println("");
                
            break;
        }
    }
    
    
    }


