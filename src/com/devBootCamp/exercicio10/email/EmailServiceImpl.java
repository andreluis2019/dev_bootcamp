package com.devBootCamp.exercicio10.email;

public class EmailServiceImpl implements EmailService {

    @Override
    public void enviarEmail(Email email) {
        if (email.getDe() == null) {
            throw new RuntimeException("Remetente nao informado");
        }
        System.out.println("Email enviado de: " + email.getDe() + " para: " + email.getPara());
    }
}
