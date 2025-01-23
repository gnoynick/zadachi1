import 'dart:math';
import 'dart:io';

// 1: Класс "Человек"
class Person {
  String name;
  int age;
  String gender;

  Person(this.name, this.age, this.gender);

  void printInfo() {
    print("Name: $name, Age: $age, Gender: $gender");
  }

  void increaseAge() {
    age++;
  }

  void changeName(String newName) {
    name = newName;
  }
}

void task1() {
  var person = Person("John", 25, "Male");
  person.printInfo();
  person.increaseAge();
  person.changeName("John Doe");
  person.printInfo();
}

// 2: Наследование: Класс "Работник" и "Менеджер"
class Worker extends Person {
  double salary;

  Worker(String name, int age, String gender, this.salary) : super(name, age, gender);

  @override
  void printInfo() {
    super.printInfo();
    print("Salary: $salary");
  }
}

class Manager extends Worker {
  List<Worker> subordinates;

  Manager(String name, int age, String gender, double salary, this.subordinates)
      : super(name, age, gender, salary);

  @override
  void printInfo() {
    super.printInfo();
    print("Subordinates: ${subordinates.length}");
  }
}

void task2() {
  var worker = Worker("Alice", 30, "Female", 50000);
  var manager = Manager("Bob", 40, "Male", 100000, [worker]);
  manager.printInfo();
}

// 3: Полиморфизм: Животные
abstract class Animal {
  void makeSound();
}

class Dog implements Animal {
  @override
  void makeSound() {
    print("Woof!");
  }
}

class Cat implements Animal {
  @override
  void makeSound() {
    print("Meow!");
  }
}

class Cow implements Animal {
  @override
  void makeSound() {
    print("Moo!");
  }
}

void task3() {
  List<Animal> animals = [Dog(), Cat(), Cow()];
  for (var animal in animals) {
    animal.makeSound();
  }
}

// 4: Абстрактный класс "Транспорт"
abstract class Transport {
  void move();
}

class Car extends Transport {
  @override
  void move() {
    print("Car is moving");
  }
}

class Bike extends Transport {
  @override
  void move() {
    print("Bike is moving");
  }
}

void task4() {
  Transport car = Car();
  Transport bike = Bike();
  car.move();
  bike.move();
}

// 5: Класс "Книга" и "Библиотека"
class Book {
  String title;
  String author;
  int year;

  Book(this.title, this.author, this.year);
}

class Library {
  List<Book> books = [];

  void addBook(Book book) {
    books.add(book);
  }

  List<Book> findBooksByAuthor(String author) {
    return books.where((book) => book.author == author).toList();
  }

  List<Book> findBooksByYear(int year) {
    return books.where((book) => book.year == year).toList();
  }
}

void task5() {
  var library = Library();
  library.addBook(Book("1984", "George Orwell", 1949));
  library.addBook(Book("Animal Farm", "George Orwell", 1945));
  print(library.findBooksByAuthor("George Orwell").length);
}

// 6: Инкапсуляция: Банк
class BankAccount {
  String _accountNumber;
  double _balance;

  BankAccount(this._accountNumber, this._balance);

  String get accountNumber => _accountNumber;
  double get balance => _balance;

  void deposit(double amount) {
    _balance += amount;
  }

  void withdraw(double amount) {
    if (_balance >= amount) {
      _balance -= amount;
    } else {
      print("Insufficient funds");
    }
  }
}

void task6() {
  var account = BankAccount("123456789", 1000);
  account.deposit(500);
  account.withdraw(200);
  print(account.balance);
}

// 7: Счетчик объектов
class Counter {
  static int _count = 0;

  Counter() {
    _count++;
  }

  static int get count => _count;
}

void task7() {
  var counter1 = Counter();
  var counter2 = Counter();
  print(Counter.count);
}

// 8: Площадь фигур
abstract class Shape {
  double getArea();
}

class Circle extends Shape {
  double radius;

  Circle(this.radius);

  @override
  double getArea() {
    return 3.14 * pow(radius, 2);
  }
}

class Rectangle extends Shape {
  double width;
  double height;

  Rectangle(this.width, this.height);

  @override
  double getArea() {
    return width * height;
  }
}

void task8() {
  Shape circle = Circle(5);
  Shape rectangle = Rectangle(4, 6);
  print(circle.getArea());
  print(rectangle.getArea());
}

// 9: Наследование: Животные и их движения
class Animall {
  void move() {
    print("Animal is moving");
  }
}

class Fishh extends Animall {
  @override
  void move() {
    print("Fish is swimming");
  }
}

class Birdd extends Animall {
  @override
  void move() {
    print("Bird is flying");
  }
}

class Dogg extends Animall {
  @override
  void move() {
    print("Dog is running");
  }
}

void task9() {
  Animall fish = Fishh();
  Animall bird = Birdd();
  Animall dog = Dogg();
  fish.move();
  bird.move();
  dog.move();
}

// 10: Работа с коллекциями: Университет
class Student {
  String name;
  String group;
  double grade;

  Student(this.name, this.group, this.grade);
}

class University {
  List<Student> students = [];

  void addStudent(Student student) {
    students.add(student);
  }

  void sortStudentsByName() {
    students.sort((a, b) => a.name.compareTo(b.name));
  }

  List<Student> filterStudentsByGrade(double minGrade) {
    return students.where((student) => student.grade >= minGrade).toList();
  }
}

void task10() {
  var university = University();
  university.addStudent(Student("Alice", "A1", 4.5));
  university.addStudent(Student("Bob", "B2", 3.8));
  university.sortStudentsByName();
  print(university.filterStudentsByGrade(4.0).length);
}

// 11: Класс "Магазин"
class Product {
  String name;
  double price;
  int quantity;

  Product(this.name, this.price, this.quantity);
}

class Store {
  List<Product> products = [];

  void addProduct(Product product) {
    products.add(product);
  }

  void removeProduct(String name) {
    products.removeWhere((product) => product.name == name);
  }

  Product? findProductByName(String name) {
    try {
      return products.firstWhere((product) => product.name == name);
    }
    catch (e) {
      return null;
    }
  }
}

void task11() {
  var store = Store();
  store.addProduct(Product("Apple", 1.0, 10));
  store.addProduct(Product("Banana", 0.5, 20));
  print(store.findProductByName("Apple")?.price);
}

// 12: Интерфейс "Платежная система"
abstract class PaymentSystem {
  void pay(double amount);
  void refund(double amount);
}

class CreditCard implements PaymentSystem {
  @override
  void pay(double amount) {
    print("Paid $amount with Credit Card");
  }

  @override
  void refund(double amount) {
    print("Refunded $amount to Credit Card");
  }
}

class PayPal implements PaymentSystem {
  @override
  void pay(double amount) {
    print("Paid $amount with PayPal");
  }

  @override
  void refund(double amount) {
    print("Refunded $amount to PayPal");
  }
}

void task12() {
  PaymentSystem creditCard = CreditCard();
  PaymentSystem payPal = PayPal();
  creditCard.pay(100);
  payPal.refund(50);
}

// 13: Генерация уникальных идентификаторов
class UniqueID {
  static int _idCounter = 0;
  late int id;

  UniqueID() {
    id = _idCounter++;
  }
}

void task13() {
  var id1 = UniqueID();
  var id2 = UniqueID();
  print(id1.id);
  print(id2.id);
}

// 14: Класс "Точка" и "Прямоугольник"
class Point {
  double x;
  double y;

  Point(this.x, this.y);
}

class Rectanglee {
  Point topLeft;
  Point bottomRight;

  Rectanglee(this.topLeft, this.bottomRight);

  double getArea() {
    double width = (bottomRight.x - topLeft.x).abs();
    double height = (bottomRight.y - topLeft.y).abs();
    return width * height;
  }
}

void task14() {
  var rectangle = Rectanglee(Point(0, 0), Point(4, 3));
  print(rectangle.getArea());
}

// 15: Комплексные числа
class ComplexNumber {
  double real;
  double imaginary;

  ComplexNumber(this.real, this.imaginary);

  ComplexNumber add(ComplexNumber other) {
    return ComplexNumber(real + other.real, imaginary + other.imaginary);
  }

  ComplexNumber subtract(ComplexNumber other) {
    return ComplexNumber(real - other.real, imaginary - other.imaginary);
  }

  ComplexNumber multiply(ComplexNumber other) {
    return ComplexNumber(real * other.real - imaginary * other.imaginary, real * other.imaginary + imaginary * other.real);
  }

  ComplexNumber divide(ComplexNumber other) {
    double denominator = other.real * other.real + other.imaginary * other.imaginary;
    return ComplexNumber((real * other.real + imaginary * other.imaginary) / denominator, (imaginary * other.real - real * other.imaginary) / denominator);
  }
}

void task15() {
  var a = ComplexNumber(1, 2);
  var b = ComplexNumber(3, 4);
  var div = a.divide(b);
  print("Sum: ${div.real} + ${div.imaginary}i");
}

// 16: Перегрузка операторов: Матрица
class Matrix {
  List<List<int>> data;

  Matrix(this.data);

  Matrix operator +(Matrix other) {
    var result = List.generate(data.length, (i) => List.generate(data[i].length, (j) => 0));
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        result[i][j] = data[i][j] + other.data[i][j];
      }
    }
    return Matrix(result);
  }

  Matrix operator *(Matrix other) {
    var result = List.generate(data.length, (i) => List.generate(other.data[0].length, (j) => 0));
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < other.data[0].length; j++) {
        for (int k = 0; k < data[0].length; k++) {
          result[i][j] += data[i][k] * other.data[k][j];
        }
      }
    }
    return Matrix(result);
  }
}

void task16() {
  var matrix1 = Matrix([
    [1, 2],
    [3, 4]
  ]);
  var matrix2 = Matrix([
    [5, 6],
    [7, 8]
  ]);
  var sum = matrix1 + matrix2;
  var product = matrix1 * matrix2;
  print(sum.data);
  print(product.data);
}

// 17: Создание игры с использованием ООП
class Player {
  String name;
  int health;
  Weapon weapon;

  Player(this.name, this.health, this.weapon);

  void attack(Enemy enemy) {
    print(this.name + " attacked " + enemy.name);
    enemy.takeDamage(weapon.damage);
  }
}

class Enemy {
  String name;
  int health;

  Enemy(this.name, this.health);

  void takeDamage(int damage) {
    health -= damage;
    if (health <= 0) {
      print("$name defeated");
    }
  }
}

class Weapon {
  String name;
  int damage;

  Weapon(this.name, this.damage);
}

void task17() {
  var player = Player("Hero", 100, Weapon("Sword", 20));
  var enemy = Enemy("Goblin", 50);
  player.attack(enemy);
}

// 18: Автоматизированная система заказов
class Productt {
  String name;
  double price;

  Productt(this.name, this.price);
}

class Order {
  List<Productt> products = [];

  void addProduct(Productt product) {
    products.add(product);
  }

  double get totalCost {
    return products.fold(0, (sum, product) => sum + product.price);
  }
}

class Customer {
  String name;
  List<Order> orderHistory = [];

  Customer(this.name);

  void placeOrder(Order order) {
    orderHistory.add(order);
  }

  void displayOrderHistory() {
    print("Order history for $name:");
    for (var i = 0; i < orderHistory.length; i++) {
      print("Order ${i + 1}: Total cost = \$${orderHistory[i].totalCost}");
    }
  }
}

void task18() {
  var product1 = Productt("Laptop", 1200);
  var product2 = Productt("Mouse", 25);
  var product3 = Productt("Keyboard", 50);

  var order1 = Order();
  order1.addProduct(product1);
  order1.addProduct(product2);
  var order2 = Order();
  order2.addProduct(product2);
  order2.addProduct(product3);

  var customer = Customer("Alice");

  customer.placeOrder(order1);
  customer.placeOrder(order2);
  customer.displayOrderHistory();
}

// 19: Наследование: Электроника
class Device {
  String brand;

  Device(this.brand);

  void turnOn() {
    print("Device is on");
  }

  void turnOff() {
    print("Device is off");
  }
}

class Smartphone extends Device {
  Smartphone(String brand) : super(brand);

  void takePhoto() {
    print("Photo taken");
  }
}

class Laptop extends Device {
  Laptop(String brand) : super(brand);

  void openBrowser() {
    print("Browser opened");
  }
}

void task19() {
  var smartphone = Smartphone("Apple");
  smartphone.takePhoto();
  var laptop = Laptop("Dell");
  laptop.openBrowser();
}

// 20: Игра "Крестики-нолики"
class Game {
  List<List<String>> board = List.generate(3, (_) => List.filled(3, ''));

  bool makeMove(int x, int y, String player) {
    if (board[x][y] == '') {
      board[x][y] = player;
      print("Player $player placed a ${player == 'X' ? 'cross' : 'circle'} at ($x, $y)");
      return true;
    } else {
      print("Cell ($x, $y) is already occupied!");
      return false;
    }
  }

  String checkWinner() {
    for (int i = 0; i < 3; i++) {
      if (board[i][0] != '' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
        return board[i][0];
      }
      if (board[0][i] != '' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
        return board[0][i];
      }
    }
    if (board[0][0] != '' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
      return board[0][0];
    }
    if (board[0][2] != '' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
      return board[0][2];
    }
    return '';
  }
}

class Playerr {
  String name;
  String symbol;

  Playerr(this.name, this.symbol);
}

void task20() {
  var game = Game();
  var player1 = Playerr("Alice", "X");
  var player2 = Playerr("Bob", "O");

  game.makeMove(0, 0, player1.symbol);
  game.makeMove(1, 1, player2.symbol);
  game.makeMove(0, 1, player1.symbol);
  game.makeMove(1, 0, player2.symbol);
  game.makeMove(0, 2, player1.symbol);

  String winner = game.checkWinner();
  if (winner.isNotEmpty) {
    print("Player ${winner == 'X' ? player1.name : player2.name} wins!");
  } else {
    print("It's a draw!");
  }
}

void main() {
  int taskNumber;
  do {
    stdout.write("Выберете номер задания (1-20, 0 - выход): ");
    taskNumber = int.parse(stdin.readLineSync()!);
    switch (taskNumber) {
      case 0:
        stdout.write("Завершение работы");
        break;
      case 1:
        task1();
        break;
      case 2:
        task2();
        break;
      case 3:
        task3();
        break;
      case 4:
        task4();
        break;
      case 5:
        task5();
        break;
      case 6:
        task6();
        break;
      case 7:
        task7();
        break;
      case 8:
        task8();
        break;
      case 9:
        task9();
        break;
      case 10:
        task10();
        break;
      case 11:
        task11();
        break;
      case 12:
        task12();
        break;
      case 13:
        task13();
        break;
      case 14:
        task14();
        break;
      case 15:
        task15();
        break;
      case 16:
        task16();
        break;
      case 17:
        task17();
        break;
      case 18:
        task18();
        break;
      case 19:
        task19();
        break;
      case 20:
        task20();
        break;
      default:
        print("Неверный номер задания");
    }
  } while (taskNumber != 0);
}