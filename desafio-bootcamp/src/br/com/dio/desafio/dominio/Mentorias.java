package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorias extends Conteudo {


    private LocalDate data;

    public Mentorias(){

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
