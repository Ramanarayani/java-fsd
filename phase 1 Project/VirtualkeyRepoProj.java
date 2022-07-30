package AssistedProjects;

import java.util.*;
import java.io.File;

public class VirtualkeyRepoProj {
	public static File folder = new File("C:\\Users\\Dell\\eclipse-workspace\\AssitedPractice\\src\\AssistedProjects");

	public static void main(String[] args) {
		System.out.println("WELCOME TO LockedMe.com\n");
		System.out.println("Developer Details: Ramanarayani M\temp id: 1234567");
		System.out.println();
		optionSelections();
	}

	public static void optionSelections() {

		System.out.println("Enter the operation you need to perform: \n");
		String[] arr = { "1. Display file names in an ascending order.",
				"2. Manipulate the files. ", "3. Exit." };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		switch (k) {
		case 1:
			File[] a = folder.listFiles();
			Arrays.sort(a);

			for (int i = 0; i < a.length; i++) 
				System.out.println(a[i]);
				optionSelections();
			break;
		case 2:
			boolean t = true;
			while (t) {
				System.out.println("Enter the operation you need to perform: \n");
				System.out.println(" 1 : To Add a file in the existing Directory");
				System.out.println(" 2 : To Delete a specific file from  Directory. ");
				System.out.println(" 3 : To Search a specific file.");
				System.out.println(" 4 : Navigate back to the main menu");

				int j = sc.nextInt();
				switch (j) {
				case 1:
					System.out.println("please enter the file name to add to the directory");
					String s = sc.next();
					File file = new File(folder, s);

					try {
						boolean value = file.createNewFile();
						if (value) {
							System.out.println("The new file is created with the name :"+file.getName()+"\n");
						} else {
							System.out.println("The file already exists.");
						}
					} catch (Exception e) {
						e.getStackTrace();
					}
					break;
				case 2:
					System.out.println("please enter the file name to delete from the directory");
					String name = sc.next();
					File file1 = new File(folder, name);

					try {
						boolean value = file1.delete();
						if (value) {
							System.out.println("deleted successfully.\n");
						} else {
							System.out.println("File Not Found\n");
						}
					} catch (Exception e) {
						e.getStackTrace();
					}
					break;
				case 3:
					System.out.println("Enter a filename you want to search");
					String search = sc.next();
					boolean flag1 = false;
					File arr1[] = folder.listFiles();
					for (int i = 0; i < arr1.length; i++) {
						if (arr1[i].getName().startsWith(search)) {
							flag1 = true;
							System.out.println("file is found @ : "+arr1[i]);
						}
					}
					if (flag1 == false) {
						System.out.println("No file found");
					}
					
					

					break;
				case 4:
					t = false;
					optionSelections();
					break;
				default:
					System.out.println("You have made an invalid choice!");
					}
			}
			break;
		case 3:
			System.out.println("Thank you!!\n");
			break;
		default:
			System.out.println("You have made an invalid choice!");
			System.out.println("please enter valid option");
			optionSelections();
			break;

		}

	}

}
