package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import content.structure.File;
import content.structure.Folder;

class ContentTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		Folder folder1 = new Folder("Folder1");
		Folder folder2 = new Folder("Folder2");
		Folder folder3 = new Folder("Folder3");
		Folder folder4 = new Folder("Folder4");
		
		folder1.add(folder2);
		folder1.add(folder3);
		
		folder3.add(folder4);
		
		File file1 = new File("File1");
		File file2 = new File("File2");
		File file3 = new File("File3");
		File file4 = new File("File4");
		File file5 = new File("File5");
		File file6 = new File("File6");

		
		folder2.add(file1);
		folder2.add(file2);
		
		folder3.add(file3);
		folder3.add(file4);
		folder3.add(file5);
		
		folder4.add(file6);
		
		System.out.println("Erste Ausgabe\n");
		folder1.operation();
		
		folder3.remove(file5);
		folder3.remove(folder4);
		
		System.out.println("Zweite ausgabe\n");
		folder1.operation();
	}

}
