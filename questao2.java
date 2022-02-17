import java.util.Scanner;

class Question2 {

    public static boolean validaSenha(String senha) {
    
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";

    
        if (senha == null) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Nome");
        String nome = scanner.next();
        System.out.println("Senha");
        String senha = scanner.next();
    
    
    
        System.out.println(validaSenha(senha));
    }
    
    
    }
