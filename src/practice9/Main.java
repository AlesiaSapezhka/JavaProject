package practice9;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // 1. Задача: создание одного потока
        //Условие задачи: Напишите программу, в которой создается отдельный поток, выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.
        Thread t1 = new Thread(()->{
            for(int i=0;i<5;i++) {
                System.out.println("Привет из потока!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t1.join();

        //2. Задача: создание двух потоков
        //Условие задачи: Создайте два потока. Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.
        Thread threadA = new Thread(()->{
            for(int i=0;i<5;i++) {
                System.out.println("A");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
        });
        Thread threadB = new Thread(()->{
            for(int i=0;i<5;i++) {
                System.out.println("B");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
        });

        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();

        //3. Задача: использование volatile
        //Условие задачи: Создайте поток, который бесконечно увеличивает счетчик. В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
        CounterChecker counterChecker = new CounterChecker();
        Thread t3 = new Thread(counterChecker);
        t3.start();
        Thread.sleep(2000);
        counterChecker.stop();
        t3.join();
        System.out.println(counterChecker.getCounter());

        //4. Задача: использование synchronized
        //Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика. Создайте два потока, каждый из которых вызывает increment() 1000 раз.
        // Обеспечьте правильную работу с помощью synchronized.
        Counter count = new Counter();
        Thread t4 = new Thread(()->{
            for(int i=0;i<1000;i++) {
                count.increment();
            }
        });
        Thread t5 = new Thread(()->{
            for(int i=0;i<1000;i++) {
                count.increment();
            }
        });

        t4.start();
        t5.start();
        t4.join();
        t5.join();
        System.out.println(count.getCounter());
    }
}
