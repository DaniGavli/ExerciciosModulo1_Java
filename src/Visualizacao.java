
public class Visualizacao {
    private ClienteUsuario espectador;
    private Video filme;



    public Visualizacao(ClienteUsuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    /*
   Overload - sobrecarga, permite métodos com mesmo nome, mas com suas assinaturas diferentes,
    ex argumentos diferentes. A sobrecarga de métodos é quando temos vários métodos com o mesmo nome, mas com retornos e parâmetros diferentes

    */

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) throws IllegalArgumentException {
        if (nota <0 || nota >10){
            throw new IllegalArgumentException("Avaliação inválida");
        }else
            this.filme.setAvaliacao(nota);
    }


    public void avaliar(double porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        }else if(porc <= 50){
            tot = 5;
        }else if(porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public ClienteUsuario getEspectador() {
        return espectador;
    }

    public Video getFilme() {
        return filme;
    }

    @Override
    public String toString() {
        return  "\n" + "Visualizacao {" + "espectador= " + espectador + ", filme= " + filme + '}';
    }

}
