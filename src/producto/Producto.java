package producto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Producto 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int codigo = 0;
		String descripcion = "";
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		while(codigo != -1)
		{
			System.out.println("Código: ");
			codigo = Integer.parseInt(sc.nextLine());
			if(codigo != -1)
			{	
				System.out.println("Descripción: ");
				descripcion = sc.nextLine();
				if(hashMap.put(codigo, descripcion) == null)
				{
					System.out.println("Producto introducido");
				}
				else
				{
					System.out.println("Descripcion actualizada:");
				}
			}	
		}
		System.out.println("Total productos insertados (" + hashMap.size() + "): ");
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext())
		{
			Integer key = iterator.next();
			System.out.println("Código: " + key + " Valor: " + hashMap.get(key));
		}
		iterator = hashMap.keySet().iterator();
		System.out.println("Borrado de productos: ");
		while(iterator.hasNext())
		{
			Integer key = iterator.next();
			System.out.print("Código: " + key + " Valor: " + hashMap.get(key));
			System.out.print(" ¿Borrar?(s/n):");
			if (sc.nextLine().equals("s")) 
			{
				iterator.remove();
				System.out.println("Borrado.");
			}
		}
		sc.close();
		iterator = hashMap.keySet().iterator();
		System.out.println("Productos restantes (" + hashMap.size() + "): ");
		while(iterator.hasNext())
		{
			Integer key = iterator.next();
			System.out.println("Código: " + key + " Valor: " + hashMap.get(key));
		}
	}	
}
