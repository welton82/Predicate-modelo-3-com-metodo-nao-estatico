package application;

import entities.Produto;
import util.ProdutoPredicado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program {
   public static void main(String[] args) {

       List<Produto> lista = new ArrayList<>();
       lista.add(new Produto("Notebook",1500.60));
       lista.add(new Produto("fone de ouvido",50.00));
       lista.add(new Produto("Tv 29 Lg",3650.54));
       lista.add(new Produto("Armario Itatiaia",2506.30));
       System.out.println(lista.toString());
/*
       //expressao Lâmbda
       lista.removeIf(p -> p.getPreco()>=3000.00);
       System.out.println("=============");
       System.out.println(lista);
*/
       //ou
       System.out.println("=============");
       lista.removeIf(Produto::nonStaticProdutopredicate);//exclui preço > 2500.00
       System.out.println(lista);


    }
}
