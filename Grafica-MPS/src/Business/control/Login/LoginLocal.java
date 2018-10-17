package Business.control.Login;

public class LoginLocal implements Interface_Login{

    @Override
    public void login() {
        System.out.println("Logando localmente");
    }

    @Override
    public void senha() {
        System.out.println("Senha de LoginLocal");
    }
    
    
}
