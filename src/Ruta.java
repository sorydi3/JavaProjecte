public interface Ruta {
    public Location iniciRuta();

    public Location finalRuta();

    public void afegir(Locacio locacio);

    public void treure();//delete the last element

    public int tempsTotal();
}
