package ClaseTest.Test;


import ClaseTest.Persona.Persona;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
 static Persona personaPrueba= new Persona("Juan", "Perez", "JuanPerez@gmail.com", 17);

 @BeforeAll
    static void fechaDeHoy(){
  LocalDate date = LocalDate.now()  ;
  System.out.println( "esto ocurre antes " + date); }

    @Tag("ProbarAtributosClasePersona")
   @Test
    void setUp() {
    }
    @Tag("ProbarAtributosClasePersona")
  @Test
    void mostrarNombre() {
  assertEquals(personaPrueba.mostrarNombre(),"Perez, Juan");
   System.out.println(personaPrueba.mostrarNombre());
    }
        @Tag("ProbarAtributosClasePersona")
    @Test
    void mayoriaDeEdad() {
  //assertTrue(personaPrueba.mayoriaDeEdad(),"Verificar si es mayor de edad.");
  assertFalse(personaPrueba.mayoriaDeEdad(),"Verificar si es menor de edad.");
    }
    @Tag("ProbarAtributosClasePersona")
  @Test
    @Disabled
    void setEdadNulo() {
     assertThrows(InputMismatchException.class,personaPrueba.setEdad(-1));
    }
        @Tag("ProbarAtributosClasePersona")
    @AfterAll
    static void finalDeTodo(){
        System.out.println("hola, fin de los test");
    }
}