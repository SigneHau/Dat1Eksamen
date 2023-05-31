package TjekPassword;

public class Main {

    public static void main(String[] args) {
        PasswordValidater pv = new PasswordValidater(5, 10, true,true,true);


        System.out.println(pv.isValid("aB3cd"));
        System.out.println(pv.isValid("aocd"));
        System.out.println(pv.isValid("av88cdkllhhgcf"));
        System.out.println(pv.isValid("aBcd45682"));
    }
}
