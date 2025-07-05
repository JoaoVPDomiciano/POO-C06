import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Clinica clinica = new Clinica("Clinica do guto");

            clinica.addConsultas(new Consulta(new Gato("Felix", 1987)));
            clinica.addConsultas(new Consulta(new Cachorro("Covarde", 2003)));
            clinica.addConsultas(new Consulta(new Passaro("Passarinho verde", 2020)));

            clinica.mostrarConsultas();

            clinica.getConsultas().get(0).veterinario.examinar(clinica.getConsultas().get(0).animal);
            clinica.getConsultas().get(1).veterinario.examinar(clinica.getConsultas().get(1).animal);
            clinica.getConsultas().get(2).veterinario.examinar(clinica.getConsultas().get(2).animal);

            System.out.print("O animal " + clinica.getConsultas().get(0).animal.nome + " possui ");
            Utils.calcularIdade(clinica.getConsultas().get(0).animal.anoNascimento);
            System.out.println(" anos");

            System.out.print("O animal " + clinica.getConsultas().get(1).animal.nome + " possui ");
            Utils.calcularIdade(clinica.getConsultas().get(1).animal.anoNascimento);
            System.out.println(" anos");

            System.out.print("O animal " + clinica.getConsultas().get(2).animal.nome + " possui ");
            Utils.calcularIdade(clinica.getConsultas().get(2).animal.anoNascimento);
            System.out.println(" anos");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}