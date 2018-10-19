/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infra;

public class MemoriaRAM implements Interface_Dados {

    private MemoriaRAM() {
    }
    public static MemoriaRAM arquivo = null;

    public static MemoriaRAM getInstance() {
        if (arquivo == null) {
            arquivo = new MemoriaRAM();
        }
        return arquivo;
    }

    @Override
    public void adicionar(String arquivo) {
        System.out.println(" Adicionando " + arquivo + " armazenado em RAM");
    }

    @Override
    public void remover(String arquivo) {
        System.out.println(" Removendo " + arquivo + " armazenado em RAM");
    }

    @Override
    public void consultar(String arquivo) {
        System.out.println(" Consultando" + arquivo + " armazenado em RAM");
    }

    @Override
    public void ler(String arquivo) {
        System.out.println(" Lendo " + arquivo + " armazenado em RAM");
    }

}
