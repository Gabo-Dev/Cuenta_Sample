/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author jhony
 */
public class Cuenta {
    private int saldo;
    private long accNum;
    public Cuenta(int saldo, long num)
    {
        this.saldo=saldo;
        this.accNum=num;
    }
    public int getBalance()
    {
        return 0;
    }
    public void depositar(int cantidad)
    {
        this.saldo=0;
    }
    public void retirar(int cantidad)
    {
        this.saldo=0;
    }
}
