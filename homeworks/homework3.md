## Уровень 1
1. Что такое рекурсия?
2. Что такое стек?
3. Какие типы рекурсии существуют? Каких нужно избегать?
4. Когда стоит выбрать рекурсию, а когда цикл(итерацию)?
5. Что обязательно нужно учитывать/добавлять при работе с рекурсией?
6. Напишите рекурсивный метод для нахождения факториала числа `5! = 1 * 2 * 3 * 4 * 5`
7. Напишите алгоритм Евклида через рекурсию
```java
    while (a != b && a!= 0 && b!=0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        if (a == b) {
            return a;
        } else if(a == 0) {
            return b;
        } else {
            return a;
        }
```
## Уровень 2
1. Реализуйте алгоритм сортировки выбором (есть псевдокод на 4 слайде)
Шаги алгоритма:
- находим номер минимального значения в текущем списке
- производим обмен этого значения со значением первой неотсортированной позиции (обмен не нужен, если минимальный элемент уже находится на данной позиции)
- теперь сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы
2. Реализуйте алгоритм сортировки вставками (есть псевдокод на 4 слайде)
   Алгоритм, в котором элементы входной последовательности просматриваются по одному, и каждый новый поступивший элемент размещается в подходящее место среди ранее упорядоченных элементов
