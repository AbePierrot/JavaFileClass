package com.collabera.fileclass;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileClassTutorial {
		//prompt the user for file name and create a file with the name provided in the current working directory
		public void createNewFile(){
			Scanner input= new Scanner(System.in); 
			System.out.print("Please provide name for file you're creating: ");
			String  inputFileName= input.next();
			
			//[IMPLEMENT] creating a new file and add try catch block to catch exception 
			try {
				File creatingNewFile = new File (inputFileName);
				if (creatingNewFile.createNewFile()) {
					System.out.println("File created");
				}else {
					System.out.println("File already exist");
				}
			}catch(IOException e) {
				System.out.println(e);
			}
		}
		
		//prompt user for file name to delete 
		public void deleteFile() {
			Scanner input = new Scanner (System.in);
			System.out.print("Enter name of file you would like to delete: ");
			String userInput= input.next();

				File deletingFile= new File (userInput);
				
				if (deletingFile.delete()) {
					System.out.println("file deleted");
					System.out.println();
				}else {
					System.out.println("file doesn't exist");
				}	
		}
		
		
		public void canRead() {
			File isFileReadable = new File ("abe&chris");
			if (isFileReadable.canRead()) {
				System.out.println("File is readable");
			}else {
				System.out.println("File is not readable");
			}		
		}
		
		public void canWrite() {
			File isFileWritable = new File ("abe&chris");
			if(isFileWritable.canWrite()) {
				System.out.println("File is writable ");
			}else {
				System.out.println("File is not writable");
			}
		}
		
		public void exist() {
			File isExistable= new File ("abe&chris");
			if (isExistable.exists()) {
				System.out.println("File exist");
			}else {
				System.out.println("file doesn't exist");
			}
		}
		
		public void getFileName() {
			File getFileName= new File ("abe&chris");
			 System.out.println(getFileName.getName()); 
		}
		
		public void getFileAbsolutePath() {
			File fileAbsolutePath= new File("abe&chris");
			System.out.println(fileAbsolutePath.getAbsolutePath());
		}
		
		public void getFileLength() {
			File file= new File ("abe&chris");
			System.out.println(file.length());	
		}
		
		//pass it a directory make sure its a directory and 
		public void getFileList() {
			File file= new File("abe&chris");
			System.out.println(file.list());
		}
		
		public void makeNewDirectory() {
				 File file= new File("newDir");
				 if (file.mkdir()) {
					 System.out.println("directory is created ");
				 }else {
					 System.out.println("directory can't be created");
				 } 
		}
		
		
		
		public static void main(String[] args) {

			boolean isValidInput=true;
			boolean isExitProgram=true;
			
		    FileClassTutorial test = new FileClassTutorial();
		    test.makeNewDirectory();

		
			while (isExitProgram){
				do {
					//program menu option 
					System.out.println();
					System.out.println("        Menu  ");
					System.out.println();
					System.out.println(" 1) Create new file ");
					System.out.println(" 2) delete file ");
					System.out.println(" 4) Check if file is readable");
					System.out.println(" 5) Check if the");
					System.out.println(" 3) exit program ");
					System.out.println();
					System.out.print("Please choose an option:");

					FileClassTutorial files = new FileClassTutorial();
					
					Scanner input = new Scanner (System.in);
					int userInput= input.nextInt();
					switch(userInput) {
					case 1:
						files.createNewFile();
						break;
					case 2:
						files.deleteFile();
						break;
					case 3:
						isExitProgram=false;
						break;
					default:
					     isValidInput=false;
					     break;
					}
				}while (!isValidInput );	
			}
		}
	}

