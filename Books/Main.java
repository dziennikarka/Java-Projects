
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList <Kirja> kirjat = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        
        while(true){
            System.out.println("Nimi: ");
            String name = reader.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Sivuja: ");
            int pages = Integer.valueOf(reader.nextLine());
            
            System.out.println("Kirjoitusvuosi: ");
            int year = Integer.valueOf(reader.nextLine());
            
            kirjat.add(new Kirja(name, pages, year));        
            
        }
        
        System.out.println("Mitä tulostetaan?");
        String answer = reader.nextLine(); 
        
        if(answer.equals("kaikki")){
            for (Kirja kirja:kirjat){
                System.out.println(kirja);
            }     
        }
        
        if(answer.equals("nimi")){
            for(Kirja kirja:kirjat){
                System.out.println(kirja.getNimi());
            }
        }

    }
}
