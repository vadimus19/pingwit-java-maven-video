package com.pingwit.part_28.homework;

import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SherlockMicrosoftWord {
    public static void main(String[] args) throws Exception {

        XWPFDocument document = new XWPFDocument();
        String font = "Courier";
        createImage(document, Path.of("src/main/java/com/pingwit/part_28/homework/return-sherlock-holmes_1.jpg"));
        createTitle(document, font, "Sherlock");
        createRegularText(document, font, Files.readString(Path.of("src/main/java/com/pingwit/part_28/homework/Sherlock.txt")));
        write(document);

    }

    private static void createTitle(XWPFDocument document, String font, String text) {
        XWPFParagraph title = document.createParagraph();
        title.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun titleRun = title.createRun();
        titleRun.setText(text);
        titleRun.setColor("000000");
        titleRun.setBold(true);
        titleRun.setFontFamily(font);
        titleRun.setFontSize(20);
    }

    private static void createRegularText(XWPFDocument document, String font, String text) {
        XWPFParagraph title = document.createParagraph();
        title.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun subTitleRun = title.createRun();
        subTitleRun.setText(text);
        subTitleRun.setColor("000044");
        subTitleRun.setBold(true);
        subTitleRun.setFontFamily(font);
        subTitleRun.setFontSize(14);
    }

    private static void createImage(XWPFDocument document, Path imagePath) throws Exception {
        XWPFParagraph imageParagraph = document.createParagraph();
        imageParagraph.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun imageRun = imageParagraph.createRun();
        imageRun.addPicture(
                Files.newInputStream(imagePath),
                XWPFDocument.PICTURE_TYPE_JPEG, imagePath.toFile().getName(),
                Units.toEMU(200), Units.toEMU(200)
        );

    }

    private static void write(XWPFDocument document) {
        String currentDirectory = "src/main/java/com/pingwit/part_28/homework";
        String outputFileName = currentDirectory + "Sherlock.docx";

        try (FileOutputStream fos = new FileOutputStream(outputFileName)) {

            document.write(fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
