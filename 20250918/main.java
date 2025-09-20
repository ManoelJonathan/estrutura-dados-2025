import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
       Automovel car1 = new Automovel("Fusca", "Volkswagen", 1968, "preto", 4, 10000.0);
       Automovel car2 = new Automovel("Civic", "Honda", 2020, "branco", 4, 90000.0);
       Automovel car3 = new Automovel("Model S", "Tesla", 2021, "vermelho", 4, 200000.0);

       ArvoreBinaria<Automovel> arvore = new ArvoreBinaria<>();
       arvore.inserir(car1);
       arvore.inserir(car2);
       arvore.inserir(car3);

      arvore.imprimeEmOrdem();
    }
}
