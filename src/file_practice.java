import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class file_practice {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        
        File file = new File("java_practice.txt.txt");
        // File file = new File("C:\\Users\\DELL\\Desktop");

        if(file.exists()){
            System.out.println("The file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete();
        }
        else{
            System.out.println("The filedoes not exist");
        }

        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are Red \nVoilets are blue");
            writer.append("Poem by bro");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        try{
            FileReader reader = new FileReader("poem.txt");
            int data = reader.read();
            while(data != -1){
                System.out.println((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        File file_2 = new File("xyz.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file_2);

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while(!response.equals("Q")){   
            System.out.println("P = Play , S = Stop , R = Reset , Q = quit");
            System.out.println("Enter your choice : ");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"):
                    clip.start();
                    break;

                case ("S"):
                    clip.stop();
                    break;

                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;

                case ("Q"):
                    clip.close();
                    break;
            
                default:
                    System.out.println("Not a valid response");
                    break;
            }
        }
        clip.start();
    }
}
