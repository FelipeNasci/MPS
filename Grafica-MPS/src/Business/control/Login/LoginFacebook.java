package Business.control.Login;

public class LoginFacebook implements Interface_Login {

    @Override
    public void login(String usuario, String senha) {
        System.out.println("Você está logando com o Facebook");
    }

}
