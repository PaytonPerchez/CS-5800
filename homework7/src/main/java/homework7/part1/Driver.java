package homework7.part1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import homework7.part1.flyweights.CharacterFlyweight;

public class Driver {

	private static ArrayList<CharacterProperties> characterProperties = new ArrayList<CharacterProperties>();
	private static ArrayList<CharacterFlyweight> characters = new ArrayList<CharacterFlyweight>();
	
	private static FontFactory fontFactory = new FontFactory();
	private static ColorFactory colorFactory = new ColorFactory();
	private static SizeFactory sizeFactory = new SizeFactory();
	private static CharacterFactory characterFactory = new CharacterFactory();
	
	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * File Format:
		 * 
		 * 'fontIndex' + 'colorIndex' + 'sizeIndex'
		 * Raw characters
		 * 'fontIndex' + 'colorIndex' + 'sizeIndex'
		 * Raw characters
		 * ...
		 */
		String filePath = "C:/Users/payto/Desktop/School Stuff/test_document.txt";
		
		// Load file and print contents
		loadFile(filePath);
		printState();
		
		// Append 'Hello' in Arial, Blue, and size 12
		appendString(
			"Hello",
			new CharacterProperties(
				fontFactory.getFont(0),
				colorFactory.getColor(1),
				sizeFactory.getSize(0)
			)
		);
		
		// Append 'World' in Calibri, Red, and size 16
		appendString(
			"World",
			new CharacterProperties(
				fontFactory.getFont(1),
				colorFactory.getColor(0),
				sizeFactory.getSize(2)
			)
		);
		
		// Append 'CS' in Arial, Black, and size 14
		appendString(
			"CS",
			new CharacterProperties(
				fontFactory.getFont(0),
				colorFactory.getColor(2),
				sizeFactory.getSize(1)
			)
		);
		
		// Append '5800' in Verdana, Black, and size 14
		appendString(
			"5800",
			new CharacterProperties(
				fontFactory.getFont(2),
				colorFactory.getColor(2),
				sizeFactory.getSize(1)
			)
		);
		
		// Write changes to the file
		saveFile(filePath);
	}
	
	private static void appendString(String string, CharacterProperties properties) {
		// Store given characters
		for(Character character : string.toCharArray()) {
			characters.add(characterFactory.getCharacter(character));
		}
		
		// Assign properties to given characters
		properties.incrementRunLength(string.length());
		characterProperties.add(properties);
	}
	
	private static void printState() {
		int characterIndex = 0;
		
		for(CharacterProperties properties : characterProperties) {
			// Display properties
			System.out.println(properties.toString());
			
			// Display characters for which the properties apply
			for(int i = 0; i < properties.getRunLength(); i++) {
				System.out.print(characters.get(characterIndex + i).getChar());
			}
			System.out.println();
			
			characterIndex += properties.getRunLength();
		}
	}
	
	private static void loadFile(String filePath) {
		File file = new File(filePath);
		Scanner inputFile = null;
		
		try {
			inputFile = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Specified file does not exist.");
			System.exit(0);
		}
		
		characterProperties.clear();
		characters.clear();
		
		String currentLine;
		int fontIndex;
		int colorIndex;
		int sizeIndex;
		int currentRunLength;
		
		while(inputFile.hasNext()) {
			currentLine = inputFile.nextLine();
			
			fontIndex = Character.getNumericValue(currentLine.charAt(0));
			colorIndex = Character.getNumericValue(currentLine.charAt(1));
			sizeIndex = Character.getNumericValue(currentLine.charAt(2));
			
			CharacterProperties newProperties = new CharacterProperties(
				fontFactory.getFont(fontIndex),
				colorFactory.getColor(colorIndex),
				sizeFactory.getSize(sizeIndex)
			);
			
			if(inputFile.hasNext()) {
				currentLine = inputFile.nextLine();
				
				currentRunLength = 0;
				
				for(Character character : currentLine.toCharArray()) {
					characters.add(characterFactory.getCharacter(character));
					currentRunLength++;
				}
				
				newProperties.incrementRunLength(currentRunLength);
			} else {
				System.out.println("File format error detected");
			}
			
			characterProperties.add(newProperties);
		}
		
		inputFile.close();
	}
	
	private static boolean saveFile(String filePath) {
		PrintWriter outputFile;
		
		try {
			outputFile = new PrintWriter(new File(filePath));
		} catch (FileNotFoundException e) {
			return false;
		}
		
		int currentIndex = 0;
		
		for(CharacterProperties properties : characterProperties) {
			
			outputFile.print(Arrays.asList(Fonts.values()).indexOf(properties.getFont().getFont()));
			outputFile.print(Arrays.asList(Colors.values()).indexOf(properties.getColor().getColor()));
			outputFile.println(Arrays.asList(Sizes.values()).indexOf(properties.getSize().getSize()));
			
			for(int i = 0; i < properties.getRunLength(); i++) {
				outputFile.print(characters.get(currentIndex).getChar());
				currentIndex++;
			}
			
			outputFile.println();
		}
		
		outputFile.close();
		return true;
	}
}
