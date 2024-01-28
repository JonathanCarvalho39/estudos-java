import java.util.*;
import entiti.Produto;

public class ex_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Entre product data:");
        System.out.println("Name:");
        produto.name = sc.next();
        System.out.println("Price:");
        produto.price = sc.nextDouble();
        System.out.println("Quantity:");
        produto.quantity = sc.nextInt();

        System.out.println(produto.toString());

        System.out.println("\nEnter the number of product to be added in stock:");
        int quantity = sc.nextInt();
        produto.addProduto(quantity);

        System.out.println("Produto Atualizado:\n" + produto.toString());
        System.out.println("\nEnter the number of product to be remove from stock:");
        quantity = sc.nextInt();
        produto.removeProduto(quantity);

        System.out.println("Produto Atualizado:\n" + produto.toString());

        sc.close();
    }
}
