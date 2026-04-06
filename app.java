public class App {

public static void main(String[] args) throws Exception {

System.out.println("Java CI/CD Application Started...");
//commit 
if (args.length > 0) {
    System.out.println("Received argument: " + args[0]);
    if(args[0]%2==0)
    {
        System.out.println("Even number received: " + args[0]);
    }
    else
    {
        System.out.println("Odd number received: " + args[0]);
    }
} else {
    System.out.println("No arguments received.");

}

}
