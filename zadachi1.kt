fun main() {
    val zadanie: Int
    do {
        print("Выберете номер задания (1-20, 0 - выход): ")
        val zadanie = readLine()?.toInt()
        when (zadanie) {
            0 -> {
                println("Завершение работы")
                break
            }
            1 -> {
                print("Введите число: ")
                val num = readLine()?.toIntOrNull()
                num?.let {
                    if (it % 2 == 0) {
                        println("Число чётное")
                    } else {
                        println("Число нечётное")
                    }
                } ?: println("Некорректный ввод")
            }

            2 -> {
                print("Введите первое число: ")
                val num1 = readLine()?.toInt()
                print("Введите второе число: ")
                val num2 = readLine()?.toInt()
                print("Введите третье число: ")
                val num3 = readLine()?.toInt()
                if (num1 != null && num2 != null && num3 != null) {
                    val min = if (num1 < num2) {
                        if (num1 < num3) num1 else num3
                    } else {
                        if (num2 < num3) num2 else num3
                    }
                    println("Минимальное число: $min")
                } else {
                    println("Некорректный ввод")
                }
            }

            3 -> {
                for (i in 1..10) {
                    println("$i * 5 = ${i * 5}")
                }
            }

            4 -> {
                print("Введите число N: ")
                val N = readLine()?.toInt()
                var ans = 0
                if (N != null && N > 1) {
                    for (i in 1..N) {
                        ans += i
                    }
                    println("Сумма чисел от 1 до $N = $ans")
                } else {
                    println("Некорректный ввод")
                }
            }

            5 -> {
                print("Введите число N: ")
                val N = readLine()?.toInt()
                var first = 0
                var second = 1
                var num: Int
                if (N != null && N > 0) {
                    if (N == 1) {
                        print("$first ")
                    }
                    if (N > 1) {
                        print("$first $second ")
                        for (i in 1..N - 2) {
                            num = first + second
                            print("$num ")
                            first = second
                            second = num
                        }
                    }
                }
                else {
                    println("Некорректный ввод")
                    continue
                }
                println()
            }

            6 -> {
                fun isPrime(num: Int): Boolean {
                    if (num < 2) return false
                    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
                        if (num % i == 0) {
                            return false
                        }
                    }
                    return true
                }
                print("Введите число: ")
                val num = readLine()?.toInt()
                if (num != null) {
                    if (isPrime(num)) {
                        println("Число $num является простым")
                    } else {
                        println("Число $num не является простым")
                    }
                } else {
                    println("Некорректный ввод")
                }
            }

            7 -> {
                print("Введите целое число N: ")
                var N = readLine()?.toInt()
                if (N != null && N > 0) {
                    while (N >= 1) {
                        print("$N ")
                        N--
                    }
                } else {
                    println("Некорректный ввод")
                    continue
                }
                println()
            }

            8 -> {
                print("Введите число A: ")
                val A = readLine()?.toInt()
                print("Введите число B: ")
                val B = readLine()?.toInt()
                var ans = 0
                if (A != null && B != null && A < B) {
                    for (i in A..B) {
                        if (i % 2 == 0) {
                            ans += i
                        }
                    }
                    println("Сумма чётных чисел от $A до $B включительно: $ans")
                } else {
                    println("Некорректный ввод")
                }
            }

            9 -> {
                print("Введите строку: ")
                val input = readLine()
                if (input != null) {
                    println(input.reversed())
                } else {
                    println("Некорректный ввод")
                }
            }

            10 -> {
                print("Введите число: ")
                var num = readLine()?.toInt()
                var count = 0
                if (num != null) {
                    if (num == 0) {
                        count = 1
                    }
                    while (num > 0 || num < 0) {
                        count++
                        num /= 10
                    }
                    println("Количество цифр в числе: $count")
                } else {
                    println("Некорректный ввод")
                }
            }

            11 -> {
                print("Введите число: ")
                val num = readLine()?.toInt()
                var ans = num
                if (num != null && ans != null && num >= 0) {
                    if (num == 0) {
                        ans = 1
                    } else {
                        for (i in num - 1 downTo 1) {
                            ans *= i
                        }
                    }
                    println("$num! = $ans")
                } else {
                    println("Некорректный ввод")
                }
            }

            12 -> {
                print("Введите число: ")
                val num = readLine()
                var ans = 0
                if (num != null && num.first() != '-') {
                    for (i in num) {
                        ans += i.digitToInt()
                    }
                    println("Сумма цифр числа $num: $ans")
                } else {
                    println("Некорректный ввод")
                }
            }

            13 -> {
                print("Введите строку: ")
                val str = readLine()
                val strRev = str?.reversed()
                if (str == strRev) {
                    println("Строка \"$str\" является палиндромом")
                } else {
                    println("Строка \"$str\" не является палиндромом")
                }
            }

            14 -> {
                print("Введите размер массива: ")
                val size = readLine()?.toInt()
                if (size != null && size > 0) {
                    val arr = IntArray(size)
                    for (i in 0 until size) {
                        print("Введите ${i + 1}й элемент: ")
                        arr[i] = readLine()?.toInt() ?: 0
                    }
                    val max = arr.max()
                    println("Максимальное число в массиве: $max")
                } else {
                    println("Некорректный ввод")
                }
            }

            15 -> {
                print("Введите размер массива: ")
                val size = readLine()?.toInt()
                if (size != null && size > 0) {
                    val arr = IntArray(size)
                    for (i in 0 until size) {
                        print("Введите ${i + 1}й элемент: ")
                        arr[i] = readLine()?.toInt() ?: 0
                    }
                    val sum = arr.sum()
                    println("Сумма чисел в массиве: $sum")
                } else {
                    println("Некорректный ввод")
                }
            }

            16 -> {
                print("Введите размер массива: ")
                val size = readLine()?.toInt()
                if (size != null && size > 0) {
                    val arr = IntArray(size)
                    for (i in 0 until size) {
                        print("Введите ${i + 1}й элемент: ")
                        arr[i] = readLine()?.toInt() ?: 0
                    }
                    var pos = 0
                    var neg = 0
                    for (i in arr) {
                        when {
                            i > 0 -> pos++
                            i < 0 -> neg++
                        }
                    }
                    println("Положительных чисел в массиве: $pos")
                    println("Отрицательных чисел в массиве: $neg")
                } else {
                    println("Некорректный ввод")
                }
            }

            17 -> {
                print("Введите число A: ")
                val A = readLine()?.toInt()
                print("Введите число B: ")
                val B = readLine()?.toInt()
                if (A != null && B != null && A <= B) {
                    fun isPrime(num: Int): Boolean {
                        if (num < 2) return false
                        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
                            if (num % i == 0) return false
                        }
                        return true
                    }
                    print("Простые числа в диапазоне от $A до $B: ")
                    for (i in A..B) {
                        if (isPrime(i)) {
                            print("$i ")
                        }
                    }
                    println()
                } else {
                    println("Некорректный ввод")
                }
            }

            18 -> {
                print("Введите строку: ")
                val str = readLine()?.lowercase()
                if (str != null) {
                    var vowCount = 0
                    var conCount = 0
                    for (i in str) {
                        if (i in setOf('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я')) {
                            vowCount++
                        } else if (i in 'а'..'я') {
                            conCount++
                        }
                    }
                    println("Гласных в строке: $vowCount")
                    println("Согласных в строке: $conCount")
                } else {
                    println("Некорректный ввод")
                }
            }

            19 -> {
                print("Введите строку: ")
                val str = readLine()
                if (str != null) {
                    val words = str.split(" ")
                    val strRev = words.reversed()
                    val result = strRev.joinToString(" ")
                    println("Строка в обратном порядке: $result")
                } else {
                    println("Некорректный ввод")
                }
            }

            20 -> {
                fun Int.pow(exponent: Int): Int {
                    var result = 1
                    repeat(exponent) {
                        result *= this
                    }
                    return result
                }
                print("Введите число: ")
                val num = readLine()
                if (num != null && num.toInt() >= 0) {
                    val pow = num.length
                    var sum = 0
                    for (i in num) {
                        sum += i.digitToInt().pow(pow)
                    }
                    if (num.toInt() == sum) {
                        println("Число $num является числом Армстронга")
                    } else {
                        println("Число $num не является числом Армстронга")
                    }
                }
            }

            else -> println("Неверный номер задания")
        }
    } while (zadanie != 0)
}