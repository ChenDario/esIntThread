package meucci;

public class Main {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        mt.start();
        for(int i = 0; i < 10; i++){
            System.out.println("\n Sto contando dal main: " + i);
        }

    }
}