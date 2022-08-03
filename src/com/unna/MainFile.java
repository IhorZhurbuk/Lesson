package com.unna;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) throws FileNotFoundException {
        Path path = Paths.get("D:\\abc\\abd");
        File file = new File(path.toUri());
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            String enter = scanner.nextLine();
            switch (enter) {

                case "..":
                    path = Path.of(path.toString().substring(0, path.toString().lastIndexOf("\\")));
                    file = new File(path.toUri());
                    System.out.println(path);
                    break;

                case "copy":
                    System.out.println(Arrays.toString(file.list()));
                    System.out.println("Choose file");
                    String findTxt = scanner.nextLine();
                    String[] arrFile = file.list();
                    for (int i = 0; i < Objects.requireNonNull(arrFile).length; i++) {
                        if (arrFile[i].equals(findTxt)) {
                            Path path1 = Path.of(path + "\\" + findTxt);
                            try {
                                Files.copy(path1, Paths.get(path1.getParent() + "\\copy__" + path1.getFileName()),
                                        StandardCopyOption.REPLACE_EXISTING);
                                System.out.println("Successful");
                            } catch (Exception e) {
                                System.out.println("Could not copy file in: " + findTxt
                                        + " . Check if the folder or file already exists.");
                            }
                        }
                    }
                    break;
                case "delete":
                    System.out.println(Arrays.toString(file.list()));
                    System.out.println("Choose file to delete");
                    String fileToDelete = scanner.nextLine();
                    File fileDelete = new File(path + "\\" + fileToDelete);
                    if (fileDelete.delete()) {
                        System.out.println("Successful");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case "name": {
                    String newsPath = scanner.nextLine();
                    File move = new File(path + "\\" + newsPath);
                    try {
                        Files.move(file.toPath(), move.toPath());
                        System.out.println("Directory moved successfully.");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    break;
                }
                case "exit":
                    flag = false;
                    break;
                case "dir":
                    String name = scanner.nextLine();
                    new File(path + "\\"  + name).mkdir();
                    break;

                case "read":
                    System.out.println(Arrays.toString(file.list()));
                    System.out.println("Choose file to read");
                    String fileToRead = scanner.nextLine();
                    Scanner sc = new Scanner(new FileReader(path + "\\" + fileToRead));
                    while (sc.hasNext()) {
                        System.out.println(sc.next());
                    }
                    break;
                default:
                    System.out.println(file.getAbsolutePath());
                    break;
            }
        }
    }
}
