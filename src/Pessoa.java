/* Classes abstratas – Definição simples é uma classe que não gera objetos, mas quando ela é utilizada,


é um tipo mais genérico e que todos são eles, mas ele não é nenhum. É genérico.

Classes abstratas são úteis quando queremos utilizar comportamentos e atributos base em classes com comportamentos em comum.

*/

//public abstract class Pessoa { abaixo sobre a ordem natuarl

/*
A classe Aula não implementa a interface Comparable e, por consequência, não implementa o método compareTo. Por isso o código nem compila.
 */

public abstract class Pessoa extends Object implements Comparable<Pessoa> {
//public abstract class Pessoa  {
    private String nome;
    private int idade;
    private String sexo;



    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }


    @Override

    public String toString() {
        return "\nPessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

    @Override
    public boolean equals(Object ref) {
        Pessoa outra = (Pessoa) ref;
        if(this.idade != outra.idade)
            return super.equals(ref);

        return true;
    }


    public int compareTo(Pessoa outra) {
        return Integer.compare(this.idade, outra.idade);

    }


}

