package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
    //public void inclui(Filme f){
    //this.tempoTotal += f.getDuracaoEmMinutos();
    //}
    //public void inclui(Serie s){
    //    this.tempoTotal += s.getDuracaoEmMinutos();
    //}
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
        //em vez de incluir separadamente serie, filme e etc, eu uso só a superclasse Titulo
    }

}
