import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;

public class ShortLister {
    public static void main(String[] args) throws IOException
    {
        ShortWordFilter shortWord = new ShortWordFilter();

        System.out.println("Choose a file:");

        JFileChooser fileChoose = new JFileChooser();

        try {
            File workingDirectory = new File(System.getProperty("user.dir"));

            fileChoose.setCurrentDirectory(workingDirectory);

        if(fileChoose.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File toImport = fileChoose.getSelectedFile();
            Path file = toImport.toPath();
            System.out.println("\nWords that are 5 equal to or fewer than five characters: ");
            InputStream in = new BufferedInputStream(Files.newInputStream(file, CREATE));
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            while(reader.ready())
            {
                String word = reader.readLine();

                if(!(shortWord.accept(word)))
                {
                    System.out.println(word);
                }
            }
            reader.close();
        }
        else
        {
            System.out.println("Failed to choose file. Try again.");
            System.exit(0);
        }
    } catch (FileNotFoundException e) {
        System.out.println("File not found!!!");
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}