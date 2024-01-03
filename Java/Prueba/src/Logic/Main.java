package Logic;

public class Main {
    public static void main(String[] args) {
        PizzeriaPuga PizzasPuga = new PizzeriaPuga();
        Pizza PAnana = PizzasPuga.crearPizza("Anana");
        Pizza PEspecial = PizzasPuga.crearPizza("Especial");
        
        System.out.println(PAnana);
        System.out.println(PEspecial);
    }
}
