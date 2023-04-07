import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Meida", "8.3");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listAlunos = new ArrayList<>();

        listAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno.put("Nome", "Maria");
        aluno.put("Idade", "18");
        aluno.put("Meida", "8.9");
        aluno.put("Turma", "3b");

        listAlunos.add(aluno2);

        System.out.println(listAlunos);

        System.out.println(aluno.containsKey("Nome"));

    }
}