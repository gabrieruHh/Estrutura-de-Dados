import one.digitalinovation.Carro;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarro = new LinkedList<>();

        queueCarro.add(new Carro("Ford"));
        queueCarro.add(new Carro("Chevrolet"));
        queueCarro.add(new Carro("Fiat"));

        System.out.println(queueCarro.add(new Carro("Peugeout")));
        System.out.println(queueCarro);

        System.out.println(queueCarro.offer(new Carro("Renaul")));
        System.out.println(queueCarro);

        System.out.println(queueCarro.peek());
        System.out.println(queueCarro);

        System.out.println(queueCarro.poll());
        System.out.println(queueCarro);

        System.out.println(queueCarro.isEmpty());
        System.out.println(queueCarro);

        System.out.println(queueCarro.size());
        System.out.println(queueCarro);





    }
}