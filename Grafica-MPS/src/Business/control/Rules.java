package Business.control;

public class Rules {
    
    String expLogin = "[a-z]{1,15}";
    String expSenha = "\\w{6,16}";

        //Validação de cadastro
    public boolean checkLogin(String login){
        return login.matches(expLogin);
    }
    public boolean checkSenha(String senha){
        return senha.matches(expSenha);
    }
}
