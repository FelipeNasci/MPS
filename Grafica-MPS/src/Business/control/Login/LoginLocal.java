package Business.control.Login;

public class LoginLocal implements Interface_Login{

    @Override
    public void login(String usuario, String senha) {
        System.out.println("Você realizou Login Local");
    }
    
}
