import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    // 1
    public static int findMax(int a, int b) throws Exception {
        if (a == b){
            throw new Exception("Числа равны");
        }
        return Math.max(a, b);
    }

    // 2
    public static double divide(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("Деление на ноль недопустимо");
        }
        return a / b;
    }

    //3
    public static int convertToInt(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }

    //4
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Недопустимый возраст");
        }
        else{
            System.out.println("Допустимый возраст");
        }
    }

    //5
    public static double sqrt(double num) throws IllegalArgumentException {
        if (num < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        else {
            return Math.sqrt(num);
        }
    }

    //6
    public static int factorial(int num) throws IllegalArgumentException {
        if (num < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        else if (num == 0){
            return 1;
        }
        else {
            return num * factorial(num - 1);
        }
    }

    //7
    public static void checkForZeros(int[] arr) throws Exception {
        for (int i : arr){
            if (i == 0) {
                throw new Exception("Массив содержит нули");
            }
        }
        System.out.println("Массив не содержит нули");
    }

    //8
    public static int pow(int num, int exp) throws IllegalArgumentException {
        if (exp < 0){
            throw new IllegalArgumentException("Отрицательная степень недопустима");
        }
        else{
            int ans = 1;
            for (int i = 0; i < exp; i++){
                ans *= num;
            }
            return ans;
        }
    }

    //9
    public static String truncateString(String str, int len) throws Exception {
        if (len > str.length()){
            throw new Exception("Число символов не может быть больше длины строки");
        }
        else{
            String ans = "";
            for (int i = 0; i < len; i++){
                ans += str.charAt(i);
            }
            return ans;
        }
    }

    //10
    public static int findElement(int[] arr, int element) throws Exception {
        for (int i = 0; i < arr.length; i++){
            if (element == arr[i]){
                return i;
            }
        }
        throw new Exception("Элемент не найден");
    }

    //11
    public static String toBinaryString(int num) throws IllegalArgumentException{
        if (num < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        if (num == 0){
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        int remainder;
        while (num > 0){
            remainder = num % 2;
            ans.insert(0, remainder);
            num = num / 2;
        }
        return ans.toString();
    }

    //12
    public static boolean isDivisible(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a % b == 0;
    }

    //13
    public static <T> T getElement(List<T> list, int index) throws IndexOutOfBoundsException{
        if (index < 0 || index >= list.size()){
            throw new ArrayIndexOutOfBoundsException("Индекс выходит за пределы списка");
        }
        else {
            return list.get(index);
        }
    }

    //14
    public static class WeakPasswordException extends Exception {
        public WeakPasswordException(String message) {
            super(message);
        }
    }

    public static void checkPasswordStrength(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Пароль слишком слабый");
        }
        else{
            System.out.println("Хороший пароль");
        }

    }

    //15
    public static void checkDate(String date) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        formatter.parse(date);
        System.out.println("Формат даты корректен");
    }

    //16
    public static String concatenateStrings(String first, String second) throws NullPointerException {
        if (first == null || second == null){
            throw new NullPointerException("Одна из строк равна null");
        }
        else{
            return first + second;
        }
    }

    //17
    public static double remainder(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("Деление на ноль недопустимо");
        }
        return a % b;
    }

    //18
    public static double squareRoot(double num) throws Exception {
        if (num < 0) {
            throw new Exception("Число не может быть отрицательным");
        }
        else {
            return Math.sqrt(num);
        }
    }

    //19
    public static double celsiusToFahrenheit(double celsius) throws Exception {
        if (celsius < -273.15) {
            throw new Exception("Температура ниже абсолютного нуля");
        }
        return celsius * 9 / 5 + 32;
    }

    //20
    public static void checkString(String str) throws Exception {
        if (Objects.equals(str, "") || str == null){
            throw new Exception("Строка пустая или равна null");
        }
        else{
            System.out.println("Строка не равна null и непустая");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int choice;
            do {
                System.out.print("Выберете номер задания (1-20, 0 - выход): ");
                choice = in.nextInt();
                in.nextLine();
                switch (choice) {
                    case 0: {
                        System.out.println("Завершение работы");
                        break;
                    }
                    case 1: {
                        System.out.print("Введите первое число: ");
                        int a = in.nextInt();
                        System.out.print("Введите второе число: ");
                        int b = in.nextInt();
                        System.out.println("Максимальное число: " + findMax(a, b));
                        break;
                    }
                    case 2: {
                        System.out.print("Введите первое число: ");
                        double a = in.nextDouble();
                        System.out.print("Введите второе число: ");
                        double b = in.nextDouble();
                        System.out.printf("%f / %f = %f%n", a, b, divide(a, b));
                        break;
                    }
                    case 3: {
                        System.out.print("Введите строку для конвертации в число: ");
                        String str = in.nextLine();
                        System.out.println("Результат конвертации: " + convertToInt(str));
                        break;
                    }
                    case 4: {
                        System.out.print("Введите возраст: ");
                        int age = in.nextInt();
                        checkAge(age);
                        break;
                    }
                    case 5: {
                        System.out.print("Введите число: ");
                        double num = in.nextDouble();
                        System.out.printf("√%f = %f%n", num, sqrt(num));
                        break;
                    }
                    case 6: {
                        System.out.print("Введите число: ");
                        int num = in.nextInt();
                        System.out.printf("%d! = %d%n", num, factorial(num));
                        break;
                    }
                    case 7: {
                        System.out.print("Введите размер массива: ");
                        int size = in.nextInt();
                        int[] arr = new int[size];
                        for (int i = 0; i < size; i++) {
                            System.out.printf("Введите %dй элемент массива: ", i + 1);
                            arr[i] = in.nextInt();
                        }
                        checkForZeros(arr);
                        break;
                    }
                    case 8: {
                        System.out.print("Введите число: ");
                        int num = in.nextInt();
                        System.out.print("Введите степень: ");
                        int exp = in.nextInt();
                        System.out.println(pow(num, exp));
                        break;
                    }
                    case 9: {
                        System.out.print("Введите строку: ");
                        String str = in.nextLine();
                        System.out.print("Введите число символов: ");
                        int len = in.nextInt();
                        System.out.println(truncateString(str, len));
                        break;
                    }
                    case 10: {
                        System.out.print("Введите размер массива: ");
                        int size = in.nextInt();
                        int[] arr = new int[size];
                        for (int i = 0; i < size; i++) {
                            System.out.printf("Введите %dй элемент массива: ", i + 1);
                            arr[i] = in.nextInt();
                        }
                        System.out.print("Введите элемент для поиска: ");
                        int element = in.nextInt();
                        System.out.printf("Элемент %d найден на позиции %d%n", element, findElement(arr, element));
                        break;
                    }
                    case 11: {
                        System.out.print("Введите число: ");
                        int num = in.nextInt();
                        System.out.printf("Число %d в двоичной системе: %s%n", num, toBinaryString(num));
                        break;
                    }
                    case 12: {
                        System.out.print("Введите первое число: ");
                        double a = in.nextDouble();
                        System.out.print("Введите второе число: ");
                        double b = in.nextDouble();
                        if (isDivisible(a, b)) {
                            System.out.printf("%f делится на %f%n", a, b);
                        } else {
                            System.out.printf("%f не делится на %f%n", a, b);
                        }
                        break;
                    }
                    case 13: {
                        System.out.print("Введите размер списка: ");
                        int size = in.nextInt();
                        List<Integer> list = new ArrayList<>();
                        for (int i = 0; i < size; i++) {
                            System.out.printf("Введите %dй элемент списка: ", i + 1);
                            list.add(in.nextInt());
                        }
                        System.out.print("Введите индекс элемента для поиска: ");
                        int index = in.nextInt();
                        System.out.printf("На позиции %d находится элемент %d%n", index, getElement(list, index));
                        break;
                    }
                    case 14: {
                        System.out.print("Введите пароль: ");
                        String password = in.nextLine();
                        checkPasswordStrength(password);
                        break;
                    }
                    case 15: {
                        System.out.print("Введите дату: ");
                        String date = in.nextLine();
                        checkDate(date);
                        break;
                    }
                    case 16: {
                        System.out.print("Введите первую строку: ");
                        String first = in.nextLine();
                        System.out.print("Введите вторую строку: ");
                        String second = in.nextLine();
                        System.out.println(concatenateStrings(first, second));
                        break;
                    }
                    case 17: {
                        System.out.print("Введите первое число: ");
                        double a = in.nextDouble();
                        System.out.print("Введите второе число: ");
                        double b = in.nextDouble();
                        System.out.printf("Остаток от деления %f на %f: %f%n", a, b, remainder(a, b));
                        break;
                    }
                    case 18: {
                        System.out.print("Введите число: ");
                        double num = in.nextDouble();
                        System.out.printf("Квадратный корень числа %f равен %f%n", num, squareRoot(num));
                        break;
                    }
                    case 19: {
                        System.out.print("Введите температу в градусах Цельсия: ");
                        double celsius = in.nextDouble();
                        System.out.printf("%f°C = %f°F%n", celsius, celsiusToFahrenheit(celsius));
                        break;
                    }
                    case 20: {
                        System.out.print("Введите строку: ");
                        String str = in.nextLine();
                        checkString(str);
                        break;
                    }
                    default: {
                        throw new Exception("Неверный номер задания");
                    }
                }
            } while (choice != 0);
        }
        catch (Exception e){
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}