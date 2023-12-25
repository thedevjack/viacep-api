public class Main {
    public static void main(String[] args) {
        Consulta consultaCep = new Consulta();
        Endereco novoEndereco = consultaCep.consultaCep("01001000");
        System.out.println(novoEndereco);
    }
}