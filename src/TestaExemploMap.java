import java.util.*;


public class TestaExemploMap {

    public static void main(String[] args) {


        //Map<Integer, CriarPlayList> hm1 = new HashMap<Integer, CriarPlayList>();
        Map<Integer, CriarPlayList> hm1 = new LinkedHashMap< Integer, CriarPlayList>();
        Map<Integer, CriarPlayList> map = new TreeMap<>();
         //Map<Integer, CriarPlayList> map = new TreeMap<>(Collections.reverseOrder());
         
        hm1.put(191, new CriarPlayList("joana", "Salsa"));
        hm1.put(100, new CriarPlayList("Dani", "Reggae"));
        hm1.put(210, new CriarPlayList("maria", "Rock"));
        hm1.put(5000, new CriarPlayList("ana", "Funk"));
        hm1.put(190, new CriarPlayList("joana", "Salsa"));

        map.put(191, new CriarPlayList("joana", "Salsa"));
        map.put(100, new CriarPlayList("Dani", "Reggae"));
        map.put(210, new CriarPlayList("maria", "Rock"));
        map.put(5000, new CriarPlayList("ana", "Funk"));
        map.put(190, new CriarPlayList("joana", "Salsa"));

        hm1.put(2, new CriarPlayList("dddddd", "ggggggg"));

        System.out.println("\nLINKEDHASHMAP -ORDEM DE INSERÇÃO | HASHMAP - SEM ORDEM DEFINIDA ");
        //map.putAll(hm1);
        hm1.forEach((chave, valor) -> System.out.println(" ORDEM DE INSERÇÃO " + chave + " = " + valor.getNomePlay()));

        System.out.println("\nMAP ORDENADO POR CHAVE");
        map.entrySet();
        map.forEach((chave, valor) -> System.out.println(" ORDEM CRESCENTE " + chave + " = " + valor.getNomePlay()));

        //Remover um valor
        map.remove(2);

        System.out.println("\nMAP ORDEM REVERSA");
        map.entrySet();
        map.forEach((chave, valor) -> System.out.println(" ORDEM reversa  " + chave + " = " + valor.getNomePlay()));


        System.out.println("Contem a chave " + map.containsKey(237));


        //entrySet() - é usado para criar um conjunto dos mesmos elementos contidos no mapa hash.
        // Ele basicamente retorna uma visualização de conjunto do mapa hash
        // ou podemos criar um novo conjunto e armazenar os elementos do mapa nele.


        }
    }



