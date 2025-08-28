public class EscapeSequences {
    public static void main(String[] args){
        String message = "Hello \"Adheesh Chopra\"";
        System.out.println(message);
//        c:\Windows\...
        message = "c:\\Windows\\...";
        System.out.println(message);
        message = "c:\nWindows\\...";
        System.out.println(message);
        message = "c:\tWindows\\...";
        System.out.println(message);
    }
}