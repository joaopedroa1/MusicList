import java.util.ArrayList;
public class MusicList{
    public static void main(String args[]){
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>(); //Declarando a lista e as músicas dela
        listaParaIlhaDeserta.add("Controllah");
        listaParaIlhaDeserta.add("Confessionario");
        listaParaIlhaDeserta.add("INTRO");
        listaParaIlhaDeserta.add("Heterogenia");
        listaParaIlhaDeserta.add("Clint Eastwood");
        listaParaIlhaDeserta.add("MAR");
        listaParaIlhaDeserta.add("Suicidal");
        System.out.println(listaParaIlhaDeserta); 
        System.out.println(listaParaIlhaDeserta.size()); //Vendo os números de músicas da lista e removendo até o número chegar em 5 
        listaParaIlhaDeserta.remove("Suicidal");
        listaParaIlhaDeserta.remove("Clint Eastwood");
        System.out.println(listaParaIlhaDeserta);
        String a = "INTRO";
        String b = "Controllah";
        String TempA = a;
        listaParaIlhaDeserta.set(0,TempA);
        listaParaIlhaDeserta.set(2,b);
        System.out.println(listaParaIlhaDeserta);
    }
}