package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNull;

public class AgendaTest {
    private Agenda a;

    @BeforeEach
    void setUp() {
        List<Evento> e = new ArrayList<>();
        a = new Agenda(e);
    }

    @Test
    void constroi() {
        assertNull(a);
    }
}
