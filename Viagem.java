package testee;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private String numeroOnibus;
    private String origem;
    private String destino;
    private String horaPartida;
    private String horaChegada;
    private int maxPassageiros;
    private List<Passageiro> passageirosReservados;

    public Viagem(String numeroOnibus, String origem, String destino, String horaPartida, String horaChegada, int maxPassageiros) {
        this.numeroOnibus = numeroOnibus;
        this.origem = origem;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.maxPassageiros = maxPassageiros;
        this.passageirosReservados = new ArrayList<>();
    }

    public String getNumeroOnibus() {
        return numeroOnibus;
    }

    public List<Passageiro> getPassageirosReservados() {
        return passageirosReservados;
    }

    public boolean adicionarReserva(String assento, Passageiro passageiro) {
        if (passageirosReservados.size() < maxPassageiros) {
            passageirosReservados.add(passageiro);
            return true;
        }
        return false;
    }

    public boolean fazerCheckin(Passageiro passageiro) {
        return passageirosReservados.contains(passageiro);
    }

    public String exibirInformacoes() {
        return String.format("Ônibus %s: %s para %s, Partida: %s, Chegada: %s, Passageiros: %d/%d", numeroOnibus, origem, destino, horaPartida, horaChegada, passageirosReservados.size(), maxPassageiros);
    }

    @Override
    public String toString() {
        return numeroOnibus + "," + origem + "," + destino + "," + horaPartida + "," + horaChegada + "," + maxPassageiros;
    }
}
