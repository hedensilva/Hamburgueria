
package modelo;

public class Produto {

    /**
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the nomeDistribuidora
     */
    public String getNomeDistribuidora() {
        return nomeDistribuidora;
    }

    /**
     * @param nomeDistribuidora the nomeDistribuidora to set
     */
    public void setNomeDistribuidora(String nomeDistribuidora) {
        this.nomeDistribuidora = nomeDistribuidora;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    private int id;
    private String nomeProduto;
    private String nomeDistribuidora;
    private String quantidade;
    private String data;
}
