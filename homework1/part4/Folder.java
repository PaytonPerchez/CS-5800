package homework1.part4;

import java.util.ArrayList;

public class Folder {

	private String name;
	private ArrayList<File> files;
	private ArrayList<Folder> folders;
	private int sizeInBytes;
	
	public Folder(String name) {
		this.name = name;
		files = new ArrayList<>();
		folders = new ArrayList<>();
		sizeInBytes = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<File> getFiles() {
		return files;
	}
	
	public ArrayList<Folder> getFolders() {
		return folders;
	}
	
	public int getSize() {
		return sizeInBytes;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addFile(File newFile) {
		files.add(newFile);
		sizeInBytes += newFile.getSize();
	}
	
	public void addFolder(Folder newFolder) {
		folders.add(newFolder);
		sizeInBytes += newFolder.getSize();
	}
	
	public void print() {
		print("");
	}
	
	public void print(String indentation) {
		System.out.println(name + " (" + sizeInBytes + " bytes)");
		printFolders(indentation + "  ");
		printFiles(indentation + "  ");
	}
	
	private void printFolders(String indentation) {
		for(Folder folder : folders) {
			System.out.print(indentation);
			folder.print(indentation);
		}
	}
	
	private void printFiles(String indentation) {
		for(File file : files) {
			System.out.println(indentation + file);
		}
	}
	
	public void deleteFile(File file) {
		files.remove(file);
	}
	
	public void deleteFolder(Folder folder) {
		folders.remove(folder);
	}
}
