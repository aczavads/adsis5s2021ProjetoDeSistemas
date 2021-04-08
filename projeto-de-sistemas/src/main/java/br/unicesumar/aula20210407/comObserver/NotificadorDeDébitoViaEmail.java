package br.unicesumar.aula20210407.comObserver;

public class NotificadorDeDébitoViaEmail implements CartãoDeCréditoListener {
    private String email = "";
    private EmailService emailService = new EmailService();

    public NotificadorDeDébitoViaEmail(String email) {
        this.email = email;
    }

    @Override
    public void débitoEfetuado(double valorDebitado) {
        emailService.sendMessage(email, "Débito em seu cartão", "Seu cartão foi debitado em " + valorDebitado + ".");        
    }

}
