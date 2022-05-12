import java.util.List;

public class TestaCriarPlayList {


    public static void main(String[] args) {

        //Cria a playList
        System.out.println("PLAY LIST CRIADA");

        CriarPlayList PlayList1 = new CriarPlayList("Reggae 2020", "Reggae");
        CriarPlayList PlayList2 = new CriarPlayList("Rock 2020", "Rock");
        System.out.println("PlayList1: " + PlayList1.getNomePlay() + " - PlayList2: " + PlayList2.getNomePlay());

        //Addiciona Usuarios na playList
        System.out.println("\nADICIONADO UM USUARIO A PLAY LIST CRIADA ");

        PlayList1.adiciona(new ClienteUsuario("Maria Silva", 20, "F", "flor25"));
        PlayList1.adiciona(new ClienteUsuario("Jose Silva", 30, "M", "josese"));
        PlayList2.adiciona(new ClienteUsuario("Ana Pereira", 30, "F", "ana30"));
        System.out.println(" Usuario PlayList1 :" + PlayList1.getUsuDaPlay() + "\nUsuario PlayList2 :" + PlayList2.getUsuDaPlay());



       // Salva/inclui os videos na playList
        System.out.println("\nADICIONADO VIDEOS NA PLAY LIST CRIADA ");

        PlayList1.salvar(new Video("One night in Bkk", 3.90, 400));
        PlayList2.salvar(new Video("Aquarela", 3.90, 500));
        Video v1 = new Video("Planta e Raiz", 4.20, 100);
        PlayList1.salvar(v1);
        System.out.println("---->> Videos PlayList1 :" + PlayList1.getAddVideoSet() + "\n---->> Videos PlayList2 :" + PlayList2.getAddVideoSet());



        System.out.println("\nVERIFICA SE O VIDEO ESTÁ NA LISTA PELO METODO CRIADO - SET  ");
        System.out.println("Esta cadastrado ?" + PlayList1.estaCadastrado(v1) + "\n");

        System.out.println("\nBUSCA DO VIDEO PELA CHAVE DO MAP (ID VIDEO) ");
        System.out.println("Busca Video :" + PlayList1.buscaVideo(400) + "\n");

        System.out.println("\nEXIBE A PLAYLIST/ USUARIOS/ VIDEOS  ");
        System.out.println(PlayList2);


        PlayList1.getAddVideoSet().forEach(a ->{
            System.out.println(a);
        });


        }
    }


