
import java.util.Locale;
import java.util.Scanner;
import java.util.Objects;
import org.apache.commons.lang3.math.NumberUtils;

public class Ejercicio1AreaPerimetroRectang {

    public static boolean isValidNum(String userInput) {
        if (userInput.isBlank()) {
            showWarningBlank();
            return false;
        } else if (userInput.matches("^\\s*-\\s*\\d+.*$")) {
            showWarningNegative();
            return false;
        } else if (userInput.matches("^\\d+\\s+\\d+\\s*(\\.\\s*\\d+.*)?$")) {
            showWarningSpaces();
            return false;
        } else if (!NumberUtils.isCreatable(userInput.replace(" ", ""))) {
            showWarningLetters();
            return false;
        } else {
            return true;
        }
    }

    public static Number convertStringToNum(String userInput) {
        if (isValidNum(userInput)) {
            userInput = userInput.replaceAll("\\s", "");
            Scanner userInputScanner = new Scanner(userInput);
            userInputScanner.useLocale(Locale.US);
            if (userInputScanner.hasNextInt()) {
                return Integer.valueOf(userInput);
            } else if (userInputScanner.hasNextFloat()) {
                return Float.valueOf(userInput);
            } else {
                System.out.println("ERROR: conversion");
                return null;
            }
        } else {
            return null;
        }
    }

    public static Number getUserNum(String prompt_message) {
        Number userNumber;
        while (true) {
            if (prompt_message.equals(constBase)) {
                showMessageBase();
            } else if (prompt_message.equals(constAltura)) {
                showMessageAltura();
            }
            userNumber = convertStringToNum(userKeyboard.nextLine().trim());
            if (Objects.nonNull(userNumber)) {
                return userNumber;
            }
        }
    }

    public static int calculateArea(int base, int altura) {
        return base * altura;
    }

    public static float calculateArea(float base, float altura) {
        return base * altura;
    }

    public static int calculatePerimeter(int base, int altura) {
        return 2 * (base + altura);
    }

    public static float calculatePerimeter(float base, float altura) {
        return 2 * (base + altura);
    }

    public static void showAreaResult(int area) {
        System.out.println("Área: " + area);
    }

    public static void showAreaResult(float area) {
        System.out.println("Área: " + area);
    }

    public static void showPerimeterResult(int perimetro) {
        System.out.println("Perímetro: " + perimetro);
    }

    public static void showPerimeterResult(float perimetro) {
        System.out.println("Perímetro: " + perimetro);
    }

    public static void showResults(Number base, Number altura) {
        System.out.println("\n- Resultados - ");
        if (base instanceof Integer && altura instanceof Integer) {
            showAreaResult(calculateArea(base.intValue(), altura.intValue()));
            showPerimeterResult(calculatePerimeter(base.intValue(), altura.intValue()));
        } else if (base instanceof Float || altura instanceof Float) {
            showAreaResult(calculateArea(base.floatValue(), altura.floatValue()));
            showPerimeterResult(calculatePerimeter(base.floatValue(), altura.floatValue()));
        } else {
            showErrorUnexpected();
        }
    }

    public static void showMessageBase() {
        System.out.print("Base: ");
    }

    public static void showMessageAltura() {
        System.out.print("Altura: ");
    }

    public static void showMessageIntro() {
        System.out.println("Ingrese la base y la altura del rectangulo");
    }

    public static void showWarningBlank() {
        System.out.println("\n (!) No puedes dejar en blanco");
    }

    public static void showWarningNegative() {
        System.out.println("\n (!) El número no puede ser negativo");
    }

    public static void showWarningLetters() {
        System.out.println("\n (!) No puedes ingresar caracteres");
    }

    public static void showWarningSpaces() {
        System.out.println("\n (!) El número no puede contener espacios");
    }

    public static void showErrorUnexpected() {
        System.out.println("\n (!) ERROR INESPERADO");
    }

    static String constBase = "base";
    static String constAltura = "altura";
    static Scanner userKeyboard = new Scanner(System.in);

    public static void main(String[] args) {
        showMessageIntro();
        showResults(getUserNum(constBase), getUserNum(constAltura));
    }
}
