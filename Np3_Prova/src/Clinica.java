import java.util.ArrayList;
import java.util.List;

public class Clinica {
    public String nome;
    private List<Consulta> consultas = new ArrayList<>();

    public Clinica(String nome) {
        this.nome = nome;
    }

    public void addConsultas(Consulta consulta) {
        consultas.add(consulta);
    }

    public void mostrarConsultas(){
        for (Consulta elemento: this.consultas){
            System.out.println("Animal: " + elemento.animal.nome + "(" + elemento.animal.anoNascimento + ") - Veterinario: " + elemento.veterinario.nome);
        }
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
}
