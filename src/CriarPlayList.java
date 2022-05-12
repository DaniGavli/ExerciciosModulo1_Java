import java.util.*;

public class CriarPlayList  {

    private String nomePlay;
    private String tipoPlay;
    private List<ClienteUsuario> usuDaPlay = new ArrayList<>();
    private Set<Video> addVideoSet = new HashSet<>();
    private Map<Integer, Video> videoMap = new HashMap<>();

    public CriarPlayList(String nomePlay, String tipoPlay) {
        this.nomePlay = nomePlay;
        this.tipoPlay = tipoPlay;
    }


    public String getNomePlay() {
        return nomePlay;
    }

    public String getTipoPlay() {
        return tipoPlay;
    }

    public List<ClienteUsuario> getUsuDaPlay() {
        return Collections.unmodifiableList(usuDaPlay);
    }

    public Set<Video> getAddVideoSet() {
        return addVideoSet;
    }

    public Map<Integer, Video> videoMap() {
        return videoMap;
    }


    @Override
    public String toString() {
        return "PlayList: " +
                "nomePlay= '" + nomePlay + '\'' +
                "tipoPlay= '" + tipoPlay + '\'' +
                "UsuPlay= " + usuDaPlay +
                "VideoMap= " + videoMap +
                //"\n, AddVideoSet=" + addVideoSet +
                '}' + "\n";
    }


    //Adiciono um usuario na playlist- num arrayList
    public void adiciona(ClienteUsuario cliusu) {
        this.usuDaPlay.add(cliusu);
    }

    //add o set de video no map
    public void salvar (Video cadastraVideo) {
        this.addVideoSet.add(cadastraVideo);
        this.videoMap.put(cadastraVideo.getIdVideo(), cadastraVideo);
    }


    //Verifica se o video esta cadastrado na lista
    public boolean estaCadastrado (Video videoEstaCadastrado) {
        return this.addVideoSet.contains(videoEstaCadastrado);
    }

    //busca um video pela chave no map
    public Video buscaVideo(int numero) {
        if(!videoMap.containsKey(numero))
            throw new NoSuchElementException();
        return videoMap.get(numero);
    }


}

