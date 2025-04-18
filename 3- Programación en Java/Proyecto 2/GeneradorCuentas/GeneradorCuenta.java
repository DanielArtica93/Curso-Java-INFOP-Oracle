package GeneradorCuentas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GeneradorCuenta {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Empleado emp = new Empleado();
		serializeData(emp);
		Empleado emp2 = (Empleado) deSerialize();
		System.out.println(emp2);
	}

	public static Object deSerialize() throws ClassNotFoundException{
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("empleado.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			return
					ois.readObject();
		}
		catch (IOException i) {
			i.printStackTrace();
			return null;
		}
	}


 static void serializeData(Empleado emp) {
		// TODO Auto-generated method stub
		try(
				FileOutputStream fos = new FileOutputStream("empleado.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);)
		{
			oos.writeObject(emp);
			System.out.print("Datos serealizado salvados en empleado, ");
		}
		catch (IOException i) {
			i.printStackTrace();
	}
	}

}