
package Logic;

public class PizzeriaPuga implements IPizzeria{

    @Override
    public Pizza crearPizza(String Tipo) {
                
        switch(Tipo){
            case "Anana" -> {
                return new Pizza(8, "Anana");
            }
            case "Especial" -> {
                return new Pizza(8, "Especial");
            }
            case "Jamon y Queso" -> {
                return new Pizza(8, "Jamon y Queso");
            }
            default -> {
            }
        }
        return null;
   }
}
