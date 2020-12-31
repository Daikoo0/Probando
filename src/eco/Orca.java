package eco;

public class Orca extends Peces {
    
    public Orca(){
        
        Nombre = "Orca";
        InicialN = "O";
        Depredar = 6;
        Especie = 6;
        AlimentacionMin = 11;
        AlimentacionMax = 16;
        Reproduccion = 15;
        EsperanzaVida = 30;
        HambreAct = 0;
        VidaAct = 0;
        ReproduccionAct = 0;
        
    }
    
    @Override
    public void Restablecer(){
        
        this.HambreAct = 0;
        this.VidaAct = 0;
        this.ReproduccionAct = 0;
    }
    
    @Override
    public int GetReproduccionAct(){
        return ReproduccionAct;
    }
    
    @Override
    public int GetReproduccion(){
        return Reproduccion;
    }
    
    @Override
    public void DarRepro(){
        this.ReproduccionAct++;
    }
    
    @Override
    public void VidaA() {
        this.VidaAct++;
    }
    
    @Override
    public int GetVidaAct(){
        return VidaAct;
    }
    
    @Override
    public int GetDepredar() {
        return Depredar;
    }
    
    @Override
    public void Mover(){
    }

    @Override
    public void Comer() {    
    }

    @Override
    public void Reproducir() {
    }

    @Override
    public void Muerte() {
    }
    
    @Override
    public String GetNombre(){
        return Nombre;
    }
    
    @Override
    public int GetAlimentacionMax(){
        return AlimentacionMax;
    }
    
    @Override
    public int GetAlimentacionMin(){
        return AlimentacionMin;
    }
    
    @Override
    public int GetHambreAct(){
        return HambreAct;
    }
    
    @Override
    public int GetEsperanzaVida(){
        return EsperanzaVida;
    }
    
    @Override
    public void DarHambre(){
        this.HambreAct++;
    }
    
    @Override
    public void RestHambre(){
        this.HambreAct = 0;
    }
}