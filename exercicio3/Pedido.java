package introducao.exercicio3;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private long id;
    private Date data;
    private Comprador cliente;
    private ArrayList<ItemPedido> listaItens = new ArrayList<>();

    
    public Comprador getCliente() {
    return cliente;
    }
    public ArrayList<ItemPedido> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }
    public void setCliente(Comprador cliente) {
        this.cliente = cliente;
    }
    public float calcValorTotal() {
        //para cada umItem dentro de listaItens -> pega o cara e entra no bloco
        float valorTotal = 0;
        for(ItemPedido umItem : listaItens){
            var valorItem = umItem.getQuantidade() * umItem.getValorVenda();
            valorTotal += valorItem;
            }
        return valorTotal;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    
    float calcValorTotal;

    
}
