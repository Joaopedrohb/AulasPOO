public class Pessoa {
    private String nomePessoa;
    private int idadePessoa;
    private int diaPessoa;
    private int mesPessoa;
    private int anoPessoa;
    public void getPessoa(){
        System.out.println(nomePessoa);
        System.out.println(idadePessoa);
        System.out.printf("%d / %d / %d",diaPessoa, mesPessoa, anoPessoa);
    }
    public void setPessoa(String nome, int idade){
        this.nomePessoa = nome;
        this.idadePessoa = idade;
    }
    public void setDataPessoa(int dia, int mes, int ano){
        this.diaPessoa = dia;
        this.mesPessoa = mes;
        this.anoPessoa = ano;
    }
}
