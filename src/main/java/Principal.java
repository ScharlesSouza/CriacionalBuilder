import model.ProdutoBuilder;
import model.Vendedor;
import model.VendedorBuilder;

public class Principal {
    public static void main(String[] args) {
        ProdutoBuilder builder = new ProdutoBuilder("TV", "TV 55 polegadas",2000, "Eletronico", new VendedorBuilder().nome("vendedor1").build());
        try {
            var produto = builder.modelo("Smart TV")
                    .marca("LG")//se remover ou comentar esse parametro vai retornar uma msg de erro.
                    .preco(2000)
                    .build();

            System.out.println(produto.toString());

        }catch (Exception erro){
            System.out.println(erro.getMessage());

        }
    }
}
