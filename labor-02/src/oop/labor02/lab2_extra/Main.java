package oop.labor02.lab2_extra;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String[]> movies = readMoviesFromFile(); // Filmek beolvasása fájlból egy listába

        Scanner inputScanner = new Scanner(System.in); // Felhasználói bemenethez Scanner
        System.out.println("Szeretnél új filmet hozzáadni? (igen/nem)");
        String response = inputScanner.nextLine().toLowerCase(); // Bemenet olvasása és kisbetűssé alakítása

        if (response.equals("igen")) { // Ha a felhasználó "igen"-t ír
            addNewMovie(movies, inputScanner); // Új film hozzáadása
            saveMoviesToFile(movies); // Frissített lista mentése fájlba
        }
        // Kiírjuk az összes filmet
        System.out.println("\nAz adatbázisban lévő filmek:");
        for (String[] movie : movies) {
            printMovie(movie);
        }
        inputScanner.close();
    }

    // 1. Filmek beolvasása a fájlból
    public static List<String[]> readMoviesFromFile() {
        List<String[]> movies = new ArrayList<>(); // Létrehozunk egy listát a filmek tárolására
        try {
            File file = new File("movies.txt"); // Megnyitjuk a movies.txt fájlt
            if (!file.exists()) return movies; // Ha a fájl nem létezik, üres listát adunk vissza

            Scanner scanner = new Scanner(file); // Scanner objektum a fájl olvasásához
            while (scanner.hasNextLine()) { // Amíg van sor a fájlban
                String line = scanner.nextLine().trim(); // Beolvasunk egy sort és levágjuk a felesleges szóközöket
                if (line.isEmpty()) continue; // Üres sorokat kihagyunk

                String[] data = line.split(","); // Feldaraboljuk a sort vessző mentén
                if (data.length < 5) continue; // Ha nincs elég adat, kihagyjuk a sort

                movies.add(data); // Hozzáadjuk a filmet a listához
            }
            scanner.close(); // Scanner lezárása
        } catch (FileNotFoundException e) { // Ha a fájl nem található, hibát írunk ki
            System.out.println("Hiba: A fájl nem található!");
        }
        return movies; // Visszaadjuk a beolvasott filmek listáját
    }

    // 2. Új film hozzáadása a listához
    public static void addNewMovie(List<String[]> movies, Scanner inputScanner) {
        System.out.println("Add meg a film címét:");
        String title = inputScanner.nextLine();
        System.out.println("Add meg a rendező nevét:");
        String director = inputScanner.nextLine();
        System.out.println("Add meg a megjelenési évet:");
        int releaseYear = Integer.parseInt(inputScanner.nextLine());
        System.out.println("Add meg az értékelést:");
        double rating = Double.parseDouble(inputScanner.nextLine());
        System.out.println("Add meg a műfajt:");
        String genre = inputScanner.nextLine();
        // Új film tömbként tárolása
        String[] newMovie = {title, director, String.valueOf(releaseYear), String.valueOf(rating), genre};
        movies.add(newMovie); // Hozzáadjuk a listához
    }

    // 3. Filmek mentése a fájlba
    public static void saveMoviesToFile(List<String[]> movies) {
        try {
            FileWriter writer = new FileWriter("movies.txt"); // Fájl megnyitása írásra
            for (String[] movie : movies) { // Végigmegyünk az összes filmen
                writer.write(String.join(",", movie) + "\n"); // Kiírjuk őket a fájlba vesszővel elválasztva
            }
            writer.close(); // Fájl bezárása
        } catch (IOException e) { // Ha valami hiba történik írás közben
            System.out.println("Hiba történt a fájl mentése közben.");
        }
    }

    // 4. Film adatainak kiírása
    public static void printMovie(String[] movie) {
        System.out.println("Cím: " + movie[0]);
        System.out.println("Rendező: " + movie[1]);
        System.out.println("Megjelenési év: " + movie[2]);
        System.out.println("Értékelés: " + movie[3]);
        System.out.println("Műfaj: " + movie[4]);
        System.out.println();
    }
}

