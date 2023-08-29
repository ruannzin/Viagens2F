public class Main {
    public static void main(String[] args) {
        // Classe Objeto = Construtor
        Turista mochileiro = new Turista("Lindsay");
        Turista mochileira = new Turista();
      // Definir forma de cada turista
        mochileiro.setCpf(Validacao.cpf("123"));
        mochileiro.setNome("Namor");
        mochileiro.setCpf("123");
        // Definir comportamento
        String retorno = mochileira.viajar();
        System.out.println(retorno);
    }
}