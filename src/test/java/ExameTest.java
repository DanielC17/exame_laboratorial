import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExameTest {
    @Test
    public void devetestarvalorzero(){
        try{
            Exame exame = new Exame();
            exame.setTriglicerides(0);
            exame.examinarTriglicerides();
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Valor abaixo ou igual a zero", e.getMessage());
        }
    }

    @Test
    public void devetestarTrigliceridesBaixo(){
        Exame exame = new Exame();
        exame.setTriglicerides(149);
        assertEquals("Nivel desejável", exame.examinarTriglicerides());
    }

    @Test
    public void deveTestarTrigliceridesLimitrofe(){
        Exame exame = new Exame();
        exame.setTriglicerides(199);
        assertEquals("Nivel limitrofe", exame.examinarTriglicerides());
    }
    @Test
    public void deveTestarTrigliceridesAlto(){
        Exame exame = new Exame();
        exame.setTriglicerides(499);
        assertEquals("Nivel alto", exame.examinarTriglicerides());
    }
    @Test
    public void deveTestarTrigliceridesMuitoAlto(){
        Exame exame = new Exame();
        exame.setTriglicerides(500);
        assertEquals("Nivel muito alto", exame.examinarTriglicerides());
    }
    @Test
    public void deveTestarColesterolTotaldesejavel(){
        Exame exame = new Exame();
        exame.setColesterolTotal(199);
        assertEquals("Nivel desejável", exame.examinarColesterolTotal());
    }
    @Test
    public void deveTestareColesterolTotalLimitrofe(){
        Exame exame = new Exame();
        exame.setColesterolTotal(239);
        assertEquals("Nivel limitrofe", exame.examinarColesterolTotal());
    }
    @Test
    public void deveTestarColesterolTotalElevado(){
        Exame exame = new Exame();
        exame.setColesterolTotal(240);
        assertEquals("Nivel elevado", exame.examinarColesterolTotal());
    }
    @Test
    public void deveTestarColesterolHDLBaixo(){
        Exame exame = new Exame();
        exame.setColesterolHDL(39);
        assertEquals("Nivel baixo", exame.examinarColesterolHDL());
    }
    @Test
    public void deveTestarColesterolHDLNormal(){
        Exame exame = new Exame();
        exame.setColesterolHDL(60);
        assertEquals("Nivel normal", exame.examinarColesterolHDL());
    }
    @Test
    public void deveTestarColesterolHDLDesejavel(){
        Exame exame = new Exame();
        exame.setColesterolHDL(61);
        assertEquals("Nivel desejável", exame.examinarColesterolHDL());
    }
    @Test
    public void deveTestarColesterolLDLOtimo(){
        Exame exame = new Exame();
        exame.setColesterolLDL(99);
        assertEquals("Nivel otimo", exame.examinarColesterolLDL());
    }
    @Test
    public void deveTestarColesterolLDLDesejavel(){
        Exame exame = new Exame();
        exame.setColesterolLDL(129);
        assertEquals("Nivel desejável", exame.examinarColesterolLDL());
    }
    @Test
    public void deveTestarColesterolLDLLimitrofe(){
        Exame exame = new Exame();
        exame.setColesterolLDL(159);
        assertEquals("Nivel limitrofe", exame.examinarColesterolLDL());
    }
    @Test
    public void deveTestarColesterolLDLAlto(){
        Exame exame = new Exame();
        exame.setColesterolLDL(189);
        assertEquals("Nivel alto", exame.examinarColesterolLDL());
    }
    @Test
    public void deveTestarColesterolLDLMuitoAlto(){
        Exame exame = new Exame();
        exame.setColesterolLDL(190);
        assertEquals("Nivel muito alto", exame.examinarColesterolLDL());
    }
    @Test
    public void deveTestarColesterolVLDLdesejavel(){
        Exame exame = new Exame();
        exame.setColesterolVLDL(29);
        assertEquals("Nivel desejável", exame.examinarColesterolVLDL());
    }
    @Test
    public void deveTestarColesterolVLDLLimitrofe(){
        Exame exame = new Exame();
        exame.setColesterolVLDL(40);
        assertEquals("Nivel limitrofe", exame.examinarColesterolVLDL());
    }
    @Test
    public void deveTestarColesterolVLDLElevado(){
        Exame exame = new Exame();
        exame.setColesterolVLDL(41);
        assertEquals("Nivel elevado", exame.examinarColesterolVLDL());
    }
    @Test
    public void deveTestarGlicoseHipoglicemia(){
        Exame exame = new Exame();
        exame.setGlicose(59);
        assertEquals("hipoglicemia", exame.examinarGlicose());
    }
    @Test
    public void deveTestarGlicosedesejavel(){
        Exame exame = new Exame();
        exame.setGlicose(99);
        assertEquals("Nivel desejavel", exame.examinarGlicose());
    }
    @Test
    public void deveTestarGlicoseInapropriada(){
        Exame exame = new Exame();
        exame.setGlicose(125);
        assertEquals("Glicemia de jejum inapropriada", exame.examinarGlicose());
    }
    @Test
    public void deveTestarGlicoseDiabetes(){
        Exame exame = new Exame();
        exame.setGlicose(126);
        assertEquals("Diabetes", exame.examinarGlicose());
    }
}