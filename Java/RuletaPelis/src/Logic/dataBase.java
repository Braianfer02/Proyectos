
package Logic;

public class dataBase implements ICine{

    @Override
    public Cine peliculasCine(String Peliculas) {
                
        switch(Peliculas){
            case "chucky" -> {
                return new Cine("chucky", "muñeco maldito","");
            }
            case "Son como niño" -> {
                return new Cine("Son como niño", "gente grande que quiere ser niño","");
            }
            case "Son como niño2" -> {
                return new Cine("Son como niño2", "gente grande que quiere ser niño","");
            }
            default -> {
            }
        }
        return null;
    }
}
