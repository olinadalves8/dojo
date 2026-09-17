package src.enumeracoes;


public class ClientTest {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("tsubasa",TipoCliente.PESSOA_FISICA,TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("viado",TipoCliente.PESSOA_JURIDICA,TipoPagamento.DEBITO);
        

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        
        TipoCliente tipocliente =  TipoCliente.valueOf("PESSOA_FISICA");

        System.out.println(tipocliente.getNomeRelatorio());


        System.out.println("------------------------");


          
        TipoCliente tipocliente2 =  TipoCliente.tipoClientPorNomeRelatorio("pessoa FISICA");
        System.out.println(tipocliente2);
        

    }
}
