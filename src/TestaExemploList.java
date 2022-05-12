import java.util.*;


public class TestaExemploList {

    public static void main(String[] args) {
        List<Video> colecaoList = new ArrayList<>();

        colecaoList.add(new Video("Planta e Raiz", 4.20, 100));
        colecaoList.add(new Video("Red Wine", 4.07, 200));
        colecaoList.add(new Video("One night in Bkk", 3.90, 300));
        colecaoList.add(new Video("Virou Areia", 3.90, 800));


//Aceita dados duplicados
        colecaoList.add(new Video("Planta e Raiz", 4.20, 100));
        colecaoList.add(new Video("Planta e Raiz", 4.20, 100));

        for (Video vi: colecaoList) {
            System.out.println(vi.getIdVideo() + " - " + vi.getTitulo());
        }

        System.out.println("\nORDENAÇÃO CRESCENTE - SORT\n");
//Lambda de Comparator
        colecaoList.sort ((v1, v2) -> Integer.compare(v1.getIdVideo(), v2.getIdVideo()));

        for (Video videol: colecaoList) {
                System.out.println("Ordenacao pela lambda - " + videol.getIdVideo());
        }

        System.out.println("\nORDENAÇÃO REVERSE - COLLECTIONS \n");

        Collections.reverse(colecaoList);// shuffle, rotate, sort
        for (Video videol: colecaoList) {
            System.out.println("Ordenacao pelo reverse - " + videol.getIdVideo());
        }


        //Alguns Metodos
        System.out.println("Size : " + colecaoList.size());
        System.out.println("Get pelo index : " + colecaoList.get(1));

        for(Video user : colecaoList){
            if(user.getTitulo().contains("Wine"))
                System.out.println(" O titulo contem a palavra " + user.getTitulo());
        }

    }
}
