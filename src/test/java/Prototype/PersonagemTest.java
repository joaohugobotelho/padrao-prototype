package Prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemTest {

    @Test
    public void deveClonarPersonagem() throws CloneNotSupportedException {

        Personagem original = new Personagem("Ninja", 100);

        Personagem clone = original.clone();

        assertEquals(original.getNome(), clone.getNome());
        assertEquals(original.getVida(), clone.getVida());

        assertNotSame(original, clone);
    }
}