import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Video implements AcoesVideos, Comparable<Video> {
    private String titulo;
    private int idVideo;
    private double duracao;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    private List<Video> listavideo = new ArrayList<Video>();

    // CONSTRUTOR
    public Video(String titulo, double duracao, int idVideo) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.idVideo = idVideo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getIdVideo() {
        return idVideo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurstidas() {
        return curtidas;
    }

    public void setCurstidas(int curstidas) {
        this.curtidas = curstidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Video video: listavideo){
            tempoTotal += video.getDuracao();
        }
        return tempoTotal;
    }

    //Assinatura dos metodos abstratos da interface AcoesVideos
    @Override
    public void play() {
        this.reproduzindo = true;
    }


    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }



    @Override
    public boolean equals(Object obj) {
        Video outroVideo = (Video) obj;
        return this.titulo.equals(outroVideo.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode();
    }

    @Override
    public String toString() {
        return "\nVideo{" +
                "titulo='" + titulo + '\'' +
                ", idVideo=" + idVideo +
                ", duracao=" + duracao +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
               // ", reproduzindo=" + reproduzindo +
                '}';
    }


    @Override
    public int compareTo(Video o) {
        return Integer.compare(this.getIdVideo(), getIdVideo());
    }
}




