public class App {
    public static void main(String[] args){
        String primeiroNome = "Pollyana";
        String segundoNome = "rocha";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        

        // ctrl + k + c pra comentar varias linhas
        // ctrl + k + u pra descomentar

    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resul do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
