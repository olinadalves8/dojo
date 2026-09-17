package src.enumeracoes;

public enum TipoCliente {
    PESSOA_FISICA(1,"pessoa FISICA"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public int valor;
    private String nomeRelatorio;

    private TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientPorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values ()){
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }

        }
        return null;

    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    

}
