//
///
//// codigo para cifrar mensajes por desplazamiento

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

class cifrado
{

	public  String cifrar(String frase, int positiones) //Funcion para el cifrado
	{
		StringBuilder mensajeCifrado = new StringBuilder();
		char l,l1,c;
		int p;

		String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		for (int i=0; i<frase.length(); i++ ) 
		{
			l=frase.charAt(i);
			for(int j=0;j<26; j++)
			{
				l1=abecedario.charAt(j);
				if(l==l1)
				{
					if(j+positiones>26)
					{
						p=j+positiones-26;
						c = abecedario.charAt(p);
						mensajeCifrado.append(c);

					}
				 	if(j+positiones<=26)
					{
					
						System.out.println(l1);
						p=j+positiones;
						c = abecedario.charAt(p);
						mensajeCifrado.append(c);

					}
				}
				
				else
				{

				}
			}
		}

		System.out.println(mensajeCifrado);
		return mensajeCifrado.toString(); //mensaje crifrado
	}

	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);// creamos un scanner para ingresar datos
		Scanner texto = new Scanner(System.in); // creamos un scanner para ingresar datos
		cifrado mjs = new cifrado(); //se instancia la funcion de cifrado
		String m;
		int n;

		System.out.println("Solo manejo un modelo de cifrado y es el de desplazamiento.");
		System.out.println("Cuantos espacios quieres el desplazamiento? ");
		n = scr.nextInt();
		System.out.println("Dime que mensaje quieres cifrar?");
		m = texto.nextLine();
		String textocifrado = mjs.cifrar(m,n);
		mjs.cifrar(m,n);
		
		

	}
}

