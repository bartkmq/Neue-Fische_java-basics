package de.bartkmq;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static void main() {
        //IO.println("Hello and welcome!");
        //IO.println(1000 * 60);

        byte b = 127; // 2^8
        short s = 280; // 2^16
        int i = 2147483647; // 2^32
        long l = 4294967295L; // 2^64
        //IO.println(b + " " + s + " " + i + " " + l);

        int hex = 0x2A; // Hexadezimal
        int bin = 0b10100; // Binär
        int mitTrenner = 1_000_000; // _ als Trenner für bessere Lesbarkeit

        float f = 3.14f;
        double d = 1.7976931348623157E308d; // ~ 15-17 Nachkommastellen; Standard für Fließkommazahlen
        //IO.println(f + " " + d);

        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        //IO.println(b1.add(b2));

        // standardmäßig false als Klassenvariable; lokale Variablen müssen for benutzung initialisiert werden
        boolean isAdmin = true; // 1 byte

        char c1 = 'a'; // 16 bit Unicode

        // String ist Immutable; Standardwert ist null bei Feldern
        String s1 = Character.toString(c1); // Länge ist maximal unsigned int
        s1 += " test";
        //IO.println(s1);

        // Mathematische Operatoren: +, -, /, *, %

        // Widening: kleinere Ganzzahlen können implizit in größere umgewandelt werden
        int x = 1;
        int y = 2;
        double result = (double) x / y;
        //IO.println(result);

        // Narrowing: andersrum muss explizit umgewandelt werden
        // Werteverlust bei narrowing cast
        short s2 = (short) x;

        // Vergleichsoperatoren: ==, !=, >, <

        boolean isEqual = 5 <= 5;
        //IO.println(isEqual);

        // Logische Operatoren: &&, ||, !
        int age = 10;
        boolean isTeenager = age >= 13 && age <= 18;
        //IO.println(isTeenager);

        int power = 50;
        int health = 20;
        boolean isGameOver = power <= 0 || health <= 0;
        //IO.println(isGameOver);

        // Typinterferenz für lokale Variablen
        var test = 5;

        Scanner scanner = new Scanner(System.in);
//        IO.print("Enter username: ");
//        String username = scanner.nextLine();
//
//        IO.println("Willkommen " + username + " (:");
//        IO.println();
//
//        int sizeRow = username.length() + 1;
//        String placeholderRow = " ".repeat(sizeRow <= 4 ? 1 : sizeRow - 4);
//        String placeholderName = " ".repeat(username.length() < 4 ? 5 - username.length() : 1);
//
//        IO.println("Name" + placeholderRow + "| Alter");
//        IO.println(username + placeholderName + "| " + 30);
//        IO.println();
//
//        IO.println("Live, Laugh, Love");
//        IO.println("Einfach Rechnung: 5 * 25 = " + 5 * 25);

        String name;
        int userAge;
        char favoriteletter;

        IO.println("Bitte gebe deine Daten ein.");

        IO.print("Name: ");
        name = scanner.nextLine();

        IO.print("Alter: ");
        userAge = scanner.nextInt();

        IO.print("Lieblingsbuchstabe: ");
        favoriteletter = scanner.next().charAt(0);

        if (name != null && !name.isBlank()) {
            IO.println(
                    "Hallo " + name + ", " +
                            "dein Lieblingsbuchstabe ist " + favoriteletter +
                            " und du bist " + userAge + " Jahre alt."
            );
        } else {
            IO.println("Ungültiger Name");
        }
        IO.println();

        double r1 = Math.random() * 5;
        double r2 = Math.random() * 5;
        IO.println("Das Ergebnis von " + r1 + " * " + r2 + " ist " +
                (r1 * r2 > 10 ? "größer" : "kleiner gleich") +
                " als 10");
        IO.println();

        Set<Character> vokals = Set.of('a', 'e', 'i', 'o', 'u');
        boolean isVokal = vokals.contains(favoriteletter);
        IO.println("Dein Lieblingsbuchstabe ist " +
                    ((isVokal) ? "ein" : "kein") +
                    " Vokal!"
        );
        IO.println();

        int i1, i2;
        double d1;

        IO.print("Erste Ganzzahl: ");
        i1 = scanner.nextInt();
        IO.print("Zweite Ganzzahl: ");
        i2 = scanner.nextInt();
        IO.print("Fließkommazahl: ");
        d1 = scanner.nextDouble();

        double produkt = i1 * i2 * d1;

        IO.println("Das Produkt der Zahlen " + produkt + " ist " +
                (produkt > 0 ? "positiv" : "negativ oder null") + "."
        );
        IO.println();

        // Vergleichsoperatoren
        // Bei Objekten inkl. String:
        // == prüft, ob zwei Referenzen auf das gleiche Objekt zeigen;
        // .equals() vergleicht Inhalte

        // Operatoren-Priorität (Mathematische Operatoren)
        // 1. Klammern
        // 2. Inkrement/Dekrement
        // 3. Multiplikation, Division, Modulo
        // 4. Addition, Subtraktion

        // logische Operatoren < Vergleichsoperatoren < arithmetische Operatoren

        // bitweise Operatoren
        // keine short circuit evaluation
        boolean result2 = (5 > 3) & (2 < 4);

        // Operator-Priorität (Logische Operatoren)
        // 1. !
        // 2. &&
        // 3. ||

        IO.print("Bitte geben Sie eine Zahl ein: ");
        var zahl = scanner.nextDouble();
        boolean inRange = zahl > 10 && zahl < 20;
        IO.println("Die Zahl ist " +
                    (inRange ? "" : "nicht ") +
                    "im Bereich ]10, 20[.");
        IO.println();

        double ab = Math.random();
        double bb = Math.random();
        double cb = Math.random();
        if ((ab > bb && b <= cb) || cb < 0) {
            IO.println("Kombinierter Vergleich ist wahr.");
        } else {
            IO.println("Kombinierter Vergleich ist falsch.");
        }
        IO.println();

        IO.print("Bist du Mitglied im Verein?: ");
        var isMember = scanner.nextBoolean();
        var allowEntry = isMember && userAge >= 18;
        IO.println(allowEntry ? "Eintritt erlaubt." : "Eintritt verboten!");
        IO.println();

        // If-Else-Statement
        if (isMember) {
            ;
        } else if (allowEntry) {
            ;
        } else {
            ;
        }

        // Null-Sicherheit
        if (name != null && !name.isEmpty()) {
            ;
        }

        // Gleitkommazahlen vorsichtig vergleichen
        double gx = 0.1 + 0.2;
        double eps = 1e-9;
        if (Math.abs(gx - 0.3) < eps) {
            IO.println("Nahe genug.");
        }

        // Guard clauses (early return)
        if (!allowEntry) {
            ; // return;
        }

        // Methoden in Java
        // Ziel -> Strukturierung, Wiederverwendung, Lesbarkeit

        // Syntax: <Zugriffsmodifikator> <statisch oder nicht> <Rückgabetyp> <Methodenname>(<Parameterliste>) {}

        // Zugriffsmodifikatoren
        // public, private, protected (nur im Paket oder Unterklasse sichtbar), keiner (paketweit sichtbar)

        // static oder nicht
        // static: gehört zur Klasse
        // nicht static: gehört zu einem Object, erfordert eine Instanz der Klasse

        // Rückgabetyp
        // void: kein Wert
        // beliebiger Datentyp

        // Methodenname
        // -> sollte beschreibend sein
        // -> camelCase

        // Parameterliste
        // () : keine Parameter
        // (int a, float b) : mehrere Parameter durch Kommas getrennt

        // Deklaration: beschreibt die Methode
        // Aufruf: führt die Methode aus

        // return-Statement
        // Methoden ohne Rückgabewert verwenden void
        // return zur vorzeitigen beendigung trotzdem möglich

        // wenn nicht void:
        // jeder Ausführungspfad muss mit einem return enden
    }

    private static int addNumbers(int a, int b) {
        return a + b;
    }

    private static double calcArea(double a, double b) {
        return a * b;
    }

    private static void checkPositive(double x)   {
        if (x <= 0) {
           IO.println("Zahl ist negativ.");
           return;
        }
    }

    private static double divide(double a, double b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Teilen durch Null!");
        }
        return a / b;
    }
}
