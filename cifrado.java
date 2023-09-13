//
///
//// codigo para cifrar mensajes por desplazamiento

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

class cifrado
{

	public String cifrar(String frase) //Funcion para el cifrado
	{
		frase="HOLA";
		StringBuilder mensajeCifrado = new StringBuilder();

		char l,l1,c;
		
		//String[] abecedario = {"A","B","C","D","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		for (int i=0; i<frase.length(); i++ ) 
		{
			l=frase.charAt(i);
			for(int j=0;j<25; j++)
			{
				l1=abecedario.charAt(j);
				if(l==l1)
				{
					int p=j+5;
					c = abecedario.charAt(p);
					mensajecifrado.append(c);
				}
			}
		}

		return "hola"; //mensaje crifrado
	}

	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in); // creamos un scanner para ingresar datos
		cifrado mjs = new cifrado();
		String m;
		int n;

		System.out.println("Solo manejo un modelo de cifrado y es el de desplazamiento.");
		System.out.println("Cuantos espacios quieres el desplazamiento? ");
		n = scr.nextInt();
		System.out.println("Dime que mensaje quieres cifrar?");
		m = scr.nextLine();
		mjs.cifrar(m);
	}
}
