package com.codewithkarthik.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDemo {

	public static void main(String[] args) throws Exception {
		Save obj1 = new Save();
		
		obj1.i = 25;
		
		File f = new File("object1.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj1);
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj2 = (Save) ois.readObject();
		System.out.println(obj2.i);

	}

}

class Save implements Serializable{
	int i;
}