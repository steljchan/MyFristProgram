import java.util.HashSet; // untuk menyimpan indeks fakta yang sudah ditampilkan agar tidak berulang.
import java.util.Random; //untuk generate angka random
import java.util.Scanner; //untuk baca input user
import java.util.Set; //untuk menyimpan indeks fakta yang sudah ditampilkan agar tidak berulang.

public class MyFirstProgram {
    private static final String[] FUN_FACTS = {
        "Originally made for smart TVs! Java was first developed for home appliances like set-top boxes and interactive TVs.",
        "It wasn’t always called Java! Before being named Java, the language was called Oak, then Green, before settling on Java.",
        "Why 'Java'? The name was inspired by Java coffee (from the island of Java, Indonesia) because the developers drank a lot of coffee while working.",
        "Java’s logo = A coffee cup to honor its name origin.",
        "Java has a mascot named 'Duke'! A triangular-shaped character with hands and feet, designed by Joe Palrang (an animator for Shrek).",
        "One of the longest-surviving programming languages! Java was released in 1995 and is still among the most used languages today.",
        "Android was originally designed for Java! Although Kotlin is now more popular, Java remains the foundation of Android development.",
        "It runs on fridges & cars! Java is used in IoT devices like smart refrigerators, Tesla cars, and ATM systems.",
        "NASA uses Java! Java is used in space missions for processing data from the Hubble Telescope and Mars rovers.",
        "Write Once, Run Anywhere! Thanks to JVM (Java Virtual Machine), Java code can run on almost any platform without modification.",
        "A simple 'Hello, World!' in Java is longer than in Python or JavaScript.",
        "Java has 'Zombie Threads'! When the garbage collector fails to free memory, some threads can remain as 'zombies'.",
        "Minecraft is written in Java! One of the best-selling games of all time was built using Java.",
        "Netflix & Spotify run on Java! Major streaming platforms like Netflix, Spotify, and Twitter use Java in their backend systems.",
        "Java dominates Wall Street! Many financial institutions rely on Java for stock trading and banking systems.",
        "NASA built a Mars rover with Java! The Spirit rover used Java for data processing.",
        "A Java-based computer virus was once attempted! But Java’s security model made it ineffective.",
        "Java can’t create native programs! Unlike C++, Java always requires a JVM to run.",
        "Java has the biggest framework ecosystem! Frameworks like Spring, Hibernate, and Quarkus keep Java relevant in modern development.",
        "Many companies failed to replace Java! Languages like Dart, Kotlin, and Go were meant to replace Java, but Java is still standing strong.",
        "People often typo 'Jave' instead of 'Java'! Even on programming forums, this typo is surprisingly common.",
        "A small Java bug once crashed thousands of applications worldwide! This happened in Java 7 due to a class verification bug."
    };

    // Main program
    // Program ini akan menampilkan funfact tentang Java ke user dengan menyimpan fakta-fakta tersebut dalam array
    // Dan menampilkan funfact tersebut secara acak tanpa ada yang berulang.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Set<Integer> usedIndices = new HashSet<>();

        // ANSI Escape Codes untuk warna background dan teks.
        String RESET = "\u001B[0m";
        String WHITE_BG = "\u001B[47m";  // Background Putih
        String BEIGE_BG = "\u001B[48;5;230m"; // Background Beige
        String LIGHT_BLUE_BG = "\u001B[48;5;117m"; // Background Biru Muda
        String PASTEL_BLUE = "\u001B[38;5;111m"; // Warna Pastel Biru
        String PASTEL_PURPLE = "\u001B[38;5;183m"; // Warna Pastel Ungu 
        String PASTEL_PINK = "\u001B[38;5;211m"; // Warna Pastel Pink
        String PASTEL_GREEN = "\u001B[38;5;120m"; // Warna Pastel Hijau
        String PASTEL_YELLOW = "\u001B[38;5;226m"; // Warna Pastel Kuning

        // Welcome teks ASCII dengan efek warna dari ANSI
        System.out.println(WHITE_BG + PASTEL_BLUE +
            " ██     ██ ███████ ██       ██████   ██████  ███    ███ █████ ");
        System.out.println(WHITE_BG + PASTEL_BLUE +
            " ██     ██ ██      ██      ██       ██    ██ ████  ████ ██    ");
        System.out.println(WHITE_BG + PASTEL_BLUE +
            " ██  █  ██ █████   ██      ██       ██    ██ ██ ████ ██ █████ ");
        System.out.println(WHITE_BG + PASTEL_BLUE +
            " ██ ███ ██ ██      ██      ██       ██    ██ ██  ██  ██ ██    ");
        System.out.println(WHITE_BG + PASTEL_BLUE +
            "  ███ ███  ███████ ███████  ██████   ██████  ██      ██ █████ " + RESET);

        System.out.println(); //Minta nama user
        
        System.out.print(WHITE_BG+ PASTEL_PURPLE + "Can you tell me your name? " + RESET);
        System.out.flush(); // Saya menambahkan ini untuk estetika tampilan agar lebih rapi
        //Jika output tidak segera ditampilkan, warna yang diatur mungkin tidak langsung muncul di terminal.
        //flush() memastikan warna diterapkan sebelum user mengetik input.

        System.out.print(WHITE_BG); 
        String name = scanner.nextLine();
        System.out.print("\r" + RESET);

        System.out.println(); //Menyapa user
        System.out.print(WHITE_BG + PASTEL_GREEN + "Hi, nice to know you, " + RESET);
        System.out.println(WHITE_BG + PASTEL_PINK + name + "!" + RESET);
        System.out.flush(); 
        System.out.print(WHITE_BG);
        System.out.println();
        
        //Tanya apakah user tau apa yang akan dibahas
        System.out.print(BEIGE_BG + PASTEL_PURPLE + "Today I will tell you something! Do you know what it is? (Yes/No): " + RESET);
        System.out.flush(); 

        System.out.print(BEIGE_BG);
        String response = scanner.nextLine().trim().toLowerCase();
        System.out.print("\r" + RESET);

        if (response.equals("no")) {
            System.out.println(BEIGE_BG + PASTEL_PINK + "No?? Did you not read the title? :( But it's okay. I will tell you! It's about Java." + RESET);
        } else {
            System.out.println(BEIGE_BG + PASTEL_BLUE + "Cool! Let's talk about Java! :)" + RESET);
        }

        System.out.println();
        System.out.println(LIGHT_BLUE_BG + PASTEL_PURPLE + "I have some fun facts about Java!" + RESET);
        
        // Mulai tampilkan funfact secara acak
        // Loop akan berhenti jika user tidak ingin melihat funfact lagi
        while (usedIndices.size() < FUN_FACTS.length) {
            int index;
            do {
                index = random.nextInt(FUN_FACTS.length);
            } while (usedIndices.contains(index)); // Hindari funfact yang berulang

            usedIndices.add(index); // Tandai funfact yang sudah ditampilkan
            System.out.println();
            System.out.println(LIGHT_BLUE_BG + PASTEL_PURPLE + "Did you know?" + RESET); 
            System.out.println(LIGHT_BLUE_BG + PASTEL_PINK + FUN_FACTS[index] + RESET);
            System.out.println(); 

            // Tanya apakah user ingin melihat funfact lagi
            System.out.print(WHITE_BG + PASTEL_PURPLE + "Do you want to know more about Java? (Yes/No): ");
            System.out.flush(); 

            System.out.print(WHITE_BG); 
            response = scanner.nextLine().trim().toLowerCase();
            System.out.print("\r" + RESET);

            if (!response.equals("yes")) {
                break;
            }
        }
        System.err.println();
        System.out.println(PASTEL_PURPLE + "Thank you for trying this program!" + RESET); 
        // Menampilkan versi Java yang digunakan
        System.out.println(PASTEL_BLUE + "Your Java version: " + PASTEL_GREEN + System.getProperty("java.version") + RESET);
        
        // Hiasan tambahan ASCII Art
        System.err.println();
        System.out.println(PASTEL_YELLOW + "      |\\      _,,,---,,_");
        System.out.println("ZZZzz /,`.-'`'    -.  ;-;;,_");
        System.out.println("     |,4-  ) )-,_. ,\\ (  `'-'");
        System.out.println("    '---''(_/--'  `-'\\_)" + RESET);
        System.err.println();
        
        scanner.close();
    }
}
