
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Containers containers = new Containers();
        
        while (true) {
            System.out.println(containers);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {

                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if(command.equals("add")){
                containers.add(amount);
                System.out.println("");
            }else if(command.equals("move")){
                containers.move(amount);
                System.out.println("");
            }else if(command.equals("remove")){
                containers.remove(amount);
                System.out.println("");
            }

        }

    }

}
