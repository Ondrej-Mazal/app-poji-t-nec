import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.lang.Integer;
public class Databaze {
    private ArrayList<Pojistenec> zaznamy = new ArrayList<>();
    private Pojistenec aktualniZaznam;
    Scanner sc = new Scanner(System.in);


    public void Program() {
        System.out.println("_____________________");
        System.out.println("EVIDENCE POJIŠTĚNCE");
        System.out.println("_____________________");
        String prikaz = "";
        Menu();


        while (!prikaz.equals("4")) {

            System.out.println("Zadajte příkaz: ");
            prikaz = sc.nextLine();

            switch (prikaz) {
                case "1":
                    PridejPojistence();
                    break;
                case "2":
                    VypisPojistencu();
                    if (zaznamy == null) {
                        System.out.println("Záznam pojištěnce je prázdný");
                    }
                    break;
                case "3":
                    VyhledejPojistence(zaznamy);
                    break;
                case "4":
                    System.out.println("Ukončuji program");
                    break;
                default:
                    System.out.println("Neplatný příkaz");

            }
        }
    }

    //MENU
    void Menu() {
        System.out.println("Registrování nového pojištěnce");
        System.out.println("..................................");
        System.out.println("1 - Přidat nového pojištěnce");
        System.out.println("2 - Vypsání všech pojištěnců");
        System.out.println("3 - Vyhledávání pojištěnce");
        System.out.println("4 - Konec");
        System.out.println("..................................");
    }

    //PŘIDÁVÁNÍ POJIŠTĚNCŮ
    void PridejPojistence() {
        //REGISTROVÁNÍ POJIŠTĚNCE
        LocalDate datumVytvoreniPojistence = LocalDate.now();
        System.out.print("Zadajte jméno: ");
        String jmeno = sc.nextLine().trim();

        System.out.print("Zadajte příjmení: ");
        String prijmeni = sc.nextLine().trim();

        System.out.print("Věk: ");
        int vek = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Telefonní číslo: ");
        Long telCislo = Long.parseLong(sc.nextLine().trim());

        //konstruktor pojištěnce
        Pojistenec pojistenec = new Pojistenec(datumVytvoreniPojistence, jmeno, prijmeni, vek, telCislo);
        //kontrola věku

        if ((vek > 0) && (vek < 100)) {

            System.out.println("Pojištěnec byl registrovaný.");
            zaznamy.add(pojistenec);
        } else System.out.println("Chyba při zadání věku, akci opakujte znovu prosím");

    }

    //Vypisování pojištěnců
    public void VypisPojistencu() {
        for (int i = 0; i < zaznamy.size(); i++) {
            System.out.println(zaznamy.get(i).toString());
        }
    }

    //Vyhledávání pojištěnců
    void VyhledejPojistence(ArrayList<Pojistenec> zaznamy) {
        System.out.println("Zadajte jmeno a příjmení, které chcete vyhledat");
        String hledaneJmeno = sc.nextLine().trim();
        for (Pojistenec p: zaznamy) {
            if (p.toString().contains(hledaneJmeno)){
                System.out.println(p.toString());
            }
        }
    }
}