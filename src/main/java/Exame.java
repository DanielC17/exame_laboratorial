public class Exame {
    private int Triglicerides;
    private int ColesterolTotal;
    private int ColesterolHDL;
    private int ColesterolLDL;
    private int ColesterolVLDL;
    private int Glicose;

    public void setTriglicerides(int triglicerides) {
        Triglicerides = triglicerides;
    }

    public void setColesterolTotal(int colesterolTotal) {
        ColesterolTotal = colesterolTotal;
    }

    public void setColesterolHDL(int colesterolHDL) {
        ColesterolHDL = colesterolHDL;
    }

    public void setColesterolLDL(int colesterolLDL) {
        ColesterolLDL = colesterolLDL;
    }

    public void setColesterolVLDL(int colesterolVLDL) {
        ColesterolVLDL = colesterolVLDL;
    }

    public void setGlicose(int glicose) {
        Glicose = glicose;
    }

    private void verificaValor(int valor){
        if(valor<=0){
            throw new IllegalArgumentException("Valor abaixo ou igual a zero");
        }
    }

    public String examinarTriglicerides (){
        int desejavel = 150;
        int limitrofe = 199;
        int alto = 499;

        this.verificaValor(this.Triglicerides);

        if (this.Triglicerides < desejavel){
            return "Nivel desejável";
        }
        else if (this.Triglicerides <= limitrofe){
            return "Nivel limitrofe";
        }
        else if (this.Triglicerides <= alto){
            return "Nivel alto";
        }
        else{
            return "Nivel muito alto";
        }
    }

    public String examinarColesterolTotal (){
        int desejavel = 200;
        int limitrofe = 239;

        this.verificaValor(this.ColesterolTotal);

        if (this.ColesterolTotal < desejavel){
            return "Nivel desejável";
        }
        else if (this.ColesterolTotal <= limitrofe){
            return "Nivel limitrofe";
        }
        else{
            return "Nivel elevado";
        }
    }

    public String examinarColesterolHDL (){
        int baixo = 40;
        int normal = 60;

        this.verificaValor(this.ColesterolHDL);

        if (this.ColesterolHDL < baixo){
            return "Nivel baixo";
        }
        else if (this.ColesterolHDL <= normal){
            return "Nivel normal";
        }
        else{
            return "Nivel desejável";
        }
    }

    public String examinarColesterolLDL(){
        int otimo = 100;
        int desejavel = 129;
        int limitrofe = 159;
        int alto = 189;

        this.verificaValor(this.ColesterolLDL);

        if(this.ColesterolLDL<otimo){
            return "Nivel otimo";
        }
        else if (this.ColesterolLDL <= desejavel){
            return "Nivel desejável";
        }
        else if (this.ColesterolLDL <= limitrofe){
            return "Nivel limitrofe";
        }
        else if (this.ColesterolLDL <= alto){
            return "Nivel alto";
        }
        else{
            return "Nivel muito alto";
        }
    }

    public String examinarColesterolVLDL(){
        int desejavel = 30;
        int limitrofe = 40;

        this.verificaValor(this.ColesterolVLDL);

        if (this.ColesterolVLDL < desejavel){
            return "Nivel desejável";
        }
        else if (this.ColesterolVLDL <= limitrofe){
            return "Nivel limitrofe";
        }
        else{
            return "Nivel elevado";
        }
    }

    public String examinarGlicose() {
        int hipoglicemia = 60;
        int desejavel = 99;
        int inapropriada = 125;

        this.verificaValor(this.Glicose);

        if (this.Glicose < hipoglicemia) {
            return "hipoglicemia";
        }
        else if (this.Glicose <= desejavel) {
            return "Nivel desejavel";
        }
        else if (this.Glicose <= inapropriada) {
            return "Glicemia de jejum inapropriada";
        }
        else {
            return "Diabetes";
        }
    }
}

