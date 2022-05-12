
import java.util.*;


public class MainSoParaTestes_Geral {

    public static void main(String[] args) {

        List<Video> listaVideos = new ArrayList();
        List<ClienteUsuario> listaCliUsuarios = new ArrayList();
        List<Visualizacao> listaVisualizacao = new ArrayList();



        listaVideos.add(new Video("cava 5", 21.8, 400));
        listaVideos.add(new Video("bava 2", 22,500 ));
        listaVideos.add(new Video("aava 3", 10, 600));

        listaCliUsuarios.add(new ClienteUsuario("Daniela", 80, "F", "DaniVG"));
        listaCliUsuarios.add(new ClienteUsuario("Maria", 20, "F", "Mariazinha"));
        listaCliUsuarios.add(new ClienteUsuario("Joao", 10, "M", "JoaoS"));
        listaCliUsuarios.add(new ClienteUsuario("karin", 30, "M", "JoaoS"));



        listaVisualizacao.add(new Visualizacao(new ClienteUsuario("pedro", 40, "M", "pedrop"), new Video("Java 4", 16, 140)));
        listaVisualizacao.add(new Visualizacao(new ClienteUsuario("aaaaaaaaaaa", 40, "M", "pedrop"), new Video("amava 4", 14, 156)));
        System.out.println("duracao: " + listaVideos.get(1).getDuracao());


        //para acessar o tamanho do arraylist
        System.out.println(listaVideos.size());

        //Arraylist é de objetos, portanto guarda referencias, para acessar um atributo é necessario a posição na lista . o metodo de chamada
        listaVideos.get(1).like();

        for (Video video : listaVideos) {
            System.out.println(video.toString());
        }

        listaVisualizacao.get(0).avaliar(10);

        for (Visualizacao visualizacao : listaVisualizacao) {
            System.out.println(visualizacao.toString());
        }


        listaCliUsuarios.sort ((usu1, usu2) -> Integer.compare(usu1.getIdade(),usu2.getIdade()));

        Comparator<ClienteUsuario> comp = (ClienteUsuario cli11, ClienteUsuario cli2) ->{
            String nomeCli1 = cli11.getNome();
            String nomeCli2 = cli2.getNome();
            return nomeCli1.compareTo(nomeCli2);
        };

        //Classe Anonima
        //É uma classe interna sem um nome e para a qual apenas um único objeto é criado, pode ser útil ao criar uma instância de um objeto com certos “extras”,
        // como métodos de sobrecarga de uma subclasse ou interface, sem ter de realmente criar uma subclasse de uma classe
        class CliNomeComparator implements Comparator<ClienteUsuario> {
            @Override
            public int compare(ClienteUsuario cli1, ClienteUsuario cli2) {
                String nomeCli1 = cli1.getNome();
                String nomeCli2 = cli2.getNome();
                return nomeCli1.compareTo(nomeCli2);
            }
        }


        class TituloVideoComparator implements Comparator<Video> {
            @Override
            public int compare(Video video1, Video video2) {
                String tituloV1 = video1.getTitulo();
                String tituloV2 = video2.getTitulo();
                return tituloV1.compareTo(tituloV2);
            }
        }

        //Exemplo da diferença do tamanho e simplicidade na escrita do metodo
        class ComparadorIdade1 implements Comparator<ClienteUsuario> {
            @Override
            public int compare(ClienteUsuario usu1, ClienteUsuario usu2) {
                if(usu1.getIdade() < usu2.getIdade()) {
                    return -1;
                }
                if(usu1.getIdade() > usu2.getIdade()) {
                    return 1;
                }
                return 0;
            }
        }

        class ComparadorIdade implements Comparator<ClienteUsuario> {
            @Override
            public int compare(ClienteUsuario usu1, ClienteUsuario usu2) {
                return Integer.compare(usu1.getIdade(),usu2.getIdade());
            }
        }


        for (ClienteUsuario clienteUsuario : listaCliUsuarios) {
            System.out.println(clienteUsuario);
        }

        System.out.println("---------");

        TituloVideoComparator tituloVideoComparator = new TituloVideoComparator();
        listaVideos.sort(tituloVideoComparator);

        for(Video video : listaVideos){
            System.out.println(video);
        }


        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\n function Objects------------------------------------------------------");

        //Function Objects.
        //Instancia a classe anonima de comparação de idade  e implementa o metodo sobrescrito da inerface Comparator

        ComparadorIdade comparaIdade = new ComparadorIdade();
        listaCliUsuarios.sort(comparaIdade);

        //laço para exibir a lista ordenada pela idade.
        for (ClienteUsuario clienteUsuario : listaCliUsuarios) {
            System.out.println( " lambda " + clienteUsuario.getIdade() );
        }




        System.out.println("---------Collections--------------");

        // listaCliUsuarios.sort(new CliNomeComparator());
        Collections.sort(listaCliUsuarios, new ComparadorIdade());
        Collections.reverse(listaCliUsuarios);
        //Collections.shuffle(listaCliUsuarios);
        //Collections.rotate(listaCliUsuarios,2);

        for(ClienteUsuario ClienteUsuario : listaCliUsuarios){
            System.out.println(listaCliUsuarios);
        }

        listaCliUsuarios.forEach((clienteUsuario)-> System.out.println(clienteUsuario));

// exibe a ordem natural da lista
        listaCliUsuarios.sort(null);

        System.out.println("---------");
        for(ClienteUsuario clienteUsuario : listaCliUsuarios){

            System.out.println(clienteUsuario.getNome());
        }


        System.out.println("\nCHAMADA DA EXCEPTION \n-----------------");

        try {
            listaVisualizacao.get(0).avaliar(10);
        } catch (IllegalArgumentException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);

        }

        System.out.println("\nCHAMADA DA EXCEPTION DaniException \n-----------------");
        try {
            listaCliUsuarios.get(0).alterarLoginNovasRegras2("@vaca verde");
        } catch (DaniException ex) {
            String msg = ex.getMessage();
            System.out.println("DaniException ---------->>>>>>>>>>>>>> " + msg);
        }



///ver se uso para a apresentação



    }

}
