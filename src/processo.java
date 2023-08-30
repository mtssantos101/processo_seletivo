public class processo {
    public static void main(String[] args) {
        analisarCandidatura(1900.0);
        analisarCandidatura(2200.0);
        analisarCandidatura(2000.0);
    }

    static void analisarCandidatura (double salarioPretendido){
        double salarioBase= 2000.0;
        if (salarioBase>salarioPretendido)
            System.out.println("ligar para o candidato!!");
        else if (salarioBase==salarioPretendido)
            System.out.println("ligar para o candidato e fazer uma contra proposta");
        else {
            System.out.println("aguardando o resultado dos demais candidatos");}
    }
}
