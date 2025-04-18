package GeneradorCuentas;

import java.io.Serializable;
import java.util.Scanner;

public class Empleado implements Serializable{
	
	private final String name, username, email;
	private String password;
	
	public Empleado() {
		name = setName();
		username=setUserName(name);
		email=setEmail(username);
		password=setPassword(username);
	}
	
	private String setPassword(String user) {
		//8 caracteres, mayusculas y minusculas
		//caracteres especiales
		
		int maxLength = 8;
		//longitud de la password de 8 caracteres
		
		if(user.length()<maxLength)
			while(user.length()<maxLength)
				user += '*';
		else
			user = user.substring(0,8);
		//final if 
		//reemplaza los caraceteres con un *
		
		user = user.replaceAll("[aeiou]","*");
		
		for(int i=0;i<user.length();i++)
			if(Character.isLetter(user.charAt(i))) {
				if(i==0) {
					user = user.substring(0,1).toUpperCase()+user.substring(1);
					break;
				}
				else
					if(i==user.length()-1) {
						
						user=user.substring(0,1)+user.substring(i).toUpperCase();
						break;
				}
					else {
						String str1 = user.substring(0,i);
						String str2 = user.substring(i,i+1).toUpperCase();
						String str3 = user.substring(i+1);
						user=str1+str2+str3;
						break;
					}
					}
				return user;
		}
		
	private String setEmail(String user) {
		int pos;
		pos = user.indexOf('.');
		return user.charAt(0)+user.substring(pos+1)+"@oracleacademy.Test";
	}
	
	private String setUserName(String name) {
		name = name.toLowerCase();
		return name.replace(' ','.');
	}
		
	private String setName() {
		Scanner in = new Scanner(System.in);
		int charCount =0;
		String name;
		do {
			System.out.print("Por favor ingrese su primer nombre y apellido: ");
			name=in.nextLine();
			charCount=countChars(name,' ');
		}
		while(charCount!=1);
		in.close();
		return name;
	}
	
	private int countChars(String str, char ch) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				count++;
		}
		return count;
	}
	
	public String toString() {
		return "Detalle de empleados"
				+"\nNombre   : "+this.name
				+"\nUserName : "+this.username
				+"\nEmail    : "+this.email
				+"\nPassword Inicial :"+this.password;
	}
}