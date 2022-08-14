package happyfamily;

import static org.junit.jupiter.api.Assertions.*;
import happyfamily.abstracts.Pet;
import happyfamily.pets.Dog;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class PetTest {
    private Pet Dog;

    @BeforeEach
    void init() {
        Dog = new Dog( "Cloud",1, 8, new String[]{"playing","eating" , "walking"});

    }

    @Test
    void testPetEqual() {
        Pet Dog2 = new Dog ( "Cloud", 1, 8, new String[]{"playing","eating" , "walking"});
        assertEquals(Dog, Dog2);
    }

    @Test
    void testPetNonEqual(){
        Pet Dog2 = new Dog ( "Cloude", 1, 1, new String[]{"eating"});
        assertNotEquals(Dog, Dog2);
    }
}