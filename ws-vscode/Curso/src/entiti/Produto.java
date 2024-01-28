package entiti;

public class Produto {
  public String name;
  public double price;
  public int quantity;

  public double totalStock() {
    double total = price * quantity;
    return total;
  }

  public void addProduto(int quantidade) {
    this.quantity += quantidade;
  }

  public void removeProduto(int quantidade) {
    this.quantity -= quantidade;
  }

  public String toString() {
    return "Name:" + this.name + "\n" +
        "Price R$" + String.format("%.2f", this.price * this.quantity) + "\n" +
        "Quantity:" + this.quantity;
  }

}
