package anatomiadeclasses;

public class MinhaClasse {

    public static void main(String [] args) {
        // DECLARAÇÃO DE VARIÁVEIS 
        String primeiroNome = "Vinicius";
        String segundoNome = "Silva";
        
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        // IMPRIMINDO A VARIÁVEL
        System.out.println(nomeCompleto);
    }    

    // DECLARAÇÃO DE MÉTODOS
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }


}
