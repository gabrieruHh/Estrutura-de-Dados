import one.digitalinnovation.No;
import one.digitalinnovation.Pilha;

public class Main {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(7));
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(8));
        minhaPilha.push(new No(2));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);

        minhaPilha.push(new No(22));
        System.out.println(minhaPilha);
    }
}