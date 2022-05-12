import java.util.*;

public class ClienteUsuario extends Pessoa {
    protected String login;
    private int totAssistindo;

    public ClienteUsuario(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public void alterarLoginNovasRegras2(String login) throws DaniException {
        if (login.contains("@")) {
            throw new DaniException();
        } else
            setLogin(login);
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }


    // @Override - É usada para sobrescrever o método da classe mãe, indicando que o método original foi alterado.
    //A sobrescrita de métodos seria criar um novo método na classe filha contendo a mesma assinatura e mesmo tipo de retorno do método sobrescrito.


    @Override
    public String toString() {
        return "\n" + "Cliente Usuario{" + "\n" + super.toString() + "login=" + login + ", totAssistindo=" + totAssistindo + '}';
    }


    @Override
    public boolean equals(Object obj) {
        ClienteUsuario outroCli = (ClienteUsuario) obj;
        return this.getNome().equals(outroCli.getNome());
    }

    @Override
    public int hashCode() {
        return this.getNome().hashCode();
    }


}

