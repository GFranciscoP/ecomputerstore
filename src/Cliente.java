/*-----------------MC322---------------*/
/* Projeto: eComputerStore             */
/* Grupo: Angelo H Barbosa      166527 */
/*        Franscisco G Pena     234589 */
/*        Guilherme H Pascon    235980 */
/*        Luís Felipe L B Silva 156441 */
/*                                     */
/* Data: dez 2020                      */
/*-------------------------------------*/

import java.util.ArrayList;

/*----- Classe Cliente -----*/
/* Objetivo: */
/*--------------------------*/


public class Cliente {
    private static int quantCliente = 0;
    private float saldo;
    private ArrayList<Produto> carrinho;
    private int id;
    private String nome;

    public Cliente(float saldo, ArrayList<Produto> carrinho, String nome) {
        quantCliente++;
        this.id = getQuantCliente();
        
        this.saldo = saldo;
        this.carrinho = carrinho;
        this.nome = nome;
    }

    public static int getQuantCliente() {
        return quantClient;
    }

    public static void setQuantClient(int quantCliente) {
        Cliente.quantClient = quantClient;
    }
    
    

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
