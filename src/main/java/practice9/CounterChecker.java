package practice9;

public class CounterChecker implements Runnable{
    //3. Задача: использование volatile
    //Условие задачи: Создайте поток, который бесконечно увеличивает счетчик. В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
    private volatile boolean requestStop = false;
    private int counter;
    @Override
    public void run() {
     while(!requestStop){
         counter++;
     }
    };

    public void stop(){
        this.requestStop = true;
    }

    public int getCounter(){
        return counter;
    }
}
