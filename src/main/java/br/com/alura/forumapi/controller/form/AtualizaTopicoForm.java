package br.com.alura.forumapi.controller.form;

import br.com.alura.forumapi.model.Curso;
import br.com.alura.forumapi.model.Topico;
import br.com.alura.forumapi.repository.CursoRepository;
import br.com.alura.forumapi.repository.TopicoRepository;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AtualizaTopicoForm {

    @NotNull @NotEmpty @Length(min = 5)
    private String titulo;
    @NotNull @NotEmpty @Length(min = 10)
    private String mensagem;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Topico atualizar(Topico topico) {

        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);

        return topico;

    }
}
