public class NumberPrinterThread implements Runnable {

    NumberPrinter numberPrinter;

    NumberPrinterThread(NumberPrinter numberPrinter){
        this.numberPrinter = numberPrinter;
    }

    @Override
    public void run() {
        System.out.println("Inside run() method " + Thread.currentThread().getName() + " called run() method!!!"+ "" +
                "Thread state is : "+ Thread.currentThread().getState());        try {
            Thread.sleep(2000);
            this.numberPrinter.printNumber();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
