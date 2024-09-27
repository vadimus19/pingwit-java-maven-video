package com.pingwit.part_31;

public class MultithreadingTheory {
    public static void main(String[] args) {
        /*
        Многопоточность в Java означает способность программы выполнять несколько задач (потоков) одновременно.
        В Java многопоточность поддерживается на уровне языка, что делает ее относительно простой в использовании.
         */

        /*
        Основные понятия для использования многопоточности в Java:
        - Класс Thread: Основной класс для создания и управления потоками.
        Поток может быть создан, либо расширением класса Thread,
        либо реализацией интерфейса Runnable и передачей его экземпляра в конструктор Thread.

        - Интерфейс Runnable: Интерфейс, который определяет метод run(), содержащий код,
         который будет выполняться в потоке. Объекты, реализующие (implements) интерфейс Runnable,
         могут быть переданы в конструктор Thread для выполнения.

        - Монитор (Monitor): Монитор представляет собой механизм,
         который обеспечивает синхронизацию доступа к критическим секциям кода.
         В Java каждый объект имеет свой монитор.

        - Race Condition: Гонка состояний возникает, когда несколько потоков пытаются одновременно изменить
          общие данные без должной синхронизации. Это может привести к непредсказуемому поведению программы.

        - Ключевое слово synchronized: используется для обеспечения синхронизации доступа
        к общим ресурсам в многопоточной среде. Оно может применяться к методам и блокам кода.

        - Класс ReentrantLock: предоставляет механизм для синхронизации потоков с помощью блокировок.
        Он является альтернативой ключевому слову synchronized,
        предоставляя более гибкий и мощный способ управления блокировками в многопоточном приложении.

        - Класс Executor: Это интерфейс, который предоставляет методы для управления выполнением потоков,
        такие как execute(Runnable command). Он предоставляет более высокоуровневый способ управления потоками, чем прямая работа с объектами Thread.

        - Интерфейс ExecutorService: Это наследник интерфейса Executor,
        используется для управления выполнением потоковых задач. Он предоставляет удобный способ запуска
        и управления потоками, скрывая детали управления потоками и позволяя сосредоточиться на выполнении задач.

        - Класс ThreadPoolExecutor: представляет собой гибкую реализацию ExecutorService, которая управляет пулом потоков.
         */
    }
}
