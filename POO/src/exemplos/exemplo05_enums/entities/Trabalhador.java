package exemplos.exemplo05_enums.entities;

import exemplos.exemplo05_enums.entities.enums.NivelDoTrabalhahor;

import java.util.ArrayList;
import java.util.Calendar;

public class Trabalhador {

    private String nome;
    private NivelDoTrabalhahor nivel;
    private Double salarioBase;

    private Departamento departamento;
    private ArrayList<ContratoPorHora> contratos = new ArrayList<>();

    public Trabalhador() {

    }

    public Trabalhador(String nome, NivelDoTrabalhahor nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelDoTrabalhahor getNivel() {
        return nivel;
    }

    public void setNivel(NivelDoTrabalhahor nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public ArrayList<ContratoPorHora> getContratos() {
        return contratos;
    }

    public void addContrato(ContratoPorHora contrato) {
        this.contratos.add(contrato);
    }

    public void removeContrato(ContratoPorHora contrato){
        this.contratos.remove(contrato);
    }

    public double ganhos(int ano, int mes) {
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (ContratoPorHora c : contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if(ano == c_ano && mes == c_mes){
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
