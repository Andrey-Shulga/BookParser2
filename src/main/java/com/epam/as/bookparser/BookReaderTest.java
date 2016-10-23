package com.epam.as.bookparser;

import com.epam.as.bookparser.entity.Text;
import com.epam.as.bookparser.service.FileReader;
import com.epam.as.bookparser.service.FileWriter;

import java.io.IOException;

/**
 * This program parses book (from text file) into its separate parts.
 *
 * @author Andrey Shulga
 * @version 1.0.0 2016-10-24
 */
public class BookReaderTest {
    public static void main(String[] args) throws IOException {

        String inputBookFilename = "book.txt";
        String outParagraphsFilename = "bookParagraphs.txt";


        FileReader reader = new FileReader();
        FileWriter writer = new FileWriter();

        //Read a text from the book
        String fileText = reader.getTextFromFile(inputBookFilename);
        Text text = new Text(fileText);

        //Write all parsed paragraphs to file
        writer.writeToFile(text.getTextParts(), outParagraphsFilename);

    }
}