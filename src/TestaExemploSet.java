import java.util.*;

public class TestaExemploSet {


    public static void main(String[] args) {
        //Set<Video> colecaoSet = new LinkedHashSet<>();
        Set<Video> colecaoSet = new HashSet<>();
        Set<Video> ordenaComSet = new TreeSet<>(Comparator.comparingInt(Video::getIdVideo));


        colecaoSet.add(new Video("Planta e Raiz", 4.20, 100));
        colecaoSet.add(new Video("Red Wine", 4.07, 6600));
        colecaoSet.add(new Video("One night in Bkk", 3.90, 900));


//dados duplicados não são inseridos no Set
        colecaoSet.add(new Video("Planta e Raiz", 4.20, 100));
        colecaoSet.add(new Video("Planta e Rai", 4.20, 100));




        System.out.println("\n ORDENACAO ALEATORIA NO HASHSET | ORDEM NATURAL NO LINKEDHASHSET ");
        System.out.println(colecaoSet);

        System.out.println("\nTamanho coleção HashSet: " + colecaoSet.size());

//Percorrendo o HashSet<Video> e imprimindo os valores com Iterator
        Iterator<Video> it = colecaoSet.iterator();
        while (it.hasNext()) {
            Video video = (Video) it.next();
            System.out.println(video.getIdVideo() + " - " + video.getTitulo());
        }

            System.out.println("\n ORDENACAO TREE SET\n ");


//Ordenando com o treeSet que precisa implementar a interface Comparable

        ordenaComSet.add(new Video("Planta e Raiz", 4.20, 100));
        ordenaComSet.add(new Video("Red Wine", 4.07, 6600));
        Video x1= new Video("One night in Bkk", 3.90, 900);
        ordenaComSet.add(x1);

            System.out.println("Ordena com Set" + ordenaComSet);

//busca com contains
        if(ordenaComSet.contains(x1)){
            System.out.println("Encontrado");

        }else {
            System.out.println("Não ncontrado");
        }

        }


    }
