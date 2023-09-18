//
///
//// codigo para cifrar mensajes por desplazamiento

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

class cifrado
{

	//Funcion para el cifrado
	public  String cifrar(String frase, int positiones) 
	{
		//variable para el mensaje ya cifrado
		StringBuilder mensajeCifrado = new StringBuilder();
		char l,l1,l2,c;
		int p;

		String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String caracteres = "!°#$%&/()=?¡¿,.;:- _{}[]+*1234567890";
		//for para seleccionar la letra.
		for (int i=0; i<frase.length(); i++ ) 
		{
			l=frase.charAt(i);
			//segundo for para comparar la letra  con el avecedario 
			for(int j=0;j<26; j++)
			{
				l1=abecedario.charAt(j);

				//if para asignar la letra equivalente cuando se pasa despues de z
				if(l==l1)
				{
					if(j+positiones>26)
					{
						p=j+positiones-26-1;
						c = abecedario.charAt(p);
						mensajeCifrado.append(c);

					}
					//if para asignar la letra equivalente cuando no se pasa del limite
				 	if(j+positiones<=26)
					{
						p=j+positiones;
						c = abecedario.charAt(p);
						mensajeCifrado.append(c);

					}
				}
				else
				{
					l2=caracteres.charAt(j);
					if(l==l2)
					{
						mensajeCifrado.append(l);
					}
				}

				
			}
		}
		//mensaje crifrado
		return mensajeCifrado.toString() ; 
	}

	public static void main(String[] args) 
	{
		// creamos un scanner para ingresar datos
		Scanner scr = new Scanner(System.in);
		Scanner texto = new Scanner(System.in); 

		//se instancia la funcion de cifrado
		cifrado mjs = new cifrado(); 
		String m;
		int n;

		System.out.println("Solo manejo un modelo de cifrado y es el de desplazamiento.");
		System.out.println("Cuantos espacios quieres el desplazamiento? ");
		n = scr.nextInt();
		System.out.println("consejo: Actualmente no cuento con procesamiento de numeros de mas de un digito, si necesitas escribir un numero tiene que ser separado, 12 = 1 2 ");
		System.out.println("Dime que mensaje quieres cifrar?");
		m = texto.nextLine();
		System.out.println(mjs.cifrar(m,n));
		
		

	}
}
